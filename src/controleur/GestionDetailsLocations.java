package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.DetailsLocation;
import vue.FenAssurance;
import vue.FenRegularisationCharges;
import vue.FenTelecharger;

public class GestionDetailsLocations implements ActionListener{
	
private DetailsLocation detailsLocation;
	
	public GestionDetailsLocations(DetailsLocation detailsLocation) {
		this.detailsLocation = detailsLocation;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Regularisation des charges":
			FenRegularisationCharges fenRegularisationCharges = new FenRegularisationCharges();
			fenRegularisationCharges.setVisible(true);
			detailsLocation.dispose();
			break;
		case "Solde de tout compte":
			FenTelecharger fenTelecharger1 = new FenTelecharger();
			fenTelecharger1.setVisible(true);
			detailsLocation.dispose();
			break;
		}
	}

}
