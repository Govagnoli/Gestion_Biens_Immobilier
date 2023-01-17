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
import modele.BienImmobilier;
import modele.Location;
import vue.FenAjoutBien;
import vue.FenLocations;

public class GestionLocations implements ActionListener, ListSelectionListener{

	private FenLocations fenLocations;
		
	public GestionLocations(FenLocations fenLocations) {
		this.fenLocations = fenLocations;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Charger":
			try {
				CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
				Connection connexion = CictOracleDataSource.getConnexion();			
				String reqSelectionLocations = 
						"Select S3_LOCATIONS.NUMERO, S3_LOCATIONS.ADRESSE, S3_LOCATAIRE.NOM,"
						+ "S3_LOCATAIRE.PRENOM, S3_LOCATIONS.DATE_DEBUT_CONTRAT"
						+ "FROM S3_LOCATIONS, S3_LOUER, S3_LOCATAIRE"
						+ "WHERE S3_LOCATIONS.id_location = S3_LOUER.id_location"
						+ "AND S3_LOUER.id_locataire = S3_LOCATAIRE.id_locataire";
				Statement st = connexion.createStatement();
				ResultSet res = st.executeQuery(reqSelectionLocations);
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
		int ligneSelectionnee = this.fenLocations.getTableLocation().getSelectedRow();
		if(ligneSelectionnee < 0) {
			System.out.println("Aucune ligne selectionnée");
			this.fenLocations.getDetailslocation().setVisible(false);
		} else {
			DefaultTableModel modeleTableLocation = (DefaultTableModel) this.fenLocations.getTableLocation().getModel();
			this.fenLocations.getDetailslocation().setVisible(true);
			String adresse = modeleTableLocation.getValueAt(ligneSelectionnee, 0).toString();
			Location location = null;
			this.fenLocations.getDetailslocation().setVisible(true);
		}
	}
	
	public void ecrireLigneTable(int numeroLigne, ResultSet res) throws SQLException {
		DefaultTableModel modeleTable = this.fenLocations.getModelTableLocation();
		modeleTable.setValueAt(res.getInt("NUMERO"), numeroLigne, 0);
		modeleTable.setValueAt(res.getString("ADRESSE"), numeroLigne, 1);
		modeleTable.setValueAt(res.getString("NOM"), numeroLigne, 2);
		modeleTable.setValueAt(res.getString("PRENOM"), numeroLigne, 3);
		modeleTable.setValueAt(res.getDate("DATE_DEBUT_CONTRAT"), numeroLigne, 4);
	}
}
