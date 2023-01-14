package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import JDBC.CictOracleDataSource;
import vue.FenAjoutLocataire;
import vue.FenLocataires;

public class GestionLocataire implements ActionListener, ListSelectionListener{
	
	private FenLocataires fenLocataires;
	private Connection connexion;
	
	public GestionLocataire(FenLocataires fenLocataires) {
		this.fenLocataires = fenLocataires;
		
		try {
			CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
			this.connexion = CictOracleDataSource.getConnexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Ajouter un locataire":
			FenAjoutLocataire fenAjoutLocataire = new FenAjoutLocataire();
			fenAjoutLocataire.setVisible(true);		
			break;
		case "Charger":
			try {		
				String reqSelectionLocataires = "Select * "
						+ "FROM S3_LOCATAIRE";
				Statement st = this.connexion.createStatement();
				ResultSet res = st.executeQuery(reqSelectionLocataires);
				int i = 0;
				while(res.next()) {
					ecrireLigneTable(i, res);
					i++;
				}
			} catch(SQLException exception) {
				exception.printStackTrace();
			}
		}	
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int ligneSelectionnee = this.fenLocataires.getTableLocataires().getSelectedRow();
		if(ligneSelectionnee < 0) {
			System.out.println("Aucune ligne sélectionnée");
			this.fenLocataires.getDetailsLocataire().setVisible(false);
		} else {
			DefaultTableModel modeleTableLocataire = (DefaultTableModel) this.fenLocataires.getTableLocataires().getModel();
			
			String identifiantLocataire = (String) modeleTableLocataire.getValueAt(ligneSelectionnee, 0);
			try {
				String reqSelectionLocataire = "Select * from S3_LOCATAIRE where ID_LOCATAIRE = ?" ;
				PreparedStatement st = this.connexion.prepareStatement(reqSelectionLocataire);
				st.setString(1, identifiantLocataire);
				ResultSet res = st.executeQuery();
				//Récupération données du locataire.
				while(res.next()) {
					this.fenLocataires.getDetailsLocataire().setIdLocataire(res.getInt("ID_LOCATAIRE"));
					this.fenLocataires.getDetailsLocataire().setEmail(res.getString("EMAIL"));
					
					this.fenLocataires.getDetailsLocataire().setNom(res.getString("NOM"));
					this.fenLocataires.getDetailsLocataire().setPrenom(res.getString("PRENOM"));
					this.fenLocataires.getDetailsLocataire().setTelephone(Integer.toString(res.getInt("TEL")));
					SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
					String dateString = formatDate.format(res.getDate("DATE_NAISSANCE"));
					this.fenLocataires.getDetailsLocataire().setDateNaissance(dateString);
					this.fenLocataires.getDetailsLocataire().setAncienLocataire(res.getString("ANCIEN_LOCATAIRE"));
				}
				
				//Requête Pour récupérer l'adresse et le loyer du bien louer par le locataire
				String reqLoyerAdresse = "Select bien.Loyer, l.Adresse, l.VILLE, l.CP, l.NUMERO from S3_LOCATION l, S3_LOUER lo, S3_BIEN_IMMOBILIER bien "
						+ "where lo.ID_LOCATAIRE = ? "
						+ "and lo.ID_LOCATION = l.id_Location "
						+ "and l.ADRESSE = bien.ADRESSE "
						+ "and l.VILLE = bien.VILLE "
						+ "and l.NUMERO = bien.numero "
						+ "and l.CP = bien.CP";
				PreparedStatement stLoyerAdresse = this.connexion.prepareStatement(reqLoyerAdresse);
				stLoyerAdresse.setInt(1, Integer.parseInt(identifiantLocataire));
				ResultSet res2 = stLoyerAdresse.executeQuery();
				
				//Récupération données du bien louer. L'adresse et le loyer.
				float Loyer = 0;
				String adresse = "";
				while(res2.next()) {
					if(Loyer < res2.getFloat("LOYER")) {
						Loyer = res2.getFloat("LOYER");
						adresse = res2.getString("ADRESSE");
					}
				}
				if(!adresse.isBlank()) {
					this.fenLocataires.getDetailsLocataire().setLoyer(Float.toString(Loyer));
					this.fenLocataires.getDetailsLocataire().setAdresse(adresse);
				} else {
					this.fenLocataires.getDetailsLocataire().setLoyer("Sans loyer");
					this.fenLocataires.getDetailsLocataire().setAdresse("Sans adresse");
				}
			} catch(SQLException exception) {
				exception.printStackTrace();
			}
			this.fenLocataires.getDetailsLocataire().setVisible(true);
		}
	}
	
	public void ecrireLigneTable(int numeroLigne, ResultSet res) throws SQLException {
		DefaultTableModel modeleTable = (DefaultTableModel) this.fenLocataires.getTableLocataires().getModel();
		modeleTable.setValueAt(res.getString("ID_LOCATAIRE"), numeroLigne, 0);
		modeleTable.setValueAt(res.getString("NOM"), numeroLigne, 1);
		modeleTable.setValueAt(res.getString("PRENOM"), numeroLigne, 2);
		modeleTable.setValueAt(res.getInt("TEL"), numeroLigne, 3);
		modeleTable.setValueAt(res.getString("EMAIL"), numeroLigne, 4);
		modeleTable.setValueAt(res.getDate("DATE_NAISSANCE"), numeroLigne, 5);
		modeleTable.setValueAt(res.getFloat("DEPOT_GARANTIE"), numeroLigne, 6);
		modeleTable.setValueAt(res.getString("ANCIEN_LOCATAIRE"), numeroLigne, 7);
		modeleTable.setValueAt(res.getFloat("PART_POSSESSION"), numeroLigne, 8);
	}
}
