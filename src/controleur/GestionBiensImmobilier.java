package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.FenAjoutBien;

public class GestionBiensImmobilier implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Ajouter un bien":
			FenAjoutBien fenAjoutBien = new FenAjoutBien();
			fenAjoutBien.setVisible(true);
			break;
		}
	}

}
