package controleur;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vue.DetailsLocataire;
import vue.FenGarant;

public class GestionTableGarant implements ListSelectionListener {
	
	private DetailsLocataire detailLocataire;
	
	public GestionTableGarant(DetailsLocataire detailLocataire) {
		this.detailLocataire = detailLocataire;
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
}
