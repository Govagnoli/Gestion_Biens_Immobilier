package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import vue.FenAccueil;
import vue.FenBiensImmobilier;
import vue.FenLocataires;
import vue.FenStatistiques;

public class GestionStatistiques implements ActionListener{

	private FenStatistiques fenStatitiques;
	private GestionStatistiques gestionClic; 
	
	public GestionStatistiques(FenStatistiques fenStatitiques) {
		this.fenStatitiques = fenStatitiques;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();		
		switch(item.getText()) {
		case "Accueil":
			FenAccueil fenAccueil = new FenAccueil();
			this.fenStatitiques.dispose();
			fenAccueil.setVisible(true);
			break;
		case "Mes Biens Immobilier":
			FenBiensImmobilier fenBiensImmobiliers = new FenBiensImmobilier();
			this.fenStatitiques.dispose();
			fenBiensImmobiliers.setVisible(true);
			break;
		case "Locataires":
			FenLocataires fenLocataires = new FenLocataires();
			this.fenStatitiques.dispose();
			fenLocataires.setVisible(true);
			break;
		case "Statistiques":
			FenStatistiques fenStatistiques = new FenStatistiques();
			this.fenStatitiques.dispose();
			fenStatistiques.setVisible(true);
			break;
		case "Fermer":
			this.fenStatitiques.dispose();
			break;
		}
	}

}
