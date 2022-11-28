package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import vue.FenAccueil;
import vue.FenLocataires;
import vue.FenRegularisationCharges;
import vue.FenStatistiques;

public class GestionRegularisationDesCharges implements ActionListener{

	private FenRegularisationCharges fenRegularisationCharges;
	
	public GestionRegularisationDesCharges(FenRegularisationCharges fenRegularisationCharges) {
		this.fenRegularisationCharges = fenRegularisationCharges;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();		
		switch(item.getText()) {
		case "Accueil":
			FenAccueil fenAccueil = new FenAccueil();
			this.fenRegularisationCharges.dispose();
			fenAccueil.setVisible(true);
			break;
		case "Mes Biens Immobilier":
			break;
		case "Locataires":
			FenLocataires fenLocataires = new FenLocataires();
			this.fenRegularisationCharges.dispose();
			fenLocataires.setVisible(true);
			break;
		case "Statistiques":
			FenStatistiques fenStatistiques = new FenStatistiques();
			this.fenRegularisationCharges.dispose();
			fenStatistiques.setVisible(true);
			break;
		case "Fermer":
			this.fenRegularisationCharges.dispose();
			break;
		}
	}

}
