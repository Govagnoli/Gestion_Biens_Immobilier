package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.FenAjoutLocataire;

public class GestionAjoutLocataire implements ActionListener{
	
	private FenAjoutLocataire fenAjoutLocataire;;
	
	public GestionAjoutLocataire(FenAjoutLocataire fenAjoutLocataire) {
		this.fenAjoutLocataire = fenAjoutLocataire;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		switch(item.getText()) {
		case "Ajouter":
			this.fenAjoutLocataire.dispose();
			break;
		}
	}
}
