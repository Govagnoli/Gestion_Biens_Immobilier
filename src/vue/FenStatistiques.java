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
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Canvas;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel general = new JPanel();
		general.setBounds(34, 11, 1200, 561);
		contentPane.add(general);
		general.setLayout(new BorderLayout(0, 0));
		
		JPanel Centre = new JPanel();
		Centre.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		general.add(Centre, BorderLayout.CENTER);
		Centre.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTest = new JLabel("GRAPHIQUE");
		lblTest.setHorizontalAlignment(SwingConstants.CENTER);
		Centre.add(lblTest);
		
		JPanel Droit = new JPanel();
		Droit.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		general.add(Droit, BorderLayout.EAST);
		Droit.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTest2 = new JLabel("GRAPHIQUE");
		lblTest2.setHorizontalAlignment(SwingConstants.CENTER);
		Droit.add(lblTest2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		general.add(scrollPane, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
			
		
		this.gestionMenu = new GestionMenu(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu informations = new JMenu("Informations");
		menuBar.add(informations);
		
		JMenu gestion = new JMenu("Gestion");
		menuBar.add(gestion);

		JMenu deconnexion = new JMenu("Fermer");
		menuBar.add(deconnexion);
		
		JMenuItem statistiques = new JMenuItem("Statistiques");
		statistiques.addActionListener(this.gestionMenu);
		informations.add(statistiques);
		
		JMenuItem monCompte = new JMenuItem("Mon compte");
		monCompte.addActionListener(this.gestionMenu);
		informations.add(monCompte);
		
		JMenuItem biens = new JMenuItem("Mes Biens Immobilier");
		biens.addActionListener(this.gestionMenu);
		gestion.add(biens);
		
		JMenuItem locataires = new JMenuItem("Locataires");
		locataires.addActionListener(this.gestionMenu);
		gestion.add(locataires);
		
		JMenuItem locations = new JMenuItem("Locations");
		locations.addActionListener(this.gestionMenu);
		gestion.add(locations);

		JMenuItem fermer = new JMenuItem("Fermer");
		fermer.addActionListener(this.gestionMenu);
		deconnexion.add(fermer);
		
		int nbrLignes=4;		
		for(int i=0; i<nbrLignes; i++) {
			UnBien bien = new UnBien();
			panel.add(bien);
			bien.setVisible(true);
		}
	}
}
