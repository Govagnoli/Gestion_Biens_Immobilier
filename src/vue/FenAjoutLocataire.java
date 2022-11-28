package vue;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;
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

public class FenAjoutLocataire extends JInternalFrame {

	private JPanel contentPane;
	private ActionListener gestionClic;
	private JTextField PrenomLocataire;
	private JTextField NomLocataire;
	private JTextField TelephoneLocataire;
	private JTextField EmailLocataire;
	private JTextField DateDeNaissanceLocataire;
	private JTextField AdresseBienLocataire;
	private JTextField DateEntrée;
	private JTextField NomGarant;
	private JTextField PrenomGarant;

	/**
	 * Create the frame.
	 */
	public FenAjoutLocataire() {
		setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 432);
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
		Informations.setBounds(10, 47, 292, 254);
		contentPane.add(Informations);
		GridBagLayout gbl_Informations = new GridBagLayout();
		gbl_Informations.columnWidths = new int[] {121, 30, 0, 0, 0, 0};
		gbl_Informations.rowHeights = new int[]{14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Informations.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Informations.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Informations.setLayout(gbl_Informations);
		
		JLabel lblPrenomLocataire = new JLabel("Pr\u00E9nom :");
		GridBagConstraints gbc_lblPrenomLocataire = new GridBagConstraints();
		gbc_lblPrenomLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblPrenomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrenomLocataire.gridx = 0;
		gbc_lblPrenomLocataire.gridy = 1;
		Informations.add(lblPrenomLocataire, gbc_lblPrenomLocataire);
		
		NomLocataire = new JTextField();
		GridBagConstraints gbc_NomLocataire = new GridBagConstraints();
		gbc_NomLocataire.gridwidth = 3;
		gbc_NomLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_NomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_NomLocataire.gridx = 1;
		gbc_NomLocataire.gridy = 1;
		Informations.add(NomLocataire, gbc_NomLocataire);
		NomLocataire.setColumns(10);
		
		JLabel lblNomLocataire = new JLabel("Nom :");
		GridBagConstraints gbc_lblNomLocataire = new GridBagConstraints();
		gbc_lblNomLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblNomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomLocataire.gridx = 0;
		gbc_lblNomLocataire.gridy = 2;
		Informations.add(lblNomLocataire, gbc_lblNomLocataire);
		
		TelephoneLocataire = new JTextField();
		GridBagConstraints gbc_TelephoneLocataire = new GridBagConstraints();
		gbc_TelephoneLocataire.gridwidth = 3;
		gbc_TelephoneLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_TelephoneLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_TelephoneLocataire.gridx = 1;
		gbc_TelephoneLocataire.gridy = 2;
		Informations.add(TelephoneLocataire, gbc_TelephoneLocataire);
		TelephoneLocataire.setColumns(10);
		
		JLabel lblTelLocataire = new JLabel("T\u00E9l\u00E9phone :");
		GridBagConstraints gbc_lblTelLocataire = new GridBagConstraints();
		gbc_lblTelLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblTelLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelLocataire.gridx = 0;
		gbc_lblTelLocataire.gridy = 3;
		Informations.add(lblTelLocataire, gbc_lblTelLocataire);
		
		EmailLocataire = new JTextField();
		GridBagConstraints gbc_EmailLocataire = new GridBagConstraints();
		gbc_EmailLocataire.gridwidth = 3;
		gbc_EmailLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_EmailLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_EmailLocataire.gridx = 1;
		gbc_EmailLocataire.gridy = 3;
		Informations.add(EmailLocataire, gbc_EmailLocataire);
		EmailLocataire.setColumns(10);
		
		JLabel lblEmailLocataire = new JLabel("E-mail :");
		GridBagConstraints gbc_lblEmailLocataire = new GridBagConstraints();
		gbc_lblEmailLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblEmailLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailLocataire.gridx = 0;
		gbc_lblEmailLocataire.gridy = 4;
		Informations.add(lblEmailLocataire, gbc_lblEmailLocataire);
		
		DateDeNaissanceLocataire = new JTextField();
		GridBagConstraints gbc_DateDeNaissanceLocataire = new GridBagConstraints();
		gbc_DateDeNaissanceLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_DateDeNaissanceLocataire.gridwidth = 3;
		gbc_DateDeNaissanceLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_DateDeNaissanceLocataire.gridx = 1;
		gbc_DateDeNaissanceLocataire.gridy = 4;
		Informations.add(DateDeNaissanceLocataire, gbc_DateDeNaissanceLocataire);
		DateDeNaissanceLocataire.setColumns(10);
		
		JLabel lblDateNaissanceLocataire = new JLabel("Date de naissance :");
		GridBagConstraints gbc_lblDateNaissanceLocataire = new GridBagConstraints();
		gbc_lblDateNaissanceLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblDateNaissanceLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateNaissanceLocataire.gridx = 0;
		gbc_lblDateNaissanceLocataire.gridy = 5;
		Informations.add(lblDateNaissanceLocataire, gbc_lblDateNaissanceLocataire);
		
		PrenomLocataire = new JTextField();
		GridBagConstraints gbc_PrenomLocataire = new GridBagConstraints();
		gbc_PrenomLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_PrenomLocataire.gridwidth = 3;
		gbc_PrenomLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_PrenomLocataire.gridx = 1;
		gbc_PrenomLocataire.gridy = 5;
		Informations.add(PrenomLocataire, gbc_PrenomLocataire);
		PrenomLocataire.setColumns(10);
		
		JLabel lblAncien = new JLabel("Ancien :");
		GridBagConstraints gbc_lblAncien = new GridBagConstraints();
		gbc_lblAncien.anchor = GridBagConstraints.EAST;
		gbc_lblAncien.insets = new Insets(0, 0, 5, 5);
		gbc_lblAncien.gridx = 0;
		gbc_lblAncien.gridy = 7;
		Informations.add(lblAncien, gbc_lblAncien);
		
		JRadioButton rdbtnAncienNon = new JRadioButton("Non");
		rdbtnAncienNon.setSelected(true);
		GridBagConstraints gbc_rdbtnAncienNon = new GridBagConstraints();
		gbc_rdbtnAncienNon.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAncienNon.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAncienNon.gridx = 1;
		gbc_rdbtnAncienNon.gridy = 7;
		Informations.add(rdbtnAncienNon, gbc_rdbtnAncienNon);
		
		JRadioButton rdbtnAncienOui = new JRadioButton("oui");
		GridBagConstraints gbc_rdbtnAncienOui = new GridBagConstraints();
		gbc_rdbtnAncienOui.anchor = GridBagConstraints.WEST;
		gbc_rdbtnAncienOui.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnAncienOui.gridx = 2;
		gbc_rdbtnAncienOui.gridy = 7;
		Informations.add(rdbtnAncienOui, gbc_rdbtnAncienOui);
		
		JPanel Documents = new JPanel();
		Documents.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Locations Associ\u00E9es", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Documents.setBounds(318, 47, 292, 254);
		contentPane.add(Documents);
		GridBagLayout gbl_Documents = new GridBagLayout();
		gbl_Documents.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_Documents.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Documents.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_Documents.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Documents.setLayout(gbl_Documents);
		
		JLabel lblAdresseLocataire = new JLabel("Adresse bien :");
		GridBagConstraints gbc_lblAdresseLocataire = new GridBagConstraints();
		gbc_lblAdresseLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresseLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblAdresseLocataire.gridx = 1;
		gbc_lblAdresseLocataire.gridy = 1;
		Documents.add(lblAdresseLocataire, gbc_lblAdresseLocataire);
		
		AdresseBienLocataire = new JTextField();
		GridBagConstraints gbc_AdresseBienLocataire = new GridBagConstraints();
		gbc_AdresseBienLocataire.fill = GridBagConstraints.HORIZONTAL;
		gbc_AdresseBienLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_AdresseBienLocataire.gridx = 2;
		gbc_AdresseBienLocataire.gridy = 1;
		Documents.add(AdresseBienLocataire, gbc_AdresseBienLocataire);
		AdresseBienLocataire.setColumns(10);
		
		JLabel lblDateEntreeLocataire = new JLabel("Date d'entr\u00E9e :");
		GridBagConstraints gbc_lblDateEntreeLocataire = new GridBagConstraints();
		gbc_lblDateEntreeLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblDateEntreeLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateEntreeLocataire.gridx = 1;
		gbc_lblDateEntreeLocataire.gridy = 2;
		Documents.add(lblDateEntreeLocataire, gbc_lblDateEntreeLocataire);
		
		DateEntrée = new JTextField();
		GridBagConstraints gbc_DateEntrée = new GridBagConstraints();
		gbc_DateEntrée.insets = new Insets(0, 0, 5, 5);
		gbc_DateEntrée.fill = GridBagConstraints.HORIZONTAL;
		gbc_DateEntrée.gridx = 2;
		gbc_DateEntrée.gridy = 2;
		Documents.add(DateEntrée, gbc_DateEntrée);
		DateEntrée.setColumns(10);
		
		JLabel lblBailLocataire = new JLabel("Bail :");
		GridBagConstraints gbc_lblBailLocataire = new GridBagConstraints();
		gbc_lblBailLocataire.anchor = GridBagConstraints.BELOW_BASELINE_TRAILING;
		gbc_lblBailLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblBailLocataire.gridx = 1;
		gbc_lblBailLocataire.gridy = 3;
		Documents.add(lblBailLocataire, gbc_lblBailLocataire);
		
		JLabel lblNomGarantLocataire = new JLabel("Nom garant :");
		GridBagConstraints gbc_lblNomGarantLocataire = new GridBagConstraints();
		gbc_lblNomGarantLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblNomGarantLocataire.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomGarantLocataire.gridx = 1;
		gbc_lblNomGarantLocataire.gridy = 5;
		Documents.add(lblNomGarantLocataire, gbc_lblNomGarantLocataire);
		
		NomGarant = new JTextField();
		GridBagConstraints gbc_NomGarant = new GridBagConstraints();
		gbc_NomGarant.insets = new Insets(0, 0, 5, 5);
		gbc_NomGarant.fill = GridBagConstraints.HORIZONTAL;
		gbc_NomGarant.gridx = 2;
		gbc_NomGarant.gridy = 5;
		Documents.add(NomGarant, gbc_NomGarant);
		NomGarant.setColumns(10);
		
		JLabel lblPrenomGarantLocataire = new JLabel("Pr\u00E9nom garant :");
		GridBagConstraints gbc_lblPrenomGarantLocataire = new GridBagConstraints();
		gbc_lblPrenomGarantLocataire.anchor = GridBagConstraints.EAST;
		gbc_lblPrenomGarantLocataire.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrenomGarantLocataire.gridx = 1;
		gbc_lblPrenomGarantLocataire.gridy = 6;
		Documents.add(lblPrenomGarantLocataire, gbc_lblPrenomGarantLocataire);
		
		PrenomGarant = new JTextField();
		GridBagConstraints gbc_PrenomGarant = new GridBagConstraints();
		gbc_PrenomGarant.insets = new Insets(0, 0, 0, 5);
		gbc_PrenomGarant.fill = GridBagConstraints.HORIZONTAL;
		gbc_PrenomGarant.gridx = 2;
		gbc_PrenomGarant.gridy = 6;
		Documents.add(PrenomGarant, gbc_PrenomGarant);
		PrenomGarant.setColumns(10);
		
		JButton btnAjouterLocataire = new JButton("Ajouter");
		btnAjouterLocataire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAjouterLocataire.setBounds(20, 311, 171, 35);
		contentPane.add(btnAjouterLocataire);
		
		JButton btnAnnulerAjoutLocataire = new JButton("Annuler");
		btnAnnulerAjoutLocataire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnnulerAjoutLocataire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAnnulerAjoutLocataire.setBounds(511, 369, 99, 23);
		contentPane.add(btnAnnulerAjoutLocataire);
		
		
	}
}
