package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controleur.GestionMenu;
import javax.swing.JLabel;

public class FenStatistiques extends JFrame {

	private JPanel contentPane;
	private GestionMenu gestionMenu;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenStatistiques frame = new FenStatistiques();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FenStatistiques() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(false);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lbltest = new JLabel("Statistiques");
		contentPane.add(lbltest, BorderLayout.CENTER);
		
		this.gestionMenu = new GestionMenu(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu accueil1 = new JMenu("Accueil");
		menuBar.add(accueil1);
		
		JMenu gestion = new JMenu("Gestion");
		menuBar.add(gestion);
		
		JMenu parametres = new JMenu("Param\u00E8tres");
		menuBar.add(parametres);

		JMenu compte = new JMenu("Compte");
		menuBar.add(compte);
		
		JMenuItem biens = new JMenuItem("Mes Biens Immobilier");
		biens.addActionListener(this.gestionMenu);
		gestion.add(biens);
		
		JMenuItem locataires = new JMenuItem("Locataires");
		locataires.addActionListener(this.gestionMenu);
		gestion.add(locataires);
		
		JMenuItem accueil = new JMenuItem("Accueil");
		accueil.addActionListener(this.gestionMenu);
		accueil1.add(accueil);
				
		JMenuItem statistiques = new JMenuItem("Statistiques");
		statistiques.addActionListener(this.gestionMenu);
		parametres.add(statistiques);
		
		JMenuItem fermer = new JMenuItem("Fermer");
		fermer.addActionListener(this.gestionMenu);
		parametres.add(fermer);

		JMenuItem monCompte = new JMenuItem("Mon compte");
		monCompte.addActionListener(this.gestionMenu);
		compte.add(monCompte);
	}

}