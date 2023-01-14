package controleur;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import vue.FenRegularisationCharges;
import vue.FenTelecharger;

public class GestionRegularisationDesCharges implements ListSelectionListener {
	
	private FenRegularisationCharges fenRGC;
	
	public GestionRegularisationDesCharges(FenRegularisationCharges fenRGC) {
		this.fenRGC = fenRGC;
		
		
		
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		FenTelecharger fenTelecharger = new FenTelecharger();
		int ligneSelectionnee = this.fenRGC.getTableRegularisationCharges().getSelectedRow();
		if(ligneSelectionnee < 0) {
			fenTelecharger.setVisible(false);
		}else {
			fenTelecharger.setVisible(true);
		}		
	}
}
