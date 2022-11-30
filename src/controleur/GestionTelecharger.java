package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GestionTelecharger implements ActionListener{
	
	private JFrame fen;
	
	public GestionTelecharger(JFrame fen) {
		this.fen = fen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Oui":
			this.fen.dispose();
			break;
		case "Non":
			this.fen.dispose();
			break;
		}
	}
}
