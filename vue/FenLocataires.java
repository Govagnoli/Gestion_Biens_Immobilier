package vue;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controleur.GestionLocataire;
import controleur.GestionMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class FenLocataires extends JFrame{

	private JPanel contentPane;
	private GestionMenu gestionMenu;
	private GestionLocataire gestionLocataire;
	private JTable tableLocataires;
	private DetailsLocataire detailsLocataire;

	public FenLocataires() {
		
		this.gestionMenu = new GestionMenu(this);
		this.gestionLocataire = new GestionLocataire(this);
		
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
		scrollPane.setBounds(5, 84, 1278, 239);
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
				"Identifiant", "Nom", "Prénom", "Téléphone", "E-mail", "Date de naissance", "Dépôt de Garantie", "Ancien locataire", "Part de possession"
			}
		));
		TableColumn columnId = tableLocataires.getColumnModel().getColumn(0);
		columnId.setMaxWidth(20);
		TableColumn columnExLoc = tableLocataires.getColumnModel().getColumn(7);
		columnExLoc.setMaxWidth(60);
		
		this.getTableLocataires().getSelectionModel().addListSelectionListener(this.gestionLocataire);
		scrollPane.setViewportView(tableLocataires);
		
		JPanel panelPopUp = new JPanel();
		panelPopUp.setBounds(5, 300, 1278, 300);
		contentPane.add(panelPopUp);
		
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

		JMenuItem fermer = new JMenuItem("Fermer");
		fermer.addActionListener(this.gestionMenu);
		deconnexion.add(fermer);
		
		this.detailsLocataire= new DetailsLocataire();
		detailsLocataire.setNormalBounds(new Rectangle(864, 0, 840, 300));
		this.detailsLocataire.setVisible(false);
		panelPopUp.setLayout(new BorderLayout(0, 0));
		panelPopUp.add(this.detailsLocataire);
		
		JButton btnAjoutLocataire = new JButton("Ajouter un locataire");
		btnAjoutLocataire.setBounds(190, 52, 159, 23);
		btnAjoutLocataire.addActionListener(this.gestionLocataire);
		contentPane.add(btnAjoutLocataire);
		
		
		JLabel lblAjouterlocataire = new JLabel("Ajouter un locataire :");
		lblAjouterlocataire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAjouterlocataire.setBounds(29, 50, 133, 23);
		contentPane.add(lblAjouterlocataire);
		
		JLabel lblTitre = new JLabel("Mes locataires");
		lblTitre.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitre.setBounds(10, 11, 152, 14);
		contentPane.add(lblTitre);
		
		JButton buttonCharger = new JButton("Charger");
		buttonCharger.addActionListener(this.gestionLocataire);
		buttonCharger.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buttonCharger.setBounds(202, 9, 127, 21);
		contentPane.add(buttonCharger);
		
	}

	public JTable getTableLocataires() {
		return tableLocataires;
	}

	public DetailsLocataire getDetailsLocataire() {
		return detailsLocataire;
	}
}
