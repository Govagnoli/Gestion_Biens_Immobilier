package vue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controleur.GestionInfoPersonnelles;

import javax.swing.JButton;
import java.awt.BorderLayout;

public class FenInformationsPersonelles extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public FenInformationsPersonelles() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(false);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
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
		biens.addActionListener(new GestionInfoPersonnelles(this));
		gestion.add(biens);
		
		JMenuItem locataires = new JMenuItem("Locataires");
		locataires.addActionListener(new GestionInfoPersonnelles(this));
		gestion.add(locataires);
		
		JMenuItem accueil = new JMenuItem("Accueil");
		accueil.addActionListener(new GestionInfoPersonnelles(this));
		accueil1.add(accueil);
				
		JMenuItem statistiques = new JMenuItem("Statistiques");
		statistiques.addActionListener(new GestionInfoPersonnelles(this));
		parametres.add(statistiques);
		
		JMenuItem fermer = new JMenuItem("Fermer");
		fermer.addActionListener(new GestionInfoPersonnelles(this));
		parametres.add(fermer);
		
		JMenuItem monCompte = new JMenuItem("Mon compte");
		monCompte.addActionListener(new GestionInfoPersonnelles(this));
		compte.add(monCompte);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel Page = new JPanel();
		contentPane.add(Page, BorderLayout.CENTER);
		Page.setLayout(null);
		
		JPanel DocCLient = new JPanel();
		DocCLient.setBounds(187, 296, 464, 185);
		Page.add(DocCLient);
		DocCLient.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Associations", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		DocCLient.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 23, 444, 109);
		DocCLient.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nom association", "Siren", "Date don", "Montant"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnAjouterAssociation = new JButton("Ajouter");
		btnAjouterAssociation.setBounds(20, 143, 121, 23);
		DocCLient.add(btnAjouterAssociation);
		
		JButton btnModifierAssociation = new JButton("Modifier");
		btnModifierAssociation.setBounds(329, 143, 89, 23);
		DocCLient.add(btnModifierAssociation);
		
		JPanel Documents = new JPanel();
		Documents.setBounds(473, 47, 220, 204);
		Page.add(Documents);
		Documents.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Documents", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagLayout gbl_Documents = new GridBagLayout();
		gbl_Documents.columnWidths = new int[]{0, 0};
		gbl_Documents.rowHeights = new int[]{0, 0};
		gbl_Documents.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_Documents.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		Documents.setLayout(gbl_Documents);
		
		JLabel lblDeclarationFiscaleClient = new JLabel("D\u00E9claration fiscale :");
		GridBagConstraints gbc_lblDeclarationFiscaleClient = new GridBagConstraints();
		gbc_lblDeclarationFiscaleClient.gridx = 0;
		gbc_lblDeclarationFiscaleClient.gridy = 0;
		Documents.add(lblDeclarationFiscaleClient, gbc_lblDeclarationFiscaleClient);
		
		JPanel informationsGénéralesCLient = new JPanel();
		informationsGénéralesCLient.setBounds(136, 47, 231, 204);
		Page.add(informationsGénéralesCLient);
		informationsGénéralesCLient.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Information g\u00E9n\u00E9rales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagLayout gbl_informationsGénéralesCLient = new GridBagLayout();
		gbl_informationsGénéralesCLient.columnWidths = new int[] {30, 0, 30, 30};
		gbl_informationsGénéralesCLient.rowHeights = new int[] {30, 30, 30, 30, 30};
		gbl_informationsGénéralesCLient.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gbl_informationsGénéralesCLient.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		informationsGénéralesCLient.setLayout(gbl_informationsGénéralesCLient);
		
		JLabel lblNomClient = new JLabel("Nom :");
		lblNomClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNomClient = new GridBagConstraints();
		gbc_lblNomClient.anchor = GridBagConstraints.EAST;
		gbc_lblNomClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomClient.gridx = 1;
		gbc_lblNomClient.gridy = 0;
		informationsGénéralesCLient.add(lblNomClient, gbc_lblNomClient);
		
		JLabel NomClient = new JLabel("nom");
		GridBagConstraints gbc_NomClient = new GridBagConstraints();
		gbc_NomClient.anchor = GridBagConstraints.WEST;
		gbc_NomClient.insets = new Insets(0, 0, 5, 5);
		gbc_NomClient.gridx = 2;
		gbc_NomClient.gridy = 0;
		informationsGénéralesCLient.add(NomClient, gbc_NomClient);
		
		JLabel lblPrenomClient = new JLabel("Pr\u00E9nom :");
		lblPrenomClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblPrenomClient = new GridBagConstraints();
		gbc_lblPrenomClient.anchor = GridBagConstraints.EAST;
		gbc_lblPrenomClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrenomClient.gridx = 1;
		gbc_lblPrenomClient.gridy = 1;
		informationsGénéralesCLient.add(lblPrenomClient, gbc_lblPrenomClient);
		
		JLabel PrenomClient = new JLabel("Pr\u00E9nom");
		GridBagConstraints gbc_PrenomClient = new GridBagConstraints();
		gbc_PrenomClient.anchor = GridBagConstraints.WEST;
		gbc_PrenomClient.insets = new Insets(0, 0, 5, 5);
		gbc_PrenomClient.gridx = 2;
		gbc_PrenomClient.gridy = 1;
		informationsGénéralesCLient.add(PrenomClient, gbc_PrenomClient);
		
		JLabel lblTelephoneClient = new JLabel("T\u00E9l\u00E9phone :");
		lblTelephoneClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblTelephoneClient = new GridBagConstraints();
		gbc_lblTelephoneClient.anchor = GridBagConstraints.EAST;
		gbc_lblTelephoneClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelephoneClient.gridx = 1;
		gbc_lblTelephoneClient.gridy = 2;
		informationsGénéralesCLient.add(lblTelephoneClient, gbc_lblTelephoneClient);
		
		JLabel TelephoneClient = new JLabel("00-00-00-00-00");
		GridBagConstraints gbc_TelephoneClient = new GridBagConstraints();
		gbc_TelephoneClient.anchor = GridBagConstraints.WEST;
		gbc_TelephoneClient.insets = new Insets(0, 0, 5, 5);
		gbc_TelephoneClient.gridx = 2;
		gbc_TelephoneClient.gridy = 2;
		informationsGénéralesCLient.add(TelephoneClient, gbc_TelephoneClient);
		
		JLabel lblEmailClient = new JLabel("E-mail :");
		lblEmailClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblEmailClient = new GridBagConstraints();
		gbc_lblEmailClient.anchor = GridBagConstraints.EAST;
		gbc_lblEmailClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailClient.gridx = 1;
		gbc_lblEmailClient.gridy = 3;
		informationsGénéralesCLient.add(lblEmailClient, gbc_lblEmailClient);
		
		JLabel EmailClient = new JLabel("nomprenom@gmail.com");
		GridBagConstraints gbc_EmailClient = new GridBagConstraints();
		gbc_EmailClient.insets = new Insets(0, 0, 5, 5);
		gbc_EmailClient.gridx = 2;
		gbc_EmailClient.gridy = 3;
		informationsGénéralesCLient.add(EmailClient, gbc_EmailClient);
		
		JLabel lblAdresseClient = new JLabel("Adresse :");
		lblAdresseClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblAdresseClient = new GridBagConstraints();
		gbc_lblAdresseClient.anchor = GridBagConstraints.EAST;
		gbc_lblAdresseClient.insets = new Insets(0, 0, 0, 5);
		gbc_lblAdresseClient.gridx = 1;
		gbc_lblAdresseClient.gridy = 4;
		informationsGénéralesCLient.add(lblAdresseClient, gbc_lblAdresseClient);
		
		JLabel AdresseClient = new JLabel("14 rue des tuilerie");
		GridBagConstraints gbc_AdresseClient = new GridBagConstraints();
		gbc_AdresseClient.insets = new Insets(0, 0, 0, 5);
		gbc_AdresseClient.anchor = GridBagConstraints.WEST;
		gbc_AdresseClient.gridx = 2;
		gbc_AdresseClient.gridy = 4;
		informationsGénéralesCLient.add(AdresseClient, gbc_AdresseClient);
		
		JLabel lblBienvenue = new JLabel("Bienvenue,");
		lblBienvenue.setBounds(136, 11, 116, 25);
		Page.add(lblBienvenue);
		lblBienvenue.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
}
