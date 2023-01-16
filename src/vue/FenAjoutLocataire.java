package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import controleur.GestionAjoutLocataire;
import controleur.GestionFermerPages;

public class FenAjoutLocataire extends JFrame{

	private JPanel contentPane;
	private GestionAjoutLocataire gestionAjoutLocataire;
	public JTextField prenomLocataire;
	private JTextField nomLocataire;
	private JTextField telephoneLocataire;
	private JTextField emailLocataire;
	private JTextField dateDeNaissanceLocataire;
	private JTextField adresseBienLocataire;
	private JTextField dateEntree;
	private JTextField NomGarant;
	private JTextField prenomGarant;
	private JTextField adresseGarant;
	private JTextField villeGarant;
	private JTextField codePostalGarant;
	private JTextField telephoneGarant;
	private JTextField emailGarant;
	private GestionFermerPages gestionFermerPages;
	private JRadioButton rdbtnAncienNon;
	private JRadioButton rdbtnAncienOui;
	private JTextField numeroBienLocataire;

	public FenAjoutLocataire() {
		
		this.gestionAjoutLocataire = new GestionAjoutLocataire(this);
		this.gestionFermerPages = new GestionFermerPages(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitreAjoutLocataire = new JLabel("Ajouter un nouveau locataire");
		lblTitreAjoutLocataire.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitreAjoutLocataire.setBounds(10, 11, 292, 25);
		contentPane.add(lblTitreAjoutLocataire);
		
		JPanel Informations = new JPanel();
		Informations.setBorder(new TitledBorder(null, "Informations g\u00E9n\u00E9rales", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Informations.setBounds(10, 47, 292, 291);
		contentPane.add(Informations);
		GridBagLayout gbl_Informations = new GridBagLayout();
		gbl_Informations.columnWidths = new int[] {121, 30, 0, 30, 30};
		gbl_Informations.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Informations.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0};
		gbl_Informations.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		Informations.setLayout(gbl_Informations);
		
		JLabel lblNomLocataire = new JLabel("Nom :");
		GridBagConstraints gbc_lblNomLocataire = new GridBagConstraints();
		gbc_lblNomLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblNomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomLocataire.gridx = 0;
		gbc_lblNomLocataire.gridy = 0;
		Informations.add(lblNomLocataire, gbc_lblNomLocataire);
		
		nomLocataire = new JTextField();
		GridBagConstraints gbc_NomLocataire = new GridBagConstraints();
		gbc_NomLocataire.gridwidth = 3;
		gbc_NomLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_NomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_NomLocataire.gridx = 1;
		gbc_NomLocataire.gridy = 0;
		Informations.add(nomLocataire, gbc_NomLocataire);
		nomLocataire.setColumns(10);
		
		JLabel lblPrenomLocataire = new JLabel("Prenom :");
		GridBagConstraints gbc_lblPrenomLocataire = new GridBagConstraints();
		gbc_lblPrenomLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblPrenomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrenomLocataire.gridx = 0;
		gbc_lblPrenomLocataire.gridy = 1;
		Informations.add(lblPrenomLocataire, gbc_lblPrenomLocataire);
		
		prenomLocataire = new JTextField();
		GridBagConstraints gbc_PrenomLocataire = new GridBagConstraints();
		gbc_PrenomLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_PrenomLocataire.gridwidth = 3;
		gbc_PrenomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_PrenomLocataire.gridx = 1;
		gbc_PrenomLocataire.gridy = 1;
		Informations.add(prenomLocataire, gbc_PrenomLocataire);
		prenomLocataire.setColumns(10);
		
		JLabel lblTelLocataire = new JLabel("Telephone :");
		GridBagConstraints gbc_lblTelLocataire = new GridBagConstraints();
		gbc_lblTelLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblTelLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelLocataire.gridx = 0;
		gbc_lblTelLocataire.gridy = 2;
		Informations.add(lblTelLocataire, gbc_lblTelLocataire);
		
		telephoneLocataire = new JTextField();
		GridBagConstraints gbc_TelephoneLocataire = new GridBagConstraints();
		gbc_TelephoneLocataire.gridwidth = 3;
		gbc_TelephoneLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_TelephoneLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_TelephoneLocataire.gridx = 1;
		gbc_TelephoneLocataire.gridy = 2;
		Informations.add(telephoneLocataire, gbc_TelephoneLocataire);
		telephoneLocataire.setColumns(10);
		
		JLabel lblEmailLocataire = new JLabel("E-mail :");
		GridBagConstraints gbc_lblEmailLocataire = new GridBagConstraints();
		gbc_lblEmailLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblEmailLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailLocataire.gridx = 0;
		gbc_lblEmailLocataire.gridy = 3;
		Informations.add(lblEmailLocataire, gbc_lblEmailLocataire);
		
		emailLocataire = new JTextField();
		GridBagConstraints gbc_EmailLocataire = new GridBagConstraints();
		gbc_EmailLocataire.gridwidth = 3;
		gbc_EmailLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_EmailLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_EmailLocataire.gridx = 1;
		gbc_EmailLocataire.gridy = 3;
		Informations.add(emailLocataire, gbc_EmailLocataire);
		emailLocataire.setColumns(10);
		
		JLabel lblDateNaissanceLocataire = new JLabel("Date de naissance :");
		GridBagConstraints gbc_lblDateNaissanceLocataire = new GridBagConstraints();
		gbc_lblDateNaissanceLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblDateNaissanceLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateNaissanceLocataire.gridx = 0;
		gbc_lblDateNaissanceLocataire.gridy = 4;
		Informations.add(lblDateNaissanceLocataire, gbc_lblDateNaissanceLocataire);
		
		dateDeNaissanceLocataire = new JTextField();
		GridBagConstraints gbc_DateDeNaissanceLocataire = new GridBagConstraints();
		gbc_DateDeNaissanceLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_DateDeNaissanceLocataire.gridwidth = 3;
		gbc_DateDeNaissanceLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_DateDeNaissanceLocataire.gridx = 1;
		gbc_DateDeNaissanceLocataire.gridy = 4;
		Informations.add(dateDeNaissanceLocataire, gbc_DateDeNaissanceLocataire);
		dateDeNaissanceLocataire.setColumns(10);
		
		JLabel lblAncien = new JLabel("Ancien :");
		GridBagConstraints gbc_lblAncien = new GridBagConstraints();
		gbc_lblAncien.anchor = GridBagConstraints.EAST;
		gbc_lblAncien.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncien.gridx = 0;
		gbc_lblAncien.gridy = 5;
		Informations.add(lblAncien, gbc_lblAncien);
		
		ButtonGroup group = new ButtonGroup();
		
		this.rdbtnAncienNon = new JRadioButton("Non");
		this.rdbtnAncienNon.addItemListener(this.gestionAjoutLocataire);
		this.rdbtnAncienNon.setSelected(true);
		GridBagConstraints gbc_rdbtnAncienNon = new GridBagConstraints();
		gbc_rdbtnAncienNon.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAncienNon.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAncienNon.gridx = 1;
		gbc_rdbtnAncienNon.gridy = 5;
		Informations.add(this.rdbtnAncienNon, gbc_rdbtnAncienNon);
		group.add(rdbtnAncienNon);
		
		this.rdbtnAncienOui = new JRadioButton("oui");
		GridBagConstraints gbc_rdbtnAncienOui = new GridBagConstraints();
		gbc_rdbtnAncienOui.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAncienOui.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAncienOui.gridx = 2;
		gbc_rdbtnAncienOui.gridy = 5;
		Informations.add(this.rdbtnAncienOui, gbc_rdbtnAncienOui);
		group.add(this.rdbtnAncienOui);
		
		JLabel lblAdresseLocataire = new JLabel("Adresse bien :");
		GridBagConstraints gbc_lblAdresseLocataire = new GridBagConstraints();
		gbc_lblAdresseLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblAdresseLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresseLocataire.gridx = 0;
		gbc_lblAdresseLocataire.gridy = 6;
		Informations.add(lblAdresseLocataire, gbc_lblAdresseLocataire);
		
		adresseBienLocataire = new JTextField();
		GridBagConstraints gbc_adresseBienLocataire = new GridBagConstraints();
		gbc_adresseBienLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_adresseBienLocataire.gridwidth = 3;
		gbc_adresseBienLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_adresseBienLocataire.gridx = 1;
		gbc_adresseBienLocataire.gridy = 6;
		Informations.add(adresseBienLocataire, gbc_adresseBienLocataire);
		adresseBienLocataire.setColumns(10);
		
		JLabel lblNumeroBien = new JLabel("Numero du bien : ");
		GridBagConstraints gbc_lblNumeroBien = new GridBagConstraints();
		gbc_lblNumeroBien.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroBien.anchor = GridBagConstraints.EAST;
		gbc_lblNumeroBien.gridx = 0;
		gbc_lblNumeroBien.gridy = 7;
		Informations.add(lblNumeroBien, gbc_lblNumeroBien);
		
		numeroBienLocataire = new JTextField();
		GridBagConstraints gbc_numeroBienLocataire = new GridBagConstraints();
		gbc_numeroBienLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_numeroBienLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_numeroBienLocataire.gridx = 1;
		gbc_numeroBienLocataire.gridy = 7;
		Informations.add(numeroBienLocataire, gbc_numeroBienLocataire);
		numeroBienLocataire.setColumns(10);
		
		JLabel lblDateEntreeLocataire = new JLabel("Date d'entree :");
		GridBagConstraints gbc_lblDateEntreeLocataire = new GridBagConstraints();
		gbc_lblDateEntreeLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblDateEntreeLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateEntreeLocataire.gridx = 0;
		gbc_lblDateEntreeLocataire.gridy = 8;
		Informations.add(lblDateEntreeLocataire, gbc_lblDateEntreeLocataire);
		
		dateEntree = new JTextField();
		GridBagConstraints gbc_dateEntree = new GridBagConstraints();
		gbc_dateEntree.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateEntree.gridwidth = 3;
		gbc_dateEntree.insets = new Insets(0, 0, 5, 5);
		gbc_dateEntree.gridx = 1;
		gbc_dateEntree.gridy = 8;
		Informations.add(dateEntree, gbc_dateEntree);
		dateEntree.setColumns(10);
		
		JLabel lblBailLocataire = new JLabel("Bail :");
		GridBagConstraints gbc_lblBailLocataire = new GridBagConstraints();
		gbc_lblBailLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblBailLocataire.insets = new Insets(0, 0, 0, 5);
		gbc_lblBailLocataire.gridx = 0;
		gbc_lblBailLocataire.gridy = 9;
		Informations.add(lblBailLocataire, gbc_lblBailLocataire);
		
		JButton btnAjouterLocataire = new JButton("Ajouter");
		btnAjouterLocataire.addActionListener(this.gestionAjoutLocataire);
		btnAjouterLocataire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAjouterLocataire.setBounds(20, 350, 171, 35);
		contentPane.add(btnAjouterLocataire);
		
		JButton btnAnnulerAjoutLocataire = new JButton("Annuler");
		btnAnnulerAjoutLocataire.addActionListener(this.gestionFermerPages);
		btnAnnulerAjoutLocataire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAnnulerAjoutLocataire.setBounds(454, 356, 99, 23);
		contentPane.add(btnAnnulerAjoutLocataire);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Garant(s)", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(312, 47, 241, 291);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[] {30, 0, 0, 0, 0, 0, 0, 0, 30, 0, 30};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel);
		
		JLabel lblNomGarantLocataire = new JLabel("Nom :");
		GridBagConstraints gbc_lblNomGarantLocataire = new GridBagConstraints();
		gbc_lblNomGarantLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblNomGarantLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomGarantLocataire.gridx = 1;
		gbc_lblNomGarantLocataire.gridy = 1;
		panel.add(lblNomGarantLocataire, gbc_lblNomGarantLocataire);
		
		NomGarant = new JTextField();
		GridBagConstraints gbc_NomGarant = new GridBagConstraints();
		gbc_NomGarant.fill = GridBagConstraints.HORIZONTAL;
		gbc_NomGarant.gridwidth = 3;
		gbc_NomGarant.insets = new Insets(0, 0, 5, 5);
		gbc_NomGarant.gridx = 2;
		gbc_NomGarant.gridy = 1;
		panel.add(NomGarant, gbc_NomGarant);
		NomGarant.setColumns(10);
		
		JLabel lblPrenomGarantLocataire = new JLabel("Prenom :");
		GridBagConstraints gbc_lblPrenomGarantLocataire = new GridBagConstraints();
		gbc_lblPrenomGarantLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblPrenomGarantLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrenomGarantLocataire.gridx = 1;
		gbc_lblPrenomGarantLocataire.gridy = 2;
		panel.add(lblPrenomGarantLocataire, gbc_lblPrenomGarantLocataire);
		
		prenomGarant = new JTextField();
		GridBagConstraints gbc_prenomGarant = new GridBagConstraints();
		gbc_prenomGarant.fill = GridBagConstraints.HORIZONTAL;
		gbc_prenomGarant.insets = new Insets(0, 0, 5, 5);
		gbc_prenomGarant.gridwidth = 3;
		gbc_prenomGarant.gridx = 2;
		gbc_prenomGarant.gridy = 2;
		panel.add(prenomGarant, gbc_prenomGarant);
		prenomGarant.setColumns(10);
		
		JLabel lblAdresseGarant = new JLabel("Adresse :");
		GridBagConstraints gbc_lblAdresseGarant = new GridBagConstraints();
		gbc_lblAdresseGarant.anchor = GridBagConstraints.EAST;
		gbc_lblAdresseGarant.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresseGarant.gridx = 1;
		gbc_lblAdresseGarant.gridy = 3;
		panel.add(lblAdresseGarant, gbc_lblAdresseGarant);
		
		adresseGarant = new JTextField();
		GridBagConstraints gbc_adresseGarant = new GridBagConstraints();
		gbc_adresseGarant.gridwidth = 3;
		gbc_adresseGarant.insets = new Insets(0, 0, 5, 5);
		gbc_adresseGarant.fill = GridBagConstraints.HORIZONTAL;
		gbc_adresseGarant.gridx = 2;
		gbc_adresseGarant.gridy = 3;
		panel.add(adresseGarant, gbc_adresseGarant);
		adresseGarant.setColumns(10);
		
		JLabel lblVilleGarant = new JLabel("Ville :");
		GridBagConstraints gbc_lblVilleGarant = new GridBagConstraints();
		gbc_lblVilleGarant.anchor = GridBagConstraints.EAST;
		gbc_lblVilleGarant.insets = new Insets(0, 0, 5, 5);
		gbc_lblVilleGarant.gridx = 1;
		gbc_lblVilleGarant.gridy = 4;
		panel.add(lblVilleGarant, gbc_lblVilleGarant);
		
		villeGarant = new JTextField();
		GridBagConstraints gbc_villeGarant = new GridBagConstraints();
		gbc_villeGarant.gridwidth = 3;
		gbc_villeGarant.insets = new Insets(0, 0, 5, 5);
		gbc_villeGarant.fill = GridBagConstraints.HORIZONTAL;
		gbc_villeGarant.gridx = 2;
		gbc_villeGarant.gridy = 4;
		panel.add(villeGarant, gbc_villeGarant);
		villeGarant.setColumns(10);
		
		JLabel lblCPGarant = new JLabel("CP :");
		GridBagConstraints gbc_lblCPGarant = new GridBagConstraints();
		gbc_lblCPGarant.anchor = GridBagConstraints.EAST;
		gbc_lblCPGarant.insets = new Insets(0, 0, 5, 5);
		gbc_lblCPGarant.gridx = 1;
		gbc_lblCPGarant.gridy = 5;
		panel.add(lblCPGarant, gbc_lblCPGarant);
		
		codePostalGarant = new JTextField();
		GridBagConstraints gbc_codePostalGarant = new GridBagConstraints();
		gbc_codePostalGarant.gridwidth = 3;
		gbc_codePostalGarant.insets = new Insets(0, 0, 5, 5);
		gbc_codePostalGarant.fill = GridBagConstraints.HORIZONTAL;
		gbc_codePostalGarant.gridx = 2;
		gbc_codePostalGarant.gridy = 5;
		panel.add(codePostalGarant, gbc_codePostalGarant);
		codePostalGarant.setColumns(10);
		
		JLabel lblTelephoneGarant = new JLabel("Téléphone :");
		GridBagConstraints gbc_lblTelephoneGarant = new GridBagConstraints();
		gbc_lblTelephoneGarant.anchor = GridBagConstraints.EAST;
		gbc_lblTelephoneGarant.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelephoneGarant.gridx = 1;
		gbc_lblTelephoneGarant.gridy = 6;
		panel.add(lblTelephoneGarant, gbc_lblTelephoneGarant);
		
		telephoneGarant = new JTextField();
		GridBagConstraints gbc_telephoneGarant = new GridBagConstraints();
		gbc_telephoneGarant.gridwidth = 3;
		gbc_telephoneGarant.insets = new Insets(0, 0, 5, 5);
		gbc_telephoneGarant.fill = GridBagConstraints.HORIZONTAL;
		gbc_telephoneGarant.gridx = 2;
		gbc_telephoneGarant.gridy = 6;
		panel.add(telephoneGarant, gbc_telephoneGarant);
		telephoneGarant.setColumns(10);
		
		JLabel lblEmailGarant = new JLabel("Email :");
		GridBagConstraints gbc_lblEmailGarant = new GridBagConstraints();
		gbc_lblEmailGarant.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblEmailGarant.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailGarant.gridx = 1;
		gbc_lblEmailGarant.gridy = 7;
		panel.add(lblEmailGarant, gbc_lblEmailGarant);
		
		emailGarant = new JTextField();
		GridBagConstraints gbc_emailGarant = new GridBagConstraints();
		gbc_emailGarant.gridwidth = 3;
		gbc_emailGarant.insets = new Insets(0, 0, 5, 5);
		gbc_emailGarant.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailGarant.gridx = 2;
		gbc_emailGarant.gridy = 7;
		panel.add(emailGarant, gbc_emailGarant);
		emailGarant.setColumns(10);
		
		JButton btnAjoutGarant = new JButton("Ajouter un garant");
		btnAjoutGarant.addActionListener(this.gestionAjoutLocataire);
		GridBagConstraints gbc_btnAjoutGarant = new GridBagConstraints();
		gbc_btnAjoutGarant.gridwidth = 4;
		gbc_btnAjoutGarant.insets = new Insets(0, 0, 5, 5);
		gbc_btnAjoutGarant.gridx = 1;
		gbc_btnAjoutGarant.gridy = 9;
		panel.add(btnAjoutGarant, gbc_btnAjoutGarant);
		
		
	}

	public String getNumeroBien() {
		return numeroBienLocataire.getText();
	}
	public String getPrenomLocataire() {
		return prenomLocataire.getText();
	}

	public String getNomLocataire() {
		return nomLocataire.getText();
	}

	public String getTelephoneLocataire() {
		return telephoneLocataire.getText();
	}

	public String getEmailLocataire() {
		return emailLocataire.getText();
	}

	public String getDateDeNaissanceLocataire() {
		return dateDeNaissanceLocataire.getText();
	}

	public String getAdresseBienLocataire() {
		return adresseBienLocataire.getText();
	}

	public String getDateEntree() {
		return dateEntree.getText();
	}

	public String getNomGarant() {
		return NomGarant.getText();
	}

	public String getPrenomGarant() {
		return prenomGarant.getText();
	}

	public String getAdresseGarant() {
		return adresseGarant.getText();
	}

	public String getVilleGarant() {
		return villeGarant.getText();
	}

	public String getCodePostalGarant() {
		return codePostalGarant.getText();
	}

	public String getTelephoneGarant() {
		return telephoneGarant.getText();
	}

	public String getEmailGarant() {
		return emailGarant.getText();
	}

	public JRadioButton getRdbtnAncienNon() {
		return rdbtnAncienNon;
	}

	public JRadioButton getRdbtnAncienOui() {
		return rdbtnAncienOui;
	}
}