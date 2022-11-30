package controleur;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import vue.FenDL;
import vue.FenRegularisationCharges;

public class GestionTableRegularisationDesCharges implements ListSelectionListener {
	private FenRegularisationCharges fenRGC;
	public GestionTableRegularisationDesCharges(FenRegularisationCharges fenRGC) {
		this.fenRGC = fenRGC;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		FenDL fenDL = new FenDL();
		int ligneSelectionnee = this.fenRGC.getTableRegularisationCharges().getSelectedRow();
		if(ligneSelectionnee < 0) {
			fenDL.setVisible(false);
		}else {
			fenDL.setVisible(true);
		}		
	}
}
