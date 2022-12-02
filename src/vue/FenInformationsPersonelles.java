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

import controleur.GestionInformationsPersonelles;
import controleur.GestionMenu;
import controleur.GestionTableAssociations;

import javax.swing.JButton;
import java.awt.BorderLayout;

public class FenInformationsPersonelles extends JFrame {

	private JPanel contentPane;
	private JTable tableAssociations;
	private GestionMenu gestionMenu;
	private JButton btnModifierAssociation;
	private GestionInformationsPersonelles gestionInformationsPersonelles;
	private GestionTableAssociations gestionTableInformationsPersonelles;

	public FenInformationsPersonelles() {
		
		this.gestionMenu = new GestionMenu(this);
		this.gestionInformationsPersonelles = new GestionInformationsPersonelles();
		this.gestionTableInformationsPersonelles = new GestionTableAssociations(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(false);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
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
		
		tableAssociations = new JTable();
		tableAssociations.setModel(new DefaultTableModel(
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
		));
		this.getTableAssociations().getSelectionModel().addListSelectionListener(this.gestionTableInformationsPersonelles);
		scrollPane.setViewportView(tableAssociations);
		
		JButton btnAjouterAssociation = new JButton("Ajouter");
		btnAjouterAssociation.addActionListener(this.gestionInformationsPersonelles);
		btnAjouterAssociation.setBounds(20, 143, 121, 23);
		DocCLient.add(btnAjouterAssociation);
		
		this.btnModifierAssociation = new JButton("Supprimer");
		this.btnModifierAssociation.setVisible(false);
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
		
		JPanel informationsGeneralesCLient = new JPanel();
		informationsGeneralesCLient.setBounds(136, 47, 231, 204);
		Page.add(informationsGeneralesCLient);
		informationsGeneralesCLient.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Information g\u00E9n\u00E9rales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagLayout gbl_informationsGeneralesCLient = new GridBagLayout();
		gbl_informationsGeneralesCLient.columnWidths = new int[] {30, 0, 30, 30};
		gbl_informationsGeneralesCLient.rowHeights = new int[] {30, 30, 30, 30, 30};
		gbl_informationsGeneralesCLient.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gbl_informationsGeneralesCLient.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		informationsGeneralesCLient.setLayout(gbl_informationsGeneralesCLient);
		
		JLabel lblNomClient = new JLabel("Nom :");
		lblNomClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNomClient = new GridBagConstraints();
		gbc_lblNomClient.anchor = GridBagConstraints.EAST;
		gbc_lblNomClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomClient.gridx = 1;
		gbc_lblNomClient.gridy = 0;
		informationsGeneralesCLient.add(lblNomClient, gbc_lblNomClient);
		
		JLabel NomClient = new JLabel("nom");
		GridBagConstraints gbc_NomClient = new GridBagConstraints();
		gbc_NomClient.anchor = GridBagConstraints.WEST;
		gbc_NomClient.insets = new Insets(0, 0, 5, 5);
		gbc_NomClient.gridx = 2;
		gbc_NomClient.gridy = 0;
		informationsGeneralesCLient.add(NomClient, gbc_NomClient);
		
		JLabel lblPrenomClient = new JLabel("Pr\u00E9nom :");
		lblPrenomClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblPrenomClient = new GridBagConstraints();
		gbc_lblPrenomClient.anchor = GridBagConstraints.EAST;
		gbc_lblPrenomClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrenomClient.gridx = 1;
		gbc_lblPrenomClient.gridy = 1;
		informationsGeneralesCLient.add(lblPrenomClient, gbc_lblPrenomClient);
		
		JLabel PrenomClient = new JLabel("Pr\u00E9nom");
		GridBagConstraints gbc_PrenomClient = new GridBagConstraints();
		gbc_PrenomClient.anchor = GridBagConstraints.WEST;
		gbc_PrenomClient.insets = new Insets(0, 0, 5, 5);
		gbc_PrenomClient.gridx = 2;
		gbc_PrenomClient.gridy = 1;
		informationsGeneralesCLient.add(PrenomClient, gbc_PrenomClient);
		
		JLabel lblTelephoneClient = new JLabel("T\u00E9l\u00E9phone :");
		lblTelephoneClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblTelephoneClient = new GridBagConstraints();
		gbc_lblTelephoneClient.anchor = GridBagConstraints.EAST;
		gbc_lblTelephoneClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelephoneClient.gridx = 1;
		gbc_lblTelephoneClient.gridy = 2;
		informationsGeneralesCLient.add(lblTelephoneClient, gbc_lblTelephoneClient);
		
		JLabel TelephoneClient = new JLabel("00-00-00-00-00");
		GridBagConstraints gbc_TelephoneClient = new GridBagConstraints();
		gbc_TelephoneClient.anchor = GridBagConstraints.WEST;
		gbc_TelephoneClient.insets = new Insets(0, 0, 5, 5);
		gbc_TelephoneClient.gridx = 2;
		gbc_TelephoneClient.gridy = 2;
		informationsGeneralesCLient.add(TelephoneClient, gbc_TelephoneClient);
		
		JLabel lblEmailClient = new JLabel("E-mail :");
		lblEmailClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblEmailClient = new GridBagConstraints();
		gbc_lblEmailClient.anchor = GridBagConstraints.EAST;
		gbc_lblEmailClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailClient.gridx = 1;
		gbc_lblEmailClient.gridy = 3;
		informationsGeneralesCLient.add(lblEmailClient, gbc_lblEmailClient);
		
		JLabel EmailClient = new JLabel("nomprenom@gmail.com");
		GridBagConstraints gbc_EmailClient = new GridBagConstraints();
		gbc_EmailClient.insets = new Insets(0, 0, 5, 5);
		gbc_EmailClient.gridx = 2;
		gbc_EmailClient.gridy = 3;
		informationsGeneralesCLient.add(EmailClient, gbc_EmailClient);
		
		JLabel lblAdresseClient = new JLabel("Adresse :");
		lblAdresseClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblAdresseClient = new GridBagConstraints();
		gbc_lblAdresseClient.anchor = GridBagConstraints.EAST;
		gbc_lblAdresseClient.insets = new Insets(0, 0, 0, 5);
		gbc_lblAdresseClient.gridx = 1;
		gbc_lblAdresseClient.gridy = 4;
		informationsGeneralesCLient.add(lblAdresseClient, gbc_lblAdresseClient);
		
		JLabel AdresseClient = new JLabel("14 rue des tuilerie");
		GridBagConstraints gbc_AdresseClient = new GridBagConstraints();
		gbc_AdresseClient.insets = new Insets(0, 0, 0, 5);
		gbc_AdresseClient.anchor = GridBagConstraints.WEST;
		gbc_AdresseClient.gridx = 2;
		gbc_AdresseClient.gridy = 4;
		informationsGeneralesCLient.add(AdresseClient, gbc_AdresseClient);
		
		JLabel lblBienvenue = new JLabel("Bienvenue,");
		lblBienvenue.setBounds(136, 11, 116, 25);
		Page.add(lblBienvenue);
		lblBienvenue.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}

	public JButton getBtnModifierAssociation() {
		return btnModifierAssociation;
	}

	public JTable getTableAssociations() {
		return tableAssociations;
	}
}
