package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.DetailsBien;
import vue.Diagnostique;
import vue.FenLocataires;
import vue.FenRegularisationCharges;
import vue.FenDL;

public class GestionDetailsBien implements ActionListener{

	private DetailsBien detailsBien;
	
	public GestionDetailsBien(DetailsBien detailsBien) {
		this.detailsBien = detailsBien;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Regularisation des Charges":
			FenRegularisationCharges fenRegularisationCharges = new FenRegularisationCharges();
			fenRegularisationCharges.setVisible(true);
			detailsBien.dispose();
			break;
		case "Detail Locataire":
			FenLocataires fenLocataire = new FenLocataires();
			fenLocataire.setVisible(true);
			detailsBien.dispose();
			break;
		case "Diagnostics":
			Diagnostique fenDiagnostic = new Diagnostique();
			fenDiagnostic.setVisible(true);
			detailsBien.dispose();
			break;
		case "Solde de tout compte":
			FenDL fenSoldeToutCompte = new FenDL();
			fenSoldeToutCompte.setVisible(true);
			detailsBien.dispose();
			break;
		}
	}
}
