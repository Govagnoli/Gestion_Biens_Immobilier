package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import vue.FenAccueil;
import vue.FenBiensImmobilier;
import vue.FenLocataires;
import vue.FenRegularisationCharges;
import vue.FenDL;
import vue.FenStatistiques;

public class GestionSoldeToutCompte implements ActionListener {

	private FenDL fenSoldeToutCompte;
	
	public GestionSoldeToutCompte(FenDL fenSoldeToutCompte) {
		this.fenSoldeToutCompte = fenSoldeToutCompte;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Oui":
			this.fenSoldeToutCompte.dispose();
			break;
		case "Non":
			this.fenSoldeToutCompte.dispose();
			break;

		}
	}
}
