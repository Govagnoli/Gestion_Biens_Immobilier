package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vue.FenQuittances;

public class GestionQuittances  implements ActionListener, ListSelectionListener {
	
	private FenQuittances fenQuittance;
	
	public GestionQuittances(FenQuittances fenQuittance) {
		this.fenQuittance = fenQuittance;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Les Quittances de Loyer":
			FenQuittances fenQuittance = new FenQuittances();
			fenQuittance.setVisible(true);
			break;
		}
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int ligneSelectionnee = this.fenQuittance.getTableQuittances().getSelectedRow();
	}
}
