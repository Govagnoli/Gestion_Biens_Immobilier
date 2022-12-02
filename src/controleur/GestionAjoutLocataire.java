package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;

import vue.FenAjoutLocataire;

public class GestionAjoutLocataire implements ActionListener, ItemListener{
	
	private FenAjoutLocataire fenAjoutLocataire;
	private boolean ancienLocataire;
	
	public GestionAjoutLocataire(FenAjoutLocataire fenAjoutLocataire) {
		this.fenAjoutLocataire = fenAjoutLocataire;
		this.ancienLocataire = false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		switch(item.getText()) {
		case "Ajouter un garant":
			String NomGarant = this.fenAjoutLocataire.getNomGarant();
			String prenomGarant = this.fenAjoutLocataire.getPrenomGarant();
			String adresseGarant = this.fenAjoutLocataire.getAdresseGarant();
			String villeGarant = this.fenAjoutLocataire.getVilleGarant();
			String codePostalGarant = this.fenAjoutLocataire.getCodePostalGarant();
			String telephoneGarant = this.fenAjoutLocataire.getTelephoneGarant();
			String emailGarant = this.fenAjoutLocataire.getEmailGarant();
			
			if(NomGarant.isBlank() || prenomGarant.isBlank() || adresseGarant.isBlank() || villeGarant.isBlank() || codePostalGarant.isBlank() || telephoneGarant.isBlank() || emailGarant.isBlank()) {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutLocataire,"Il manque des informations.", "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
			} else {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutLocataire,"Le garant a bien été ajouté.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		case "Ajouter":
			//ATTENTION, à faire lors de l'ajout de la BDD.
			//Vérfier qu'un garant existe et poser la question si le locataire à bien pas de garant.
			
			String nomLocataire = this.fenAjoutLocataire.getNomLocataire();
			String prenomLocataire = this.fenAjoutLocataire.getPrenomLocataire();
			String telephoneLocataire = this.fenAjoutLocataire.getTelephoneLocataire();
			String emailLocataire = this.fenAjoutLocataire.getEmailLocataire();
			String dateDeNaissanceLocataire = this.fenAjoutLocataire.getDateDeNaissanceLocataire();
			String adresseBienLocataire = this.fenAjoutLocataire.getAdresseBienLocataire();
			String dateEntree = this.fenAjoutLocataire.getDateEntree();
			
			//ATTENTION, à faire lors de l'ajout de la BDD.
			//Verifier que l'adresse du bien du locataire à ajouter est bien une adresse d'un bien appartenant au propriétaire.
			
			if(nomLocataire.isBlank() || prenomLocataire.isBlank() || telephoneLocataire.isBlank() || emailLocataire.isBlank() || dateDeNaissanceLocataire.isBlank() || adresseBienLocataire.isBlank() || dateEntree.isBlank()) {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutLocataire,"Il manque des informations.", "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
			} else {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutLocataire,"Le locataire à bien été ajouté.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(this.fenAjoutLocataire.getRdbtnAncienNon().getSelectedObjects() == null) {
			this.ancienLocataire = true;
		} else {
			this.ancienLocataire = false;
		}		
	}
}
