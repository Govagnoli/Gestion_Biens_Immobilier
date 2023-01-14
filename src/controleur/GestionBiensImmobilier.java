package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import JDBC.CictOracleDataSource;
import modele.BienImmobilier;
import oracle.jdbc.pool.OracleDataSource;
import vue.FenAjoutBien;
import vue.FenBiensImmobilier;

public class GestionBiensImmobilier implements ActionListener, ListSelectionListener{
	
 private FenBiensImmobilier fenBiens;
	
	public GestionBiensImmobilier(FenBiensImmobilier fenBiens) {
		this.fenBiens = fenBiens;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Ajouter un bien":
			FenAjoutBien fenAjoutBien = new FenAjoutBien();
			fenAjoutBien.setVisible(true);
			break;
		case "Charger":
			try {
				CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
				Connection connexion = CictOracleDataSource.getConnexion();			
				String reqSelectionBiensImmobiliers = "Select VILLE, ADRESSE, CP, NUMERO, SUPERFICIE, GARAGE, LOYER "
						+ "FROM S3_BIEN_IMMOBILIER";
				Statement st = connexion.createStatement();
				ResultSet res = st.executeQuery(reqSelectionBiensImmobiliers);
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
		int ligneSelectionnee = this.fenBiens.getTableBien().getSelectedRow();
		if(ligneSelectionnee < 0) {
			System.out.println("Aucune ligne selectionnée");
			this.fenBiens.getDetailsBien().setVisible(false);
		} else {
			DefaultTableModel modeleTableBien = (DefaultTableModel) this.fenBiens.getTableBien().getModel();
			this.fenBiens.getDetailsBien().setVisible(true);
			String ville = modeleTableBien.getValueAt(ligneSelectionnee, 0).toString();
			String adresse = modeleTableBien.getValueAt(ligneSelectionnee, 1).toString();
			String cp = modeleTableBien.getValueAt(ligneSelectionnee, 2).toString();
			String numero = modeleTableBien.getValueAt(ligneSelectionnee, 3).toString();
			BienImmobilier bien = null;
			try {
				bien = new BienImmobilier(adresse, ville, Integer.parseInt(cp), Integer.parseInt(numero));
				this.fenBiens.getDetailsBien().setBien(bien);
				this.fenBiens.getDetailsBien().setLabelAdresse(adresse);
				this.fenBiens.getDetailsBien().setLabelLoyerEtNbrLocataire(Float.toString(bien.getLoyer()),bien.getGarage());
				this.fenBiens.getDetailsBien().setVisible(true);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void ecrireLigneTable(int numeroLigne, ResultSet res) throws SQLException {
		DefaultTableModel modeleTable = this.fenBiens.getModelTableBien();
		modeleTable.setValueAt(res.getString("VILLE"), numeroLigne, 0);
		modeleTable.setValueAt(res.getString("ADRESSE"), numeroLigne, 1);
		modeleTable.setValueAt(res.getInt("CP"), numeroLigne, 2);
		modeleTable.setValueAt(res.getInt("NUMERO"), numeroLigne, 3);
		modeleTable.setValueAt(res.getFloat("SUPERFICIE"), numeroLigne, 4);
		modeleTable.setValueAt(res.getString("GARAGE"), numeroLigne, 5);
		modeleTable.setValueAt(res.getFloat("LOYER"), numeroLigne, 6);
	}
}
