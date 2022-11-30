package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import vue.FenAccueil;
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
		case "Accueil":
			FenAccueil fenAccueil = new FenAccueil();
			this.fen.dispose();
			fenAccueil.setVisible(true);
			break;
		case "Mes Biens Immobilier":
			FenBiensImmobilier fenBiensImmobiliers = new FenBiensImmobilier();
			this.fen.dispose();
			fenBiensImmobiliers.setVisible(true);
			break;
		case "Locataires":
			FenLocataires fenLocataires = new FenLocataires();
			this.fen.dispose();
			fenLocataires.setVisible(true);
			break;
		case "Statistiques":
			FenStatistiques fenStatistiques = new FenStatistiques();
			this.fen.dispose();
			fenStatistiques.setVisible(true);
			break;
		case "Fermer":
			this.fen.dispose();
			break;
		case "Mon compte":
			FenInformationsPersonelles fenInformationsPersonelles = new FenInformationsPersonelles();
			this.fen.dispose();
			fenInformationsPersonelles.setVisible(true);
			break;
		}
	}
}
