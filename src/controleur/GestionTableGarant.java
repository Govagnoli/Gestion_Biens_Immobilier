package controleur;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vue.DetailsLocataire;
import vue.FenGarant;
import vue.FenRegularisationCharges;
import vue.FenTelecharger;

public class GestionTableGarant implements ListSelectionListener {
	private DetailsLocataire detailLocataire;
	public GestionTableGarant(DetailsLocataire detailLocataire) {
		this.detailLocataire = detailLocataire;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		FenGarant fenGarant = new FenGarant();
		int ligneSelectionnee = this.detailLocataire.getTableGarant().getSelectedRow();
		if(ligneSelectionnee < 0) {
			fenGarant.setVisible(false);
		}else {
			fenGarant.setVisible(true);
		}		
	}

}
