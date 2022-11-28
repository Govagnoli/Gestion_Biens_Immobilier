package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import vue.FenAccueil;
import vue.FenBiensImmobilier;
import vue.FenInformationsPersonelles;
import vue.FenLocataires;
import vue.FenStatistiques;

public class GestionStatistiques implements ActionListener{

	private FenStatistiques fenStatistiques;
	private GestionStatistiques gestionClic; 
	
	public GestionStatistiques(FenStatistiques fenStatistiques) {
		this.fenStatistiques = fenStatistiques;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();		
		switch(item.getText()) {
		case "Accueil":
			FenAccueil fenAccueil = new FenAccueil();
			this.fenStatistiques.dispose();
			fenAccueil.setVisible(true);
			break;
		case "Mes Biens Immobilier":
			FenBiensImmobilier fenBiensImmobiliers = new FenBiensImmobilier();
			this.fenStatistiques.dispose();
			fenBiensImmobiliers.setVisible(true);
			break;
		case "Locataires":
			FenLocataires fenLocataires = new FenLocataires();
			this.fenStatistiques.dispose();
			fenLocataires.setVisible(true);
			break;
		case "Statistiques":
			FenStatistiques fenStatistiques = new FenStatistiques();
			this.fenStatistiques.dispose();
			fenStatistiques.setVisible(true);
			break;
		case "Fermer":
			this.fenStatistiques.dispose();
			break;
		case "Mon compte":
			FenInformationsPersonelles fenInformationsPersonelles = new FenInformationsPersonelles();
			this.fenStatistiques.dispose();
			fenInformationsPersonelles.setVisible(true);
			break;
		}
	}

}
