package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.DetailsBien;
import vue.FenRegularisationCharges;

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
		}
	}
}
