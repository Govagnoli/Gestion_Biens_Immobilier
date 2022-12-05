package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import vue.FenBiensImmobilier;
import vue.FenInformationsPersonelles;
import vue.FenLocataires;
import vue.FenStatistiques;

public class GestionMenu implements ActionListener{
	
	private JFrame fen;
	
	public GestionMenu(JFrame fen) {
		this.fen = fen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();
		switch(item.getText()) {
		case "Mes Biens Immobilier":
			FenBiensImmobilier fenBiensImmobiliers = new FenBiensImmobilier();
			fenBiensImmobiliers.setVisible(true);
			this.fen.dispose();
			break;
		case "Locataires":
			FenLocataires fenLocataires = new FenLocataires();
			fenLocataires.setVisible(true);
			this.fen.dispose();
			break;
		case "Statistiques":
			FenStatistiques fenStatistiques = new FenStatistiques();
			fenStatistiques.setVisible(true);
			this.fen.dispose();
			break;
		case "Fermer":
			this.fen.dispose();
			break;
		case "Mon compte":
			FenInformationsPersonelles fenInformationsPersonelles = new FenInformationsPersonelles();
			fenInformationsPersonelles.setVisible(true);
			this.fen.dispose();
			break;
		}
	}
}
