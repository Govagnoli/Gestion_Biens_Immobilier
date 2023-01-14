package vue;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.DateFormatter;

import controleur.GestionAssurance;
import controleur.GestionFermerPages;

public class FenAssurance extends JFrame {

	private JPanel contentPane;
	private GestionAssurance gestionAssurance;
	private GestionFermerPages gestionFermerPages;
	private JTextField textFieldNumContrat;
	private JTextField textField_Prime;
	private JTextField textField_protectionJuridique;
	private JTextField textField_TauxAugmentation;
	private JLabel lblPrimeCourante;
	private JLabel dateDebutValiditee;
	private JLabel Identifiant;
	private JLabel dateFinValiditee;
	private JLabel tauxAugmentation;
	private JLabel protectionJuridique;
	private JLabel prime;
	private JLabel numContrat;
	private JFormattedTextField textField_DateDebutValiditee;
	private JFormattedTextField textField_DateFinValiditee;
	
	public FenAssurance() {
		
		this.gestionAssurance = new GestionAssurance(this);
		this.gestionFermerPages = new GestionFermerPages(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitreAjoutAssociation = new JLabel("Assurance :");
		lblTitreAjoutAssociation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitreAjoutAssociation.setBounds(10, 11, 292, 25);
		contentPane.add(lblTitreAjoutAssociation);
		
		
		DateFormatter formatDate = new DateFormatter(new SimpleDateFormat("dd/MM/yyyy"));
		
		JButton btnModifierAssurance = new JButton("Modifier");
		btnModifierAssurance.addActionListener(this.gestionAssurance);
		btnModifierAssurance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModifierAssurance.setBounds(73, 300, 99, 35);
		contentPane.add(btnModifierAssurance);
		
		JButton btnAnnulerAssurance = new JButton("Annuler");
		btnAnnulerAssurance.addActionListener(this.gestionFermerPages);
		btnAnnulerAssurance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAnnulerAssurance.setBounds(287, 301, 99, 34);
		contentPane.add(btnAnnulerAssurance);
		
		JPanel panel = new JPanel();
		panel.setBounds(63, 75, 333, 214);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelModificationAssurance = new JPanel();
		panelModificationAssurance.setBounds(0, 0, 470, 266);
		panelModificationAssurance.setBorder(new TitledBorder(null, "Informations g\u00E9n\u00E9rales", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.add(panelModificationAssurance);
		GridBagLayout gbl_panelModificationAssurance = new GridBagLayout();
		gbl_panelModificationAssurance.columnWidths = new int[]{121, 49, 0, 0, 0, 0, 30, 0};
		gbl_panelModificationAssurance.rowHeights = new int[]{30, 0, 0, 0, 0, 0, 30, 0, 0};
		gbl_panelModificationAssurance.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelModificationAssurance.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelModificationAssurance.setLayout(gbl_panelModificationAssurance);
		
		JLabel lblNumeroContrat = new JLabel("Numéro de contrat ");
		GridBagConstraints gbc_lblNumeroContrat = new GridBagConstraints();
		gbc_lblNumeroContrat.anchor = GridBagConstraints.EAST;
		gbc_lblNumeroContrat.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroContrat.gridx = 0;
		gbc_lblNumeroContrat.gridy = 1;
		panelModificationAssurance.add(lblNumeroContrat, gbc_lblNumeroContrat);
		
		this.textFieldNumContrat = new JTextField();
		this.textFieldNumContrat.setColumns(10);
		GridBagConstraints gbc_textFieldNumContrat = new GridBagConstraints();
		gbc_textFieldNumContrat.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNumContrat.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNumContrat.gridx = 1;
		gbc_textFieldNumContrat.gridy = 1;
		panelModificationAssurance.add(this.textFieldNumContrat, gbc_textFieldNumContrat);
		
		JLabel lblPrime = new JLabel("Prime :");
		GridBagConstraints gbc_lblPrime = new GridBagConstraints();
		gbc_lblPrime.anchor = GridBagConstraints.EAST;
		gbc_lblPrime.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrime.gridx = 0;
		gbc_lblPrime.gridy = 2;
		panelModificationAssurance.add(lblPrime, gbc_lblPrime);
		
		textField_Prime = new JTextField();
		textField_Prime.setColumns(10);
		GridBagConstraints gbc_textField_Prime = new GridBagConstraints();
		gbc_textField_Prime.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Prime.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Prime.gridx = 1;
		gbc_textField_Prime.gridy = 2;
		panelModificationAssurance.add(textField_Prime, gbc_textField_Prime);
		
		JLabel lblTelAssociation = new JLabel("Protection Juridique  :");
		GridBagConstraints gbc_lblTelAssociation = new GridBagConstraints();
		gbc_lblTelAssociation.anchor = GridBagConstraints.EAST;
		gbc_lblTelAssociation.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelAssociation.gridx = 0;
		gbc_lblTelAssociation.gridy = 3;
		panelModificationAssurance.add(lblTelAssociation, gbc_lblTelAssociation);
		
		textField_protectionJuridique = new JTextField();
		textField_protectionJuridique.setColumns(10);
		GridBagConstraints gbc_textField_protectionJuridique = new GridBagConstraints();
		gbc_textField_protectionJuridique.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_protectionJuridique.insets = new Insets(0, 0, 5, 5);
		gbc_textField_protectionJuridique.gridx = 1;
		gbc_textField_protectionJuridique.gridy = 3;
		panelModificationAssurance.add(textField_protectionJuridique, gbc_textField_protectionJuridique);
		
		JLabel lblDateFinVali = new JLabel("Date de Fin de validité :");
		GridBagConstraints gbc_lblDateFinVali = new GridBagConstraints();
		gbc_lblDateFinVali.anchor = GridBagConstraints.EAST;
		gbc_lblDateFinVali.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateFinVali.gridx = 0;
		gbc_lblDateFinVali.gridy = 4;
		panelModificationAssurance.add(lblDateFinVali, gbc_lblDateFinVali);
		
		textField_DateFinValiditee = new JFormattedTextField(formatDate);
		textField_DateFinValiditee.setColumns(10);
		GridBagConstraints gbc_textField_DateFinValiditee = new GridBagConstraints();
		gbc_textField_DateFinValiditee.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_DateFinValiditee.insets = new Insets(0, 0, 5, 5);
		gbc_textField_DateFinValiditee.gridx = 1;
		gbc_textField_DateFinValiditee.gridy = 4;
		panelModificationAssurance.add(textField_DateFinValiditee, gbc_textField_DateFinValiditee);
		
		JLabel lblDateDeDbut = new JLabel("Date de début de validité :");
		GridBagConstraints gbc_lblDateDeDbut = new GridBagConstraints();
		gbc_lblDateDeDbut.anchor = GridBagConstraints.EAST;
		gbc_lblDateDeDbut.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateDeDbut.gridx = 0;
		gbc_lblDateDeDbut.gridy = 5;
		panelModificationAssurance.add(lblDateDeDbut, gbc_lblDateDeDbut);
		
		textField_DateDebutValiditee = new JFormattedTextField(formatDate);
		textField_DateDebutValiditee.setColumns(10);
		GridBagConstraints gbc_textField_DateDebutValiditee = new GridBagConstraints();
		gbc_textField_DateDebutValiditee.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_DateDebutValiditee.insets = new Insets(0, 0, 5, 5);
		gbc_textField_DateDebutValiditee.gridx = 1;
		gbc_textField_DateDebutValiditee.gridy = 5;
		panelModificationAssurance.add(textField_DateDebutValiditee, gbc_textField_DateDebutValiditee);
		
		JLabel lblTauxAug = new JLabel("Taux augmentation :");
		GridBagConstraints gbc_lblTauxAug = new GridBagConstraints();
		gbc_lblTauxAug.anchor = GridBagConstraints.EAST;
		gbc_lblTauxAug.insets = new Insets(0, 0, 5, 5);
		gbc_lblTauxAug.gridx = 0;
		gbc_lblTauxAug.gridy = 6;
		panelModificationAssurance.add(lblTauxAug, gbc_lblTauxAug);
		
		textField_TauxAugmentation = new JTextField();
		textField_TauxAugmentation.setColumns(10);
		GridBagConstraints gbc_textField_TauxAugmentation = new GridBagConstraints();
		gbc_textField_TauxAugmentation.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_TauxAugmentation.insets = new Insets(0, 0, 5, 5);
		gbc_textField_TauxAugmentation.gridx = 1;
		gbc_textField_TauxAugmentation.gridy = 6;
		panelModificationAssurance.add(textField_TauxAugmentation, gbc_textField_TauxAugmentation);
		
		JPanel panelInformationAssurance = new JPanel();
		panelInformationAssurance.setBorder(new TitledBorder(null, "Assurance courante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInformationAssurance.setBounds(450, 75, 242, 214);
		contentPane.add(panelInformationAssurance);
		GridBagLayout gbl_panelInformationAssurance = new GridBagLayout();
		gbl_panelInformationAssurance.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelInformationAssurance.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelInformationAssurance.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelInformationAssurance.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelInformationAssurance.setLayout(gbl_panelInformationAssurance);
		
		JLabel lblIdentifiantCourant = new JLabel("Identifiant :");
		lblIdentifiantCourant.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblIdentifiantCourant = new GridBagConstraints();
		gbc_lblIdentifiantCourant.anchor = GridBagConstraints.EAST;
		gbc_lblIdentifiantCourant.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentifiantCourant.gridx = 1;
		gbc_lblIdentifiantCourant.gridy = 1;
		panelInformationAssurance.add(lblIdentifiantCourant, gbc_lblIdentifiantCourant);
		
		this.Identifiant = new JLabel("1");
		GridBagConstraints gbc_Identifiant = new GridBagConstraints();
		gbc_Identifiant.insets = new Insets(0, 0, 5, 0);
		gbc_Identifiant.gridx = 2;
		gbc_Identifiant.gridy = 1;
		panelInformationAssurance.add(Identifiant, gbc_Identifiant);
		
		JLabel lblNumContratCourant = new JLabel("Numéro de contrat :");
		lblNumContratCourant.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNumContratCourant = new GridBagConstraints();
		gbc_lblNumContratCourant.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumContratCourant.gridx = 1;
		gbc_lblNumContratCourant.gridy = 2;
		panelInformationAssurance.add(lblNumContratCourant, gbc_lblNumContratCourant);
		
		this.numContrat = new JLabel("1245A");
		GridBagConstraints gbc_numContrat = new GridBagConstraints();
		gbc_numContrat.insets = new Insets(0, 0, 5, 0);
		gbc_numContrat.gridx = 2;
		gbc_numContrat.gridy = 2;
		panelInformationAssurance.add(numContrat, gbc_numContrat);
		
		lblPrimeCourante = new JLabel("Prime :");
		lblPrimeCourante.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblPrimeCourante = new GridBagConstraints();
		gbc_lblPrimeCourante.anchor = GridBagConstraints.EAST;
		gbc_lblPrimeCourante.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimeCourante.gridx = 1;
		gbc_lblPrimeCourante.gridy = 3;
		panelInformationAssurance.add(lblPrimeCourante, gbc_lblPrimeCourante);
		
		this.prime = new JLabel("200,00");
		GridBagConstraints gbc_prime = new GridBagConstraints();
		gbc_prime.insets = new Insets(0, 0, 5, 0);
		gbc_prime.gridx = 2;
		gbc_prime.gridy = 3;
		panelInformationAssurance.add(prime, gbc_prime);
		
		JLabel lblProtectionJuridiqueCourante = new JLabel("Protection Juridique :");
		lblProtectionJuridiqueCourante.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblProtectionJuridiqueCourante = new GridBagConstraints();
		gbc_lblProtectionJuridiqueCourante.insets = new Insets(0, 0, 5, 5);
		gbc_lblProtectionJuridiqueCourante.gridx = 1;
		gbc_lblProtectionJuridiqueCourante.gridy = 4;
		panelInformationAssurance.add(lblProtectionJuridiqueCourante, gbc_lblProtectionJuridiqueCourante);
		
		this.protectionJuridique = new JLabel("200,00");
		GridBagConstraints gbc_protectionJuridique = new GridBagConstraints();
		gbc_protectionJuridique.insets = new Insets(0, 0, 5, 0);
		gbc_protectionJuridique.gridx = 2;
		gbc_protectionJuridique.gridy = 4;
		panelInformationAssurance.add(protectionJuridique, gbc_protectionJuridique);
		
		JLabel lblDebutValiditeeCourante = new JLabel("Début de validitée :");
		lblDebutValiditeeCourante.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblDebutValiditeeCourante = new GridBagConstraints();
		gbc_lblDebutValiditeeCourante.anchor = GridBagConstraints.EAST;
		gbc_lblDebutValiditeeCourante.insets = new Insets(0, 0, 5, 5);
		gbc_lblDebutValiditeeCourante.gridx = 1;
		gbc_lblDebutValiditeeCourante.gridy = 5;
		panelInformationAssurance.add(lblDebutValiditeeCourante, gbc_lblDebutValiditeeCourante);
		
		this.dateDebutValiditee = new JLabel("01/01/2023");
		GridBagConstraints gbc_DateDebutValiditee = new GridBagConstraints();
		gbc_DateDebutValiditee.insets = new Insets(0, 0, 5, 0);
		gbc_DateDebutValiditee.gridx = 2;
		gbc_DateDebutValiditee.gridy = 5;
		panelInformationAssurance.add(dateDebutValiditee, gbc_DateDebutValiditee);
		
		JLabel lblFinValiditeeCourante = new JLabel("Fin de validitée :");
		lblFinValiditeeCourante.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblFinValiditeeCourante = new GridBagConstraints();
		gbc_lblFinValiditeeCourante.anchor = GridBagConstraints.EAST;
		gbc_lblFinValiditeeCourante.insets = new Insets(0, 0, 5, 5);
		gbc_lblFinValiditeeCourante.gridx = 1;
		gbc_lblFinValiditeeCourante.gridy = 6;
		panelInformationAssurance.add(lblFinValiditeeCourante, gbc_lblFinValiditeeCourante);
		
		this.dateFinValiditee = new JLabel("01/01/2024");
		GridBagConstraints gbc_DateFinValiditee = new GridBagConstraints();
		gbc_DateFinValiditee.insets = new Insets(0, 0, 5, 0);
		gbc_DateFinValiditee.gridx = 2;
		gbc_DateFinValiditee.gridy = 6;
		panelInformationAssurance.add(dateFinValiditee, gbc_DateFinValiditee);
		
		JLabel lblTxAugmentationCourant = new JLabel("Taux augmentation :");
		lblTxAugmentationCourant.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblTxAugmentationCourant = new GridBagConstraints();
		gbc_lblTxAugmentationCourant.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblTxAugmentationCourant.insets = new Insets(0, 0, 0, 5);
		gbc_lblTxAugmentationCourant.gridx = 1;
		gbc_lblTxAugmentationCourant.gridy = 7;
		panelInformationAssurance.add(lblTxAugmentationCourant, gbc_lblTxAugmentationCourant);
		
		this.tauxAugmentation = new JLabel("0,125");
		GridBagConstraints gbc_tauxAugmentation = new GridBagConstraints();
		gbc_tauxAugmentation.gridx = 2;
		gbc_tauxAugmentation.gridy = 7;
		panelInformationAssurance.add(this.tauxAugmentation, gbc_tauxAugmentation);
		
		this.gestionAssurance.AffichageValeursCourantes();
	}

	public String getTextFieldNumContrat() {
		return textFieldNumContrat.getText();
	}

	public String getTextField_Prime() {
		return textField_Prime.getText();
	}

	public String getTextField_protectionJuridique() {
		return textField_protectionJuridique.getText();
	}

	public String getTextField_TauxAugmentation() {
		return textField_TauxAugmentation.getText();
	}
	
	public String getTextField_DateDebutValiditee() {
		return textField_DateDebutValiditee.getText();
	}

	public String getTextField_DateFinValiditee() {
		return textField_DateFinValiditee.getText();
	}

	public void setDateFinValiditee(Date dateFinValiditee) {
		this.dateFinValiditee.setText(dateFinValiditee.toString());
	}

	public void setLblPrimeCourante(JLabel lblPrimeCourante) {
		this.lblPrimeCourante = lblPrimeCourante;
	}

	public void setDateDebutValiditee(Date dateDebutValiditee) {
		this.dateDebutValiditee.setText(dateDebutValiditee.toString());
	}

	public void setIdentifiant(int identifiant) {
		this.Identifiant.setText(Integer.toString(identifiant));;
	}

	public void setTauxAugmentation(float tauxAugmentation) {
		this.tauxAugmentation.setText(Float.toString(tauxAugmentation));
	}

	public void setProtectionJuridique(float protectionJuridique) {
		this.protectionJuridique.setText(Float.toString(protectionJuridique));
	}

	public void setPrime(float prime) {
		this.prime.setText(Float.toString(prime));
	}

	public void setNumContrat(String numContrat) {
		this.numContrat.setText(numContrat);;
	}

	public int getIdentifiant() {
		return Integer.parseInt(Identifiant.getText());
	}
	
	
}
