package vue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controleur.GestionRegularisationDesCharges;

public class FenRegularisationCharges extends JFrame {

	private JPanel contentPane;
	private JTable tableRegularisationCharges;
	private GestionRegularisationDesCharges gestionClic;
	private JTable table;

	
	public FenRegularisationCharges() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(false);
		
		this.gestionClic = new GestionRegularisationDesCharges(this);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 37, 300, 239);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Identifiant", "Date"
			}
		));
		scrollPane.setViewportView(table);
		
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
	public JTable getTableRegularisationCharges() {
		return tableRegularisationCharges;
	}
}
	

