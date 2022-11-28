package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controleur.GestionBiensImmobilier;
import controleur.GestionTableBiensImmobiliers;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.border.TitledBorder;
import java.awt.Rectangle;

public class FenBiensImmobilier extends JFrame {

	private JTable TableBien;
	private GestionTableBiensImmobiliers gestionTable;
	private GestionBiensImmobilier gestionClic;
	private DetailsBien detailsBien;

	public FenBiensImmobilier() {
		
		this.gestionClic = new GestionBiensImmobilier(this);
		this.gestionTable = new GestionTableBiensImmobiliers(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

		JMenu compte = new JMenu("Compte");
		menuBar.add(compte);		
		
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

		JMenuItem monCompte = new JMenuItem("Mon compte");
		monCompte.addActionListener(this.gestionClic);
		compte.add(monCompte);
		
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane);
		scrollPane.setBounds(0, 0, 1540, 500);
		
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
		
		this.getTableBien().getSelectionModel().addListSelectionListener(this.gestionTable);
		
		scrollPane.setViewportView(TableBien);
		
		JPanel panelPopUp = new JPanel();
		panelPopUp.setBounds(0, 500, 1540, 154);
		getContentPane().add(panelPopUp);
		
		this.detailsBien = new DetailsBien();
		this.detailsBien.setVisible(false);
		panelPopUp.add(this.detailsBien);
		
	}

	public DetailsBien getDetailsBien() {
		return detailsBien;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	public JTable getTableBien() {
		return this.TableBien;
	}
}
