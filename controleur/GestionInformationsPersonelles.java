package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import dao.DaoAssociations;
import modele.Association;
import modele.Locataire;
import vue.FenAjoutAssociation;
import vue.FenInformationsPersonelles;
import vue.FenTelecharger;

public class GestionInformationsPersonelles implements ActionListener, ListSelectionListener{
	
	private FenInformationsPersonelles fen;

	public GestionInformationsPersonelles(FenInformationsPersonelles fen) {
		this.fen = fen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Ajouter":
			FenAjoutAssociation fenAjoutAssociation = new FenAjoutAssociation();
			fenAjoutAssociation.setVisible(true);
			break;
		case "Supprimer":
			//Supprime l'élément sélectionné
			break;
		case "Telecharger":
			FenTelecharger fenTelecharger = new FenTelecharger();
			fenTelecharger.setVisible(true);
			break;
		}
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int ligneSelectionnee = this.fen.getTableAssociations().getSelectedRow();
		if(ligneSelectionnee < 0) {
			System.out.println("Aucune ligne selectionnee");
		} else {
			this.fen.getBtnModifierAssociation().setVisible(true);
		}
	}
	
	public void chargerTableauAssociation() {
		try {
			DaoAssociations daoAssociations = new DaoAssociations();
			List<Association> associations = daoAssociations.findAll();
			int i = 0;
			for(Association association: associations) {
				ecrireLigneTableAssociations(i, association);
				i++;
			}
		} catch (SQLException e) {
			System.out.println("Erreur : problème pour charger le tableau des associations");
			e.printStackTrace();
		}
		
	}
	
	public void ecrireLigneTableAssociations(int numeroLigne, Association association) throws SQLException {
		DefaultTableModel modeleTable = (DefaultTableModel) this.fen.getTableAssociations().getModel();
		modeleTable.setValueAt(association.getLibelle(), numeroLigne, 0);
		modeleTable.setValueAt(association.getSiren(), numeroLigne, 1);
		modeleTable.setValueAt(association.getDateDonation(), numeroLigne, 2);
		modeleTable.setValueAt(association.getMontantDonation(), numeroLigne, 3);
	}
	
}
