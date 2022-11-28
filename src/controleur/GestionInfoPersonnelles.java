package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import vue.FenAccueil;
import vue.FenBiensImmobilier;
import vue.FenInformationsPersonelles;
import vue.FenLocataires;
import vue.FenStatistiques;

public class GestionInfoPersonnelles implements ActionListener{

	private FenInformationsPersonelles fenInformationsPersonelles;
	
	public GestionInfoPersonnelles(FenInformationsPersonelles fenInformationsPersonelles) {
		this.fenInformationsPersonelles = fenInformationsPersonelles;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();
		switch(item.getText()) {
		case "Accueil":
			FenAccueil fenAccueil = new FenAccueil();
			this.fenInformationsPersonelles.dispose();
			fenAccueil.setVisible(true);
			break;
		case "Mes Biens Immobilier":
			FenBiensImmobilier fenBiensImmobiliers = new FenBiensImmobilier();
			this.fenInformationsPersonelles.dispose();
			fenBiensImmobiliers.setVisible(true);
			break;
		case "Locataires":
			FenLocataires fenLocataires = new FenLocataires();
			this.fenInformationsPersonelles.dispose();
			fenLocataires.setVisible(true);
			break;
		case "Statistiques":
			FenStatistiques fenStatistiques = new FenStatistiques();
			this.fenInformationsPersonelles.dispose();
			fenStatistiques.setVisible(true);
			break;
		case "Fermer":
			this.fenInformationsPersonelles.dispose();
			break;
		case "Mon compte":
			break;
		}
	}

}
