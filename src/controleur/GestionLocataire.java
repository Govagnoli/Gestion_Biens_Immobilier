package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import JDBC.CictOracleDataSource;
import vue.FenAjoutLocataire;
import vue.FenLocataires;

public class GestionLocataire implements ActionListener, ListSelectionListener{
	
	private FenLocataires fenLocataires;
	
	public GestionLocataire(FenLocataires fenLocataires) {
		this.fenLocataires = fenLocataires;
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
				CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
				Connection connexion = CictOracleDataSource.getConnexion();			
				String reqSelectionLocataire = "Select * "
						+ "FROM S3_LOCATAIRE";
				Statement st = connexion.createStatement();
				ResultSet res = st.executeQuery(reqSelectionLocataire);
				int i = 0;
				while(res.next()) {
					ecrireLigneTable(i, res);
					i++;
				}
				connexion.close();
			} catch(SQLException exception) {
				exception.printStackTrace();
			}
		}
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int ligneSelectionnee = this.fenLocataires.getTableLocataires().getSelectedRow();
		if(ligneSelectionnee < 0) {
			System.out.println("Aucune ligne s�lectionn�e");
			this.fenLocataires.getDetailsLocataire().setVisible(false);
		} else {
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
