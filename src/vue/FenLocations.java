package vue;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controleur.GestionLocations;
import controleur.GestionMenu;

public class FenLocations extends JFrame {

	private JPanel contentPane;
	private JTable tableLocation;
	private GestionMenu gestionMenu;
	private DetailsLocation detailsLocation;
	private GestionLocations gestionLocations;

	public FenLocations() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		this.gestionMenu = new GestionMenu(this);
		this.gestionLocations = new GestionLocations(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(false);
		setVisible(true);
		
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
		
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane);
		scrollPane.setBounds(10, 80, 1540, 500);
		
		tableLocation = new JTable();
		tableLocation.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
					"identifiant location", "Numéro", "Adresse", "Nom locataire", "Prenom locataire", "Date d'entrée"
			}
		));
		
		this.getTableLocation().getSelectionModel().addListSelectionListener(this.gestionLocations);
		
		scrollPane.setViewportView(tableLocation);
		
		JPanel panelPopUp = new JPanel();
		panelPopUp.setBounds(0, 500, 1540, 154);
		getContentPane().add(panelPopUp);
		
		this.detailsLocation = new DetailsLocation();
		this.detailsLocation.setVisible(false);
		panelPopUp.add(this.detailsLocation);
		
		JButton btnCharger = new JButton("Charger");
		btnCharger.addActionListener(this.gestionLocations);
		btnCharger.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCharger.setBounds(232, 11, 125, 25);
		getContentPane().add(btnCharger);
		
		JLabel lblTitre = new JLabel("Mes locations");
		lblTitre.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitre.setBounds(10, 11, 238, 14);
		getContentPane().add(lblTitre);
		
	}

	public DetailsLocation getDetailslocation() {
		return detailsLocation;
	}

	public JTable getTableLocation() {
		return this.tableLocation;
	}
	
	public DefaultTableModel getModelTableLocation() {
		return (DefaultTableModel) this.tableLocation.getModel();
	}

}
