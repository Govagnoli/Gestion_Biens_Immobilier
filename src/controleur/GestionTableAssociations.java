package controleur;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vue.FenInformationsPersonelles;

public class GestionTableAssociations implements ListSelectionListener{
	private FenInformationsPersonelles fen;
	
	public GestionTableAssociations(FenInformationsPersonelles fen) {
		this.fen = fen;
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
