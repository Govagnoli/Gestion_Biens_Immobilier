package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import vue.FenModifierLocataire;

public class GestionModifierLocataire implements ActionListener, ItemListener{
	
	private FenModifierLocataire fenModifierLocataire;
	private boolean ancienLocataire;
	
	public GestionModifierLocataire(FenModifierLocataire fenModifierLocataire) {
		this.fenModifierLocataire = fenModifierLocataire;
		this.ancienLocataire = false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Modifier":
			//ATTENTION, à faire lors de l'ajout de la BDD.
			//Vérfier qu'un garant existe et poser la question si le locataire à bien pas de garant.
			
			String nomLocataire = this.fenModifierLocataire.getNomLocataire();
			String prenomLocataire = this.fenModifierLocataire.getPrenomLocataire();
			String telephoneLocataire = this.fenModifierLocataire.getTelephoneLocataire();
			String emailLocataire = this.fenModifierLocataire.getEmailLocataire();
			String dateDeNaissanceLocataire = this.fenModifierLocataire.getDateDeNaissanceLocataire();
			String adresseBienLocataire = this.fenModifierLocataire.getAdresseBienLocataire();
			String dateEntree = this.fenModifierLocataire.getDateEntree();
			
			//ATTENTION, à faire lors de l'ajout de la BDD.
			//Verifier que l'adresse du locataire à ajouter est bien une adresse d'un bien appartenant au propriétaire.
			
			if(nomLocataire.isBlank() || prenomLocataire.isBlank() || telephoneLocataire.isBlank() || emailLocataire.isBlank() || dateDeNaissanceLocataire.isBlank() || adresseBienLocataire.isBlank() || dateEntree.isBlank()) {
				javax.swing.JOptionPane.showMessageDialog(this.fenModifierLocataire,"Il manque des informations.", "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
			} else {
				javax.swing.JOptionPane.showMessageDialog(this.fenModifierLocataire,"Le locataire à bien été modifié.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(this.fenModifierLocataire.getRdbtnAncienNon().getSelectedObjects() == null) {
			this.ancienLocataire = true;
		} else {
			this.ancienLocataire = false;
		}		
	}
}
