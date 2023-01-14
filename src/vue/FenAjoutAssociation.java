package vue;

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
import javax.swing.border.TitledBorder;

import controleur.GestionAjoutAssociation;

public class FenAjoutAssociation extends JFrame {

	private JPanel contentPane;
	private JTextField sirenAssociation;
	private JTextField NomAssociation;
	private JTextField DateDonnation;
	private JTextField MontantDonnation;
	private GestionAjoutAssociation gestionAjoutAssociation;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		
		JLabel lblSiren = new JLabel("Siren Association :");
		GridBagConstraints gbc_lblSiren = new GridBagConstraints();
		gbc_lblSiren.anchor = GridBagConstraints.EAST;
		gbc_lblSiren.insets = new Insets(0, 0, 5, 5);
		gbc_lblSiren.gridx = 0;
		gbc_lblSiren.gridy = 1;
		Informations.add(lblSiren, gbc_lblSiren);
		
		sirenAssociation = new JTextField();
		GridBagConstraints gbc_sirenAssociation = new GridBagConstraints();
		gbc_sirenAssociation.fill = GridBagConstraints.HORIZONTAL;
		gbc_sirenAssociation.gridwidth = 4;
		gbc_sirenAssociation.insets = new Insets(0, 0, 5, 5);
		gbc_sirenAssociation.gridx = 1;
		gbc_sirenAssociation.gridy = 1;
		Informations.add(sirenAssociation, gbc_sirenAssociation);
		sirenAssociation.setColumns(10);
		
		JLabel lblNomAssociation = new JLabel("Nom association :");
		GridBagConstraints gbc_lblNomAssociation = new GridBagConstraints();
		gbc_lblNomAssociation.anchor = GridBagConstraints.EAST;
		gbc_lblNomAssociation.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomAssociation.gridx = 0;
		gbc_lblNomAssociation.gridy = 2;
		Informations.add(lblNomAssociation, gbc_lblNomAssociation);
		
		NomAssociation = new JTextField();
		GridBagConstraints gbc_NomAssociation = new GridBagConstraints();
		gbc_NomAssociation.gridwidth = 4;
		gbc_NomAssociation.fill = GridBagConstraints.HORIZONTAL;
		gbc_NomAssociation.insets = new Insets(0, 0, 5, 5);
		gbc_NomAssociation.gridx = 1;
		gbc_NomAssociation.gridy = 2;
		Informations.add(NomAssociation, gbc_NomAssociation);
		NomAssociation.setColumns(10);
		
		JLabel lblDateDonnation = new JLabel("Date du don :");
		GridBagConstraints gbc_lblDateDonnation = new GridBagConstraints();
		gbc_lblDateDonnation.anchor = GridBagConstraints.EAST;
		gbc_lblDateDonnation.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateDonnation.gridx = 0;
		gbc_lblDateDonnation.gridy = 3;
		Informations.add(lblDateDonnation, gbc_lblDateDonnation);
		
		DateDonnation = new JTextField();
		GridBagConstraints gbc_DateDonnation = new GridBagConstraints();
		gbc_DateDonnation.gridwidth = 4;
		gbc_DateDonnation.fill = GridBagConstraints.HORIZONTAL;
		gbc_DateDonnation.insets = new Insets(0, 0, 5, 5);
		gbc_DateDonnation.gridx = 1;
		gbc_DateDonnation.gridy = 3;
		Informations.add(DateDonnation, gbc_DateDonnation);
		DateDonnation.setColumns(10);
		
		JLabel lblMontantDon = new JLabel("Montant donnation :");
		GridBagConstraints gbc_lblMontantDon = new GridBagConstraints();
		gbc_lblMontantDon.anchor = GridBagConstraints.EAST;
		gbc_lblMontantDon.insets = new Insets(0, 0, 5, 5);
		gbc_lblMontantDon.gridx = 0;
		gbc_lblMontantDon.gridy = 4;
		Informations.add(lblMontantDon, gbc_lblMontantDon);
		
		MontantDonnation = new JTextField();
		GridBagConstraints gbc_MontantDonnation = new GridBagConstraints();
		gbc_MontantDonnation.fill = GridBagConstraints.HORIZONTAL;
		gbc_MontantDonnation.gridwidth = 4;
		gbc_MontantDonnation.insets = new Insets(0, 0, 5, 5);
		gbc_MontantDonnation.gridx = 1;
		gbc_MontantDonnation.gridy = 4;
		Informations.add(MontantDonnation, gbc_MontantDonnation);
		MontantDonnation.setColumns(10);
		
		JButton btnAjouterLocataire = new JButton("Ajouter");
		btnAjouterLocataire.addActionListener(this.gestionAjoutAssociation);
		btnAjouterLocataire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAjouterLocataire.setBounds(53, 268, 171, 35);
		contentPane.add(btnAjouterLocataire);
		
		JButton btnAnnulerAjoutLocataire = new JButton("Annuler");
		btnAnnulerAjoutLocataire.addActionListener(this.gestionAjoutAssociation);
		btnAnnulerAjoutLocataire.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAnnulerAjoutLocataire.setBounds(398, 323, 99, 34);
		contentPane.add(btnAnnulerAjoutLocataire);
	}
	public String getSirenAssociation() {
		return sirenAssociation.getText();
	}

	public String getNomAssociation() {
		return NomAssociation.getText();
	}

	public String getDateDonnation() {
		return DateDonnation.getText();
	}

	public String getMontantDonnation() {
		return MontantDonnation.getText();
	}
	
	
}