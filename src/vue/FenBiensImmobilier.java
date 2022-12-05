package vue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controleur.GestionBiensImmobilier;
import controleur.GestionMenu;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class FenBiensImmobilier extends JFrame {

	private JTable TableBien;
	private GestionMenu gestionMenu;
	private DetailsBien detailsBien;
	private GestionBiensImmobilier gestionBiensImmobilier;

	public FenBiensImmobilier() {
		
		this.gestionMenu = new GestionMenu(this);
		this.gestionBiensImmobilier = new GestionBiensImmobilier(this);
		
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

		JMenuItem fermer = new JMenuItem("Fermer");
		fermer.addActionListener(this.gestionMenu);
		deconnexion.add(fermer);
		
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane);
		scrollPane.setBounds(10, 52, 1540, 500);
		
		TableBien = new JTable();
		TableBien.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, "", null, null, null},
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
				"Identifiant", "Ville", "Adresse", "Code Postal", "superficie", "Nombre locataire", "Loyer"
			}
		));
		
		this.getTableBien().getSelectionModel().addListSelectionListener(this.gestionBiensImmobilier);
		
		scrollPane.setViewportView(TableBien);
		
		JPanel panelPopUp = new JPanel();
		panelPopUp.setBounds(0, 500, 1540, 154);
		getContentPane().add(panelPopUp);
		
		this.detailsBien = new DetailsBien();
		this.detailsBien.setVisible(false);
		panelPopUp.add(this.detailsBien);
		
		JLabel lblAjoutBien = new JLabel("Ajouter un bien immobilier : ");
		lblAjoutBien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAjoutBien.setBounds(10, 11, 185, 14);
		getContentPane().add(lblAjoutBien);
		
		JButton btnAjoutBien = new JButton("Ajouter un bien");
		btnAjoutBien.addActionListener(this.gestionBiensImmobilier);
		btnAjoutBien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAjoutBien.setBounds(286, 7, 148, 23);
		getContentPane().add(btnAjoutBien);
		
	}

	public DetailsBien getDetailsBien() {
		return detailsBien;
	}

	public JTable getTableBien() {
		return this.TableBien;
	}
}
