package vue;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.GestionClicBtnLocataire;
import controleur.GestionLocataires;
import controleur.GestionTableLocataires;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class FenLocataires extends JFrame{

	private JPanel contentPane;
	private GestionLocataires gestionClic;
	private JTable tableLocataires;
	private GestionTableLocataires gestionTable;
	private DetailsLocataire detailsLocataire;
	private GestionClicBtnLocataire gestionClicBtn;

	/**
	 * Create the frame.
	 */
	public FenLocataires() {
		
		this.gestionTable = new GestionTableLocataires(this);
		this.gestionClic = new GestionLocataires(this);
		this.gestionClicBtn = new GestionClicBtnLocataire(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(false);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 37, 1278, 239);
		contentPane.add(scrollPane);
		
		tableLocataires = new JTable();
		tableLocataires.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Identifiant", "Nom", "Pr�nom", "T�l�phone", "E-mail", "Date de naissance", "D�p�t de Garantie", "Ancien locataire", "Part de possession"
			}
		));
		this.getTableLocataires().getSelectionModel().addListSelectionListener(this.gestionTable);
		scrollPane.setViewportView(tableLocataires);
		
		JPanel panelPopUp = new JPanel();
		panelPopUp.setBounds(5, 300, 1278, 300);
		contentPane.add(panelPopUp);
		
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
		
		this.detailsLocataire= new DetailsLocataire();
		detailsLocataire.setNormalBounds(new Rectangle(864, 0, 840, 300));
		this.detailsLocataire.setVisible(false);
		panelPopUp.setLayout(new BorderLayout(0, 0));
		panelPopUp.add(this.detailsLocataire);
		
		JButton btnAjoutLocataire = new JButton("Ajouter un locataire");
		btnAjoutLocataire.addActionListener(this.gestionClicBtn);
		btnAjoutLocataire.setBounds(272, 5, 164, 23);
		contentPane.add(btnAjoutLocataire);
		
		JLabel lblListeLocataire = new JLabel("Listes des locataires :");
		lblListeLocataire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblListeLocataire.setBounds(5, 3, 183, 23);
		contentPane.add(lblListeLocataire);
		
	}

	public JTable getTableLocataires() {
		return tableLocataires;
	}

	public DetailsLocataire getDetailsLocataire() {
		return detailsLocataire;
	}
}
