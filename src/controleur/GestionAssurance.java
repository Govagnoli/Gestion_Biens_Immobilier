package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;

import vue.FenAjoutAssociation;
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
			this.fenAssurance.dispose();
			break;
		}
	}
}
