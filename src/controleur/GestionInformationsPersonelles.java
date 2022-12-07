package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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
}
