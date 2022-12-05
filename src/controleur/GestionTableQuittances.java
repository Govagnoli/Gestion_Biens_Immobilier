package controleur;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vue.FenQuittances;

public class GestionTableQuittances implements ListSelectionListener {
private FenQuittances fenQuittance;
	
	public GestionTableQuittances(FenQuittances fenQuittance) {
		this.fenQuittance = fenQuittance;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int ligneSelectionnee = this.fenQuittance.getTableQuittances().getSelectedRow();
	}
}
