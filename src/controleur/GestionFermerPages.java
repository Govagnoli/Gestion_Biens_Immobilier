package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GestionFermerPages implements ActionListener{

	private JFrame fen;
	
	public GestionFermerPages(JFrame fen) {
		this.fen = fen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Fermer":
			this.fen.dispose();
			break;
		case "Annuler":
			this.fen.dispose();
			break;
		case "fermer":
			this.fen.dispose();
			break;
		case "annuler":
			this.fen.dispose();
			break;
		}
	}
}
