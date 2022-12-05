package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vue.DetailsLocataire;
import vue.FenAjoutLocataire;
import vue.FenGarant;
import vue.FenModifierLocataire;
import vue.FenQuittances;

public class GestionDetailsLocataire implements ActionListener, ListSelectionListener{

	private DetailsLocataire detailLocataire;
	
	public GestionDetailsLocataire(DetailsLocataire detailLocataire) {
		this.detailLocataire = detailLocataire;
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
}
