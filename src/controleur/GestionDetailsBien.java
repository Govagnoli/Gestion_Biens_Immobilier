package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.DetailsBien;
import vue.FenAssurance;
import vue.FenRegularisationCharges;
import vue.FenTelecharger;

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
		case "Diagnostics":
			FenTelecharger fenTelecharger = new FenTelecharger();
			fenTelecharger.setVisible(true);
			detailsBien.dispose();
			break;
		case "Solde de tout compte":
			FenTelecharger fenTelecharger1 = new FenTelecharger();
			fenTelecharger1.setVisible(true);
			detailsBien.dispose();
			break;
		case "Assurance":
			FenAssurance fenAssurance = new FenAssurance();
			fenAssurance.setIdentifiant(this.detailsBien.getBien().getIdAssurance());
			fenAssurance.setVisible(true);
			break;
		}
	}
}
