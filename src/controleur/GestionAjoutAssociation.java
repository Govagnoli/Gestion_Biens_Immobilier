package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.FenAjoutAssociation;

public class GestionAjoutAssociation implements ActionListener{
	
	private FenAjoutAssociation fenAjoutAssociation;
	
	public GestionAjoutAssociation(FenAjoutAssociation fenAjoutAssociation) {
		this.fenAjoutAssociation = fenAjoutAssociation;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		switch(item.getText()) {
		case "Ajouter":
			String nomLocataire = this.fenAjoutAssociation.getNomLocataire();
			String telephonelocataire = this.fenAjoutAssociation.getTelephonelocataire() ;
			String emailLocataire = this.fenAjoutAssociation.getEmailLocataire() ;
			String dateDeNaissanceLocataire = this.fenAjoutAssociation.getDateDeNaissanceLocataire() ;
			
			if(nomLocataire.isBlank() ||telephonelocataire.isBlank() ||emailLocataire.isBlank() ||dateDeNaissanceLocataire.isBlank()) {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutAssociation,"Il manque des informations.", "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
			} else {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutAssociation,"L'enregistrement à bien été pris en compte.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
				this.fenAjoutAssociation.dispose();
			}
			break;
		case "Annuler":
			this.fenAjoutAssociation.dispose();
			break;
		}
	}
}
