package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import vue.FenAjoutAssociation;

public class GestionAjoutAssociation implements ActionListener{
	
	private FenAjoutAssociation fenAjoutAssociation;
	
	public GestionAjoutAssociation(FenAjoutAssociation fenAjoutAssociation) {
		this.fenAjoutAssociation = new FenAjoutAssociation();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		switch(item.getText()) {
		case "Ajouter":
			this.fenAjoutAssociation.dispose();
			break;
		case "Annuler":
			this.fenAjoutAssociation.dispose();
			break;
		}
	}
}
