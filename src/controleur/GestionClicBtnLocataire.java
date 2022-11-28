package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import vue.FenAjoutLocataire;
import vue.FenLocataires;

public class GestionClicBtnLocataire implements ActionListener{

	private FenLocataires fenLocataires;
	
	public GestionClicBtnLocataire(FenLocataires fenLocataires) {
		this.fenLocataires = fenLocataires;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Ajouter un locataire":
			FenAjoutLocataire fenAjoutLocataire = new FenAjoutLocataire();
			fenAjoutLocataire.setVisible(true);		
			break;
		}
	}
}
