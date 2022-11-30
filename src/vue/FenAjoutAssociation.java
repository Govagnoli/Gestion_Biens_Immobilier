package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;

import controleur.GestionAjoutAssociation;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class FenAjoutAssociation extends JFrame {

	private JPanel contentPane;
	private JTextField NomLocataire;
	private JTextField TelephoneLocataire;
	private JTextField EmailLocataire;
	private JTextField DateDeNaissanceLocataire;
	private GestionAjoutAssociation gestionAjoutAssociation;

	public FenAjoutAssociation() {
		
		this.gestionAjoutAssociation = new GestionAjoutAssociation(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitreAjoutLocataire = new JLabel("Ajouter une association :");
		lblTitreAjoutLocataire.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitreAjoutLocataire.setBounds(10, 11, 292, 25);
		contentPane.add(lblTitreAjoutLocataire);
		
		JPanel Informations = new JPanel();
		Informations.setBorder(new TitledBorder(null, "Informations g\u00E9n\u00E9rales", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Informations.setBounds(53, 46, 400, 212);
		contentPane.add(Informations);
		GridBagLayout gbl_Informations = new GridBagLayout();
		gbl_Informations.columnWidths = new int[] {121, 49, 0, 0, 0, 0, 30};
		gbl_Informations.rowHeights = new int[] {30, 0, 0, 0, 0, 30, 0};
		gbl_Informations.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_Informations.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		Informations.setLayout(gbl_Informations);
		
		JLabel lblNomAssociation = new JLabel("Nom Association :");
		GridBagConstraints gbc_lblNomAssociation = new GridBagConstraints();
		gbc_lblNomAssociation.anchor = GridBagConstraints.EAST;
		gbc_lblNomAssociation.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomAssociation.gridx = 0;
		gbc_lblNomAssociation.gridy = 1;
		Informations.add(lblNomAssociation, gbc_lblNomAssociation);
		
		NomLocataire = new JTextField();
		GridBagConstraints gbc_NomLocataire = new GridBagConstraints();
		gbc_NomLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_NomLocataire.gridwidth = 4;
		gbc_NomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_NomLocataire.gridx = 1;
		gbc_NomLocataire.gridy = 1;
		Informations.add(NomLocataire, gbc_NomLocataire);
		NomLocataire.setColumns(10);
		
		JLabel lblMailAssociation = new JLabel("E-mail :");
		GridBagConstraints gbc_lblMailAssociation = new GridBagConstraints();
		gbc_lblMailAssociation.anchor = GridBagConstraints.EAST;
		gbc_lblMailAssociation.insets = new Insets(0, 0, 5, 5);
		gbc_lblMailAssociation.gridx = 0;
		gbc_lblMailAssociation.gridy = 2;
		Informations.add(lblMailAssociation, gbc_lblMailAssociation);
		
		TelephoneLocataire = new JTextField();
		GridBagConstraints gbc_TelephoneLocataire = new GridBagConstraints();
		gbc_TelephoneLocataire.gridwidth = 4;
		gbc_TelephoneLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_TelephoneLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_TelephoneLocataire.gridx = 1;
		gbc_TelephoneLocataire.gridy = 2;
		Informations.add(TelephoneLocataire, gbc_TelephoneLocataire);
		TelephoneLocataire.setColumns(10);
		
		JLabel lblTelAssociation = new JLabel("T\u00E9l\u00E9phone  :");
		GridBagConstraints gbc_lblTelAssociation = new GridBagConstraints();
		gbc_lblTelAssociation.anchor = GridBagConstraints.EAST;
		gbc_lblTelAssociation.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelAssociation.gridx = 0;
		gbc_lblTelAssociation.gridy = 3;
		Informations.add(lblTelAssociation, gbc_lblTelAssociation);
		
		EmailLocataire = new JTextField();
		GridBagConstraints gbc_EmailLocataire = new GridBagConstraints();
		gbc_EmailLocataire.gridwidth = 4;
		gbc_EmailLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_EmailLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_EmailLocataire.gridx = 1;
		gbc_EmailLocataire.gridy = 3;
		Informations.add(EmailLocataire, gbc_EmailLocataire);
		EmailLocataire.setColumns(10);
		
		JLabel lblEmailLocataire = new JLabel("Montant donnation :");
		GridBagConstraints gbc_lblEmailLocataire = new GridBagConstraints();
		gbc_lblEmailLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblEmailLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailLocataire.gridx = 0;
		gbc_lblEmailLocataire.gridy = 4;
		Informations.add(lblEmailLocataire, gbc_lblEmailLocataire);
		
		DateDeNaissanceLocataire = new JTextField();
		GridBagConstraints gbc_DateDeNaissanceLocataire = new GridBagConstraints();
		gbc_DateDeNaissanceLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_DateDeNaissanceLocataire.gridwidth = 4;
		gbc_DateDeNaissanceLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_DateDeNaissanceLocataire.gridx = 1;
		gbc_DateDeNaissanceLocataire.gridy = 4;
		Informations.add(DateDeNaissanceLocataire, gbc_DateDeNaissanceLocataire);
		DateDeNaissanceLocataire.setColumns(10);
		
		JLabel lblAncien = new JLabel("Fr\u00E9quence donation :");
		GridBagConstraints gbc_lblAncien = new GridBagConstraints();
		gbc_lblAncien.anchor = GridBagConstraints.EAST;
		gbc_lblAncien.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncien.gridx = 0;
		gbc_lblAncien.gridy = 6;
		Informations.add(lblAncien, gbc_lblAncien);
		
		JRadioButton rdbtnAncienNon = new JRadioButton("Mensuel ");
		rdbtnAncienNon.setSelected(true);
		GridBagConstraints gbc_rdbtnAncienNon = new GridBagConstraints();
		gbc_rdbtnAncienNon.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAncienNon.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAncienNon.gridx = 1;
		gbc_rdbtnAncienNon.gridy = 6;
		Informations.add(rdbtnAncienNon, gbc_rdbtnAncienNon);
		
		JRadioButton rdbtnAncienOui = new JRadioButton("Ponctuel ");
		GridBagConstraints gbc_rdbtnAncienOui = new GridBagConstraints();
		gbc_rdbtnAncienOui.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAncienOui.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAncienOui.gridx = 2;
		gbc_rdbtnAncienOui.gridy = 6;
		Informations.add(rdbtnAncienOui, gbc_rdbtnAncienOui);
		
		JButton btnAjouterLocataire = new JButton("Ajouter");
		btnAjouterLocataire.addActionListener(this.gestionAjoutAssociation);
		btnAjouterLocataire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAjouterLocataire.setBounds(53, 268, 171, 35);
		contentPane.add(btnAjouterLocataire);
		
		JButton btnAnnulerAjoutLocataire = new JButton("Annuler");
		btnAnnulerAjoutLocataire.addActionListener(this.gestionAjoutAssociation);
		btnAnnulerAjoutLocataire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAnnulerAjoutLocataire.setBounds(384, 322, 99, 34);
		contentPane.add(btnAnnulerAjoutLocataire);
	}
}
