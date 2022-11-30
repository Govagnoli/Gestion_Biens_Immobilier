package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.FenAjoutAssociation;

public class GestionInformationsPersonelles implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Ajouter":
			FenAjoutAssociation fenAjoutAssociation = new FenAjoutAssociation();
			fenAjoutAssociation.setVisible(true);
			break;
		case "Supprimer":
			//Supprime l'élément sélectionné
			break;
		}
	}
}
