package vue;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import controleur.GestionFermerPages;
import controleur.GestionModifierLocataire;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class FenModifierLocataire extends JFrame {

	private JPanel contentPane;
	private JTextField prenomLocataire;
	private JTextField nomLocataire;
	private JTextField telephoneLocataire;
	private JTextField emailLocataire;
	private JTextField dateDeNaissanceLocataire;
	private JTextField adresseBienLocataire;
	private JTextField dateEntree;
	private JRadioButton rdbtnAncienNon;
	private JRadioButton rdbtnAncienOui;
	private GestionModifierLocataire gestionmodifierLocataire;
	private GestionFermerPages gestionFermerPages;

	
	public FenModifierLocataire() {
		
		this.gestionmodifierLocataire = new GestionModifierLocataire(this);
		this.gestionFermerPages = new GestionFermerPages(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Informations = new JPanel();
		Informations.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informations \u00E0 modifier", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Informations.setBounds(45, 54, 304, 269);
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
		
		this.rdbtnAncienNon = new JRadioButton("Non");
		this.rdbtnAncienNon.addItemListener(this.gestionmodifierLocataire);
		this.rdbtnAncienNon.setSelected(true);
		GridBagConstraints gbc_rdbtnAncienNon = new GridBagConstraints();
		gbc_rdbtnAncienNon.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAncienNon.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAncienNon.gridx = 1;
		gbc_rdbtnAncienNon.gridy = 6;
		Informations.add(this.rdbtnAncienNon, gbc_rdbtnAncienNon);
		
		ButtonGroup group = new ButtonGroup();
		
		this.rdbtnAncienOui = new JRadioButton("oui");
		GridBagConstraints gbc_rdbtnAncienOui = new GridBagConstraints();
		gbc_rdbtnAncienOui.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAncienOui.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAncienOui.gridx = 2;
		gbc_rdbtnAncienOui.gridy = 6;
		Informations.add(this.rdbtnAncienOui, gbc_rdbtnAncienOui);
		group.add(this.rdbtnAncienOui);
		
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
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(this.gestionFermerPages);
		btnAnnuler.setBounds(283, 334, 89, 23);
		contentPane.add(btnAnnuler);
		
		JLabel lblTitre = new JLabel("Modifier un locataire");
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitre.setBounds(10, 11, 186, 14);
		contentPane.add(lblTitre);
		
		JButton btnAjouter = new JButton("Modifier");
		btnAjouter.addActionListener(this.gestionmodifierLocataire);
		btnAjouter.setBounds(55, 330, 116, 31);
		contentPane.add(btnAjouter);
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
	
	public JRadioButton getRdbtnAncienNon() {
		return rdbtnAncienNon;
	}

}
