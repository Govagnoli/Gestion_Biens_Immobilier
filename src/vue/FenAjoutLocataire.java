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
	private JTextField prenomLocataire;
	private JTextField nomLocataire;
	private JTextField telephoneLocataire;
	private JTextField emailLocataire;
	private JTextField dateDeNaissanceLocataire;
	private JTextField adresseBienLocataire;
	private JTextField dateEntree;
	private JTextField NomGarant;
	private JTextField prenomGarant;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private GestionFermerPages gestionFermerPages;

	/**
	 * Create the frame.
	 */
	public FenAjoutLocataire() {
		
		this.gestionAjoutLocataire = new GestionAjoutLocataire(this);
		this.gestionFermerPages = new GestionFermerPages(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 432);
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
		
		JLabel lblPrenomLocataire = new JLabel("Prenom :");
		GridBagConstraints gbc_lblPrenomLocataire = new GridBagConstraints();
		gbc_lblPrenomLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblPrenomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrenomLocataire.gridx = 0;
		gbc_lblPrenomLocataire.gridy = 0;
		Informations.add(lblPrenomLocataire, gbc_lblPrenomLocataire);
		
		nomLocataire = new JTextField();
		GridBagConstraints gbc_NomLocataire = new GridBagConstraints();
		gbc_NomLocataire.gridwidth = 3;
		gbc_NomLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_NomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_NomLocataire.gridx = 1;
		gbc_NomLocataire.gridy = 0;
		Informations.add(nomLocataire, gbc_NomLocataire);
		nomLocataire.setColumns(10);
		
		JLabel lblNomLocataire = new JLabel("Nom :");
		GridBagConstraints gbc_lblNomLocataire = new GridBagConstraints();
		gbc_lblNomLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblNomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomLocataire.gridx = 0;
		gbc_lblNomLocataire.gridy = 1;
		Informations.add(lblNomLocataire, gbc_lblNomLocataire);
		
		telephoneLocataire = new JTextField();
		GridBagConstraints gbc_TelephoneLocataire = new GridBagConstraints();
		gbc_TelephoneLocataire.gridwidth = 3;
		gbc_TelephoneLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_TelephoneLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_TelephoneLocataire.gridx = 1;
		gbc_TelephoneLocataire.gridy = 1;
		Informations.add(telephoneLocataire, gbc_TelephoneLocataire);
		telephoneLocataire.setColumns(10);
		
		JLabel lblTelLocataire = new JLabel("Telephone :");
		GridBagConstraints gbc_lblTelLocataire = new GridBagConstraints();
		gbc_lblTelLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblTelLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelLocataire.gridx = 0;
		gbc_lblTelLocataire.gridy = 2;
		Informations.add(lblTelLocataire, gbc_lblTelLocataire);
		
		emailLocataire = new JTextField();
		GridBagConstraints gbc_EmailLocataire = new GridBagConstraints();
		gbc_EmailLocataire.gridwidth = 3;
		gbc_EmailLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_EmailLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_EmailLocataire.gridx = 1;
		gbc_EmailLocataire.gridy = 2;
		Informations.add(emailLocataire, gbc_EmailLocataire);
		emailLocataire.setColumns(10);
		
		JLabel lblEmailLocataire = new JLabel("E-mail :");
		GridBagConstraints gbc_lblEmailLocataire = new GridBagConstraints();
		gbc_lblEmailLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblEmailLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailLocataire.gridx = 0;
		gbc_lblEmailLocataire.gridy = 3;
		Informations.add(lblEmailLocataire, gbc_lblEmailLocataire);
		
		dateDeNaissanceLocataire = new JTextField();
		GridBagConstraints gbc_DateDeNaissanceLocataire = new GridBagConstraints();
		gbc_DateDeNaissanceLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_DateDeNaissanceLocataire.gridwidth = 3;
		gbc_DateDeNaissanceLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_DateDeNaissanceLocataire.gridx = 1;
		gbc_DateDeNaissanceLocataire.gridy = 3;
		Informations.add(dateDeNaissanceLocataire, gbc_DateDeNaissanceLocataire);
		dateDeNaissanceLocataire.setColumns(10);
		
		JLabel lblDateNaissanceLocataire = new JLabel("Date de naissance :");
		GridBagConstraints gbc_lblDateNaissanceLocataire = new GridBagConstraints();
		gbc_lblDateNaissanceLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblDateNaissanceLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateNaissanceLocataire.gridx = 0;
		gbc_lblDateNaissanceLocataire.gridy = 4;
		Informations.add(lblDateNaissanceLocataire, gbc_lblDateNaissanceLocataire);
		
		prenomLocataire = new JTextField();
		GridBagConstraints gbc_PrenomLocataire = new GridBagConstraints();
		gbc_PrenomLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_PrenomLocataire.gridwidth = 3;
		gbc_PrenomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_PrenomLocataire.gridx = 1;
		gbc_PrenomLocataire.gridy = 4;
		Informations.add(prenomLocataire, gbc_PrenomLocataire);
		prenomLocataire.setColumns(10);
		
		JLabel lblAncien = new JLabel("Ancien :");
		GridBagConstraints gbc_lblAncien = new GridBagConstraints();
		gbc_lblAncien.anchor = GridBagConstraints.EAST;
		gbc_lblAncien.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncien.gridx = 0;
		gbc_lblAncien.gridy = 6;
		Informations.add(lblAncien, gbc_lblAncien);
		
		JRadioButton rdbtnAncienNon = new JRadioButton("Non");
		rdbtnAncienNon.setSelected(true);
		GridBagConstraints gbc_rdbtnAncienNon = new GridBagConstraints();
		gbc_rdbtnAncienNon.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAncienNon.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAncienNon.gridx = 1;
		gbc_rdbtnAncienNon.gridy = 6;
		Informations.add(rdbtnAncienNon, gbc_rdbtnAncienNon);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdbtnAncienOui = new JRadioButton("oui");
		GridBagConstraints gbc_rdbtnAncienOui = new GridBagConstraints();
		gbc_rdbtnAncienOui.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAncienOui.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAncienOui.gridx = 2;
		gbc_rdbtnAncienOui.gridy = 6;
		Informations.add(rdbtnAncienOui, gbc_rdbtnAncienOui);
		group.add(rdbtnAncienOui);
		
		JLabel lblAdresseLocataire = new JLabel("Adresse bien :");
		GridBagConstraints gbc_lblAdresseLocataire = new GridBagConstraints();
		gbc_lblAdresseLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblAdresseLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresseLocataire.gridx = 0;
		gbc_lblAdresseLocataire.gridy = 7;
		Informations.add(lblAdresseLocataire, gbc_lblAdresseLocataire);
		group.add(rdbtnAncienNon);
		
		adresseBienLocataire = new JTextField();
		GridBagConstraints gbc_adresseBienLocataire = new GridBagConstraints();
		gbc_adresseBienLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_adresseBienLocataire.gridwidth = 3;
		gbc_adresseBienLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_adresseBienLocataire.gridx = 1;
		gbc_adresseBienLocataire.gridy = 7;
		Informations.add(adresseBienLocataire, gbc_adresseBienLocataire);
		adresseBienLocataire.setColumns(10);
		
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
		btnAnnulerAjoutLocataire.setBounds(454, 372, 99, 23);
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
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblVilleGarant = new JLabel("Ville :");
		GridBagConstraints gbc_lblVilleGarant = new GridBagConstraints();
		gbc_lblVilleGarant.anchor = GridBagConstraints.EAST;
		gbc_lblVilleGarant.insets = new Insets(0, 0, 5, 5);
		gbc_lblVilleGarant.gridx = 1;
		gbc_lblVilleGarant.gridy = 4;
		panel.add(lblVilleGarant, gbc_lblVilleGarant);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 4;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCPGarant = new JLabel("CP :");
		GridBagConstraints gbc_lblCPGarant = new GridBagConstraints();
		gbc_lblCPGarant.anchor = GridBagConstraints.EAST;
		gbc_lblCPGarant.insets = new Insets(0, 0, 5, 5);
		gbc_lblCPGarant.gridx = 1;
		gbc_lblCPGarant.gridy = 5;
		panel.add(lblCPGarant, gbc_lblCPGarant);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 5;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTelephoneGarant = new JLabel("Téléphone :");
		GridBagConstraints gbc_lblTelephoneGarant = new GridBagConstraints();
		gbc_lblTelephoneGarant.anchor = GridBagConstraints.EAST;
		gbc_lblTelephoneGarant.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelephoneGarant.gridx = 1;
		gbc_lblTelephoneGarant.gridy = 6;
		panel.add(lblTelephoneGarant, gbc_lblTelephoneGarant);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 3;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 6;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmailGarant = new JLabel("Email :");
		GridBagConstraints gbc_lblEmailGarant = new GridBagConstraints();
		gbc_lblEmailGarant.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblEmailGarant.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailGarant.gridx = 1;
		gbc_lblEmailGarant.gridy = 7;
		panel.add(lblEmailGarant, gbc_lblEmailGarant);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 3;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 7;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JButton btnAjoutGarant = new JButton("Ajouter un garant");
		GridBagConstraints gbc_btnAjoutGarant = new GridBagConstraints();
		gbc_btnAjoutGarant.gridwidth = 4;
		gbc_btnAjoutGarant.insets = new Insets(0, 0, 5, 5);
		gbc_btnAjoutGarant.gridx = 1;
		gbc_btnAjoutGarant.gridy = 9;
		panel.add(btnAjoutGarant, gbc_btnAjoutGarant);
		
		
	}
}