package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import vue.DetailsLocataire;
import vue.FenAccueil;
import vue.FenBiensImmobilier;
import vue.FenLocataires;
import vue.FenStatistiques;

public class GestionBiensImmobilier implements ActionListener{

	private FenBiensImmobilier fenBiens;
	private GestionBiensImmobilier gestionClic; 
	
	public GestionBiensImmobilier(FenBiensImmobilier fenBiens) {
		this.fenBiens = fenBiens;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();		
		switch(item.getText()) {
		case "Accueil":
			FenAccueil fenAccueil = new FenAccueil();
			this.fenBiens.dispose();
			fenAccueil.setVisible(true);
			break;
		case "Mes Biens Immobilier":
			break;
		case "Locataires":
			FenLocataires fenLocataires = new FenLocataires();
			this.fenBiens.dispose();
			fenLocataires.setVisible(true);
			break;
		case "Statistiques":
			FenStatistiques fenStatistiques = new FenStatistiques();
			this.fenBiens.dispose();
			fenStatistiques.setVisible(true);
			break;
		case "Fermer":
			this.fenBiens.dispose();
			break;
		}
	}

	

}
