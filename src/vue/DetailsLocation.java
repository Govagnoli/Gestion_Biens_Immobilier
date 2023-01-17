package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import controleur.GestionDetailsLocations;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetailsLocation extends JInternalFrame {

	private GestionDetailsLocations gestionDetailsLocations;

	public DetailsLocation() {
		
		this.gestionDetailsLocations = new GestionDetailsLocations(this);
		
		setBounds(100, 100, 500, 150);
		getContentPane().setLayout(null);
		
		JButton btRegularisationDesCharges = new JButton("Regularisation des charges");
		btRegularisationDesCharges.addActionListener(this.gestionDetailsLocations);
		getContentPane().add(btRegularisationDesCharges);
		
		JButton btnSoldesDeToutCompte = new JButton("Solde de tout compte");
		btnSoldesDeToutCompte.addActionListener(this.gestionDetailsLocations);
		getContentPane().add(btnSoldesDeToutCompte);

	}
}
