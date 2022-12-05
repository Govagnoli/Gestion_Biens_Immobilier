package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import vue.FenQuittances;

public class GestionQuittance implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Les Quittances de Loyer":
			FenQuittances fenQuittance = new FenQuittances();
			fenQuittance.setVisible(true);
			break;
		}
	}
}
