package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import vue.FenAccueil;
import vue.FenBiensImmobilier;
import vue.FenLocataires;
import vue.FenStatistiques;

public class GestionAccueil implements ActionListener{

	private FenAccueil fenAccueil;
	private GestionAccueil gestionClic; 
	
	public GestionAccueil(FenAccueil fenAccueil) {
		this.fenAccueil = fenAccueil;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();
		switch(item.getText()) {
		case "Accueil":
			break;
		case "Mes Biens Immobilier":
			FenBiensImmobilier fenBiensImmobiliers = new FenBiensImmobilier();
			this.fenAccueil.dispose();
			fenBiensImmobiliers.setVisible(true);
			break;
		case "Locataires":
			FenLocataires fenLocataires = new FenLocataires();
			this.fenAccueil.dispose();
			fenLocataires.setVisible(true);
			break;
		case "Statistiques":
			FenStatistiques fenStatistiques = new FenStatistiques();
			this.fenAccueil.dispose();
			fenStatistiques.setVisible(true);
			break;
		case "Fermer":
			this.fenAccueil.dispose();
			break;
		}
	}

}
