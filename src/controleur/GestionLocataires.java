package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import vue.FenAccueil;
import vue.FenAjoutLocataire;
import vue.FenBiensImmobilier;
import vue.FenLocataires;
import vue.FenStatistiques;

public class GestionLocataires implements ActionListener{

	private FenLocataires fenLocataires;
	
	public GestionLocataires(FenLocataires fenLocataires) {
		this.fenLocataires = fenLocataires;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		JMenuItem item = (JMenuItem) e.getSource();		
		switch(item.getText()) {
		case "Accueil":
			FenAccueil fenAccueil = new FenAccueil();
			this.fenLocataires.dispose();
			fenAccueil.setVisible(true);
			break;
		case "Mes Biens Immobilier":
			FenBiensImmobilier fenBiensImmobiliers = new FenBiensImmobilier();
			this.fenLocataires.dispose();
			fenBiensImmobiliers.setVisible(true);
			break;
		case "Locataires":
			break;
		case "Statistiques":
			FenStatistiques fenStatistiques = new FenStatistiques();
			this.fenLocataires.dispose();
			fenStatistiques.setVisible(true);
			break;
		case "Fermer":
			this.fenLocataires.dispose();
			break;
		}
	}
	
	public void actionPerformed1(ActionEvent e) {
		JFrame frame = new JFrame ("FenAjoutLocataire");
			FenAjoutLocataire fenAjoutLocataire = new FenAjoutLocataire();
			fenAjoutLocataire.setVisible(true);
	}
}
