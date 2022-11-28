package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import vue.FenAccueil;
import vue.FenAjoutLocataire;
import vue.FenBiensImmobilier;
import vue.FenLocataires;
import vue.FenStatistiques;

public class GestionAjoutLocataire implements ActionListener{

	private GestionAccueil gestionClic;
	private FenAjoutLocataire fenAjoutLocataire; 
	
	public GestionAjoutLocataire(FenAjoutLocataire fenAjoutLocataire) {
		this.fenAjoutLocataire = fenAjoutLocataire;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();
		switch(item.getText()) {
		case "Accueil":
			break;
		case "Mes Biens Immobilier":
			FenBiensImmobilier fenBiensImmobiliers = new FenBiensImmobilier();
			this.fenAjoutLocataire.dispose();
			fenBiensImmobiliers.setVisible(true);
			break;
		case "Locataires":
			FenLocataires fenLocataires = new FenLocataires();
			this.fenAjoutLocataire.dispose();
			fenLocataires.setVisible(true);
			break;
		case "Statistiques":
			FenStatistiques fenStatistiques = new FenStatistiques();
			this.fenAjoutLocataire.dispose();
			fenStatistiques.setVisible(true);
			break;
		case "Fermer":
			this.fenAjoutLocataire.dispose();
			break;
		}
	}

}
