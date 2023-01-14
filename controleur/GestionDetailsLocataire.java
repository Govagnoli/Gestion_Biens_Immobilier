package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import JDBC.CictOracleDataSource;
import modele.Garant;
import modele.Locataire;
import vue.DetailsLocataire;
import vue.FenAjoutLocataire;
import vue.FenGarant;
import vue.FenModifierLocataire;
import vue.FenQuittances;

public class GestionDetailsLocataire implements ActionListener, ListSelectionListener{

	private DetailsLocataire detailLocataire;
	private Connection connexion;
	
	public GestionDetailsLocataire(DetailsLocataire detailLocataire) {
		this.detailLocataire = detailLocataire;
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
		case "Les Quittances de Loyer":
			FenQuittances fenQuittance = new FenQuittances();
			fenQuittance.setVisible(true);
			break;
		case "Modifier":
			FenModifierLocataire fenModifierLocataire = new FenModifierLocataire();
			fenModifierLocataire.setVisible(true);
			break;
		case "Charger les tableaux": //Erreur, à compléter
			try {
				//MAJ tableau Garant
				Locataire locataire = new Locataire(this.detailLocataire.getIdLocataire());
				LinkedList<Garant> garants = locataire.garants();
				int i = 0;
				for(Garant g: garants) {
					ecrireLigneTableGarant(i, g);
					i++;
				}
				
				//MAJ tableau Colocataire
				LinkedList<Locataire> colocataires = locataire.colocataires();
				if(colocataires != null) {
					i = 0;
					for(Locataire l: colocataires) {
						ecrireLigneTableColocataire(i, l);
						i++;
					}
				}				
			}catch(SQLException exception) {
				exception.printStackTrace();
			}
		}
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int ligneSelectionnee = this.detailLocataire.getTableGarant().getSelectedRow();
		if(ligneSelectionnee < 0) {
		}else {
			FenGarant fenGarant = new FenGarant();
			fenGarant.setVisible(true);
		}		
	}
	
	public void ecrireLigneTableGarant(int numeroLigne, Garant garant) throws SQLException {
		DefaultTableModel modeleTable = (DefaultTableModel) this.detailLocataire.getTableGarant().getModel();
		modeleTable.setValueAt(garant.getNom(), numeroLigne, 0);
	}
	
	public void ecrireLigneTableColocataire(int numeroLigne, Locataire locataire) throws SQLException {
		DefaultTableModel modeleTable = (DefaultTableModel) this.detailLocataire.getTableGarant().getModel();
		modeleTable.setValueAt(locataire.getNom(), numeroLigne, 0);
		modeleTable.setValueAt(locataire.getPrenom(), numeroLigne, 1);
	}
}
