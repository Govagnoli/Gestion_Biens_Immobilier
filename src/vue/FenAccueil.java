package vue;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controleur.GestionAccueil;
import javax.swing.JMenu;
import javax.swing.JButton;

public class FenAccueil extends JFrame {
	
	private GestionAccueil gestionClic;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenAccueil frame = new FenAccueil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FenAccueil() {
		
		this.gestionClic = new GestionAccueil(this);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(false);
		setVisible(true);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu accueil1 = new JMenu("Accueil");
		menuBar.add(accueil1);
		
		JMenu gestion = new JMenu("Gestion");
		menuBar.add(gestion);
		
		JMenu parametres = new JMenu("Param\u00E8tres");
		menuBar.add(parametres);
		
		JMenuItem biens = new JMenuItem("Mes Biens Immobilier");
		biens.addActionListener(this.gestionClic);
		gestion.add(biens);
		
		JMenuItem locataires = new JMenuItem("Locataires");
		locataires.addActionListener(this.gestionClic);
		gestion.add(locataires);
		
		JMenuItem accueil = new JMenuItem("Accueil");
		accueil.addActionListener(this.gestionClic);
		accueil1.add(accueil);
				
		JMenuItem statistiques = new JMenuItem("Statistiques");
		statistiques.addActionListener(this.gestionClic);
		parametres.add(statistiques);
		
		JMenuItem fermer = new JMenuItem("Fermer");
		fermer.addActionListener(this.gestionClic);
		parametres.add(fermer);
	}

}
