package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import modele.Assurance;
import vue.FenAssurance;

public class GestionAssurance implements ActionListener{
	
	private FenAssurance fenAssurance;
	
	public GestionAssurance(FenAssurance fenAssurance) {
		this.fenAssurance = fenAssurance;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		switch(item.getText()) {
		case "Modifier":
			String numeroContrat = this.fenAssurance.getTextFieldNumContrat();
			String prime = this.fenAssurance.getTextField_Prime();
			String protectionJuridique = this.fenAssurance.getTextField_protectionJuridique();
			String dateFinDeValiditee = this.fenAssurance.getTextField_DateFinValiditee();
			String numerdateDebutDeValiditeeContrat = this.fenAssurance.getTextField_DateDebutValiditee();
			String tauxAugmentation = this.fenAssurance.getTextField_TauxAugmentation();
			System.out.println(numeroContrat);
			
			if(numeroContrat.isBlank() ||prime.isBlank() ||protectionJuridique.isBlank() ||dateFinDeValiditee.isBlank() ||numerdateDebutDeValiditeeContrat.isBlank() ||tauxAugmentation.isBlank()) {
				javax.swing.JOptionPane.showMessageDialog(this.fenAssurance,"Il manque des informations.", "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
			} else {
				javax.swing.JOptionPane.showMessageDialog(this.fenAssurance,"L'enregistrement à bien été pris en compte.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
				this.fenAssurance.dispose();
			}
			break;
		}
	}
	
	public void AffichageValeursCourantes() {
		try {
			Assurance assurance = new Assurance(this.fenAssurance.getIdentifiant());
			this.fenAssurance.setIdentifiant(assurance.getIdAssurance());
			this.fenAssurance.setNumContrat(assurance.getNumContrant());
			this.fenAssurance.setPrime(assurance.getPrime());
			this.fenAssurance.setProtectionJuridique(assurance.getProtectionJuridique());
			this.fenAssurance.setDateDebutValiditee(assurance.getDebutDeValidite());
			this.fenAssurance.setDateFinValiditee(assurance.getFinDeValidite());
			this.fenAssurance.setTauxAugmentation(assurance.getTauxAugmentation());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
