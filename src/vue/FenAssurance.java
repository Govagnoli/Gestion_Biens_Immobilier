package vue;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
	private JTextField numeroContrat;
	private JTextField prime;
	private JTextField protectionJuridique;
	private JFormattedTextField dateFinDeValiditee;
	private GestionAssurance gestionAssurance;
	private JFormattedTextField dateDebutDeValiditee;
	private JTextField tauxAugmentation;
	private GestionFermerPages gestionFermerPages;

	public FenAssurance() {
		
		this.gestionAssurance = new GestionAssurance(this);
		this.gestionFermerPages = new GestionFermerPages(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitreAjoutAssociation = new JLabel("Assurance :");
		lblTitreAjoutAssociation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitreAjoutAssociation.setBounds(10, 11, 292, 25);
		contentPane.add(lblTitreAjoutAssociation);
		
		JPanel Informations = new JPanel();
		Informations.setBorder(new TitledBorder(null, "Informations g\u00E9n\u00E9rales", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Informations.setBounds(84, 46, 345, 217);
		contentPane.add(Informations);
		GridBagLayout gbl_Informations = new GridBagLayout();
		gbl_Informations.columnWidths = new int[] {121, 49, 0, 0, 0, 0, 30};
		gbl_Informations.rowHeights = new int[] {30, 0, 0, 0, 0, 0, 30, 0};
		gbl_Informations.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_Informations.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		Informations.setLayout(gbl_Informations);
		
		JLabel lbl = new JLabel("Numéro de contrat ");
		GridBagConstraints gbc_lbl = new GridBagConstraints();
		gbc_lbl.anchor = GridBagConstraints.EAST;
		gbc_lbl.insets = new Insets(0, 0, 5, 5);
		gbc_lbl.gridx = 0;
		gbc_lbl.gridy = 1;
		Informations.add(lbl, gbc_lbl);
		
		numeroContrat = new JTextField();
		GridBagConstraints gbc_NumeroDeContrat = new GridBagConstraints();
		gbc_NumeroDeContrat.fill = GridBagConstraints.HORIZONTAL;
		gbc_NumeroDeContrat.gridwidth = 3;
		gbc_NumeroDeContrat.insets = new Insets(0, 0, 5, 5);
		gbc_NumeroDeContrat.gridx = 1;
		gbc_NumeroDeContrat.gridy = 1;
		Informations.add(numeroContrat, gbc_NumeroDeContrat);
		numeroContrat.setColumns(10);
		
		JLabel lblPrime = new JLabel("Prime :");
		GridBagConstraints gbc_lblPrime = new GridBagConstraints();
		gbc_lblPrime.anchor = GridBagConstraints.EAST;
		gbc_lblPrime.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrime.gridx = 0;
		gbc_lblPrime.gridy = 2;
		Informations.add(lblPrime, gbc_lblPrime);
		
		prime = new JTextField();
		GridBagConstraints gbc_Prime = new GridBagConstraints();
		gbc_Prime.fill = GridBagConstraints.HORIZONTAL;
		gbc_Prime.insets = new Insets(0, 0, 5, 5);
		gbc_Prime.gridx = 1;
		gbc_Prime.gridy = 2;
		Informations.add(prime, gbc_Prime);
		prime.setColumns(10);
		
		JLabel lblTelAssociation = new JLabel("Protection Juridique  :");
		GridBagConstraints gbc_lblTelAssociation = new GridBagConstraints();
		gbc_lblTelAssociation.anchor = GridBagConstraints.EAST;
		gbc_lblTelAssociation.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelAssociation.gridx = 0;
		gbc_lblTelAssociation.gridy = 3;
		Informations.add(lblTelAssociation, gbc_lblTelAssociation);
		
		protectionJuridique = new JTextField();
		GridBagConstraints gbc_ProtectionJuridique = new GridBagConstraints();
		gbc_ProtectionJuridique.gridwidth = 3;
		gbc_ProtectionJuridique.fill = GridBagConstraints.HORIZONTAL;
		gbc_ProtectionJuridique.insets = new Insets(0, 0, 5, 5);
		gbc_ProtectionJuridique.gridx = 1;
		gbc_ProtectionJuridique.gridy = 3;
		Informations.add(protectionJuridique, gbc_ProtectionJuridique);
		protectionJuridique.setColumns(10);
		
		JLabel lblDateFinVali = new JLabel("Date de Fin de validité :");
		GridBagConstraints gbc_lblDateFinVali = new GridBagConstraints();
		gbc_lblDateFinVali.anchor = GridBagConstraints.EAST;
		gbc_lblDateFinVali.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateFinVali.gridx = 0;
		gbc_lblDateFinVali.gridy = 4;
		Informations.add(lblDateFinVali, gbc_lblDateFinVali);
		
		
		DateFormatter df = new DateFormatter(new SimpleDateFormat("dd/MM/yyyy"));
		
		this.dateFinDeValiditee = new JFormattedTextField(df);
		this.dateFinDeValiditee.setColumns(10);
		GridBagConstraints gbc_DateFinVali = new GridBagConstraints();
		gbc_DateFinVali.fill = GridBagConstraints.HORIZONTAL;
		gbc_DateFinVali.insets = new Insets(0, 0, 5, 5);
		gbc_DateFinVali.gridx = 1;
		gbc_DateFinVali.gridy = 4;
		Informations.add(this.dateFinDeValiditee, gbc_DateFinVali);
		
		JLabel lblDateDeDbut = new JLabel("Date de début de validité :");
		GridBagConstraints gbc_lblDateDeDbut = new GridBagConstraints();
		gbc_lblDateDeDbut.anchor = GridBagConstraints.EAST;
		gbc_lblDateDeDbut.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateDeDbut.gridx = 0;
		gbc_lblDateDeDbut.gridy = 5;
		Informations.add(lblDateDeDbut, gbc_lblDateDeDbut);
			
		this.dateDebutDeValiditee = new JFormattedTextField(df);
		this.dateDebutDeValiditee.setColumns(10);
		GridBagConstraints gbc_DateDebutVali = new GridBagConstraints();
		gbc_DateDebutVali.insets = new Insets(0, 0, 5, 5);
		gbc_DateDebutVali.fill = GridBagConstraints.HORIZONTAL;
		gbc_DateDebutVali.gridx = 1;
		gbc_DateDebutVali.gridy = 5;
		Informations.add(this.dateDebutDeValiditee, gbc_DateDebutVali);
		
		JLabel lblTauxAug = new JLabel("Taux augmentation :");
		GridBagConstraints gbc_lblTauxAug = new GridBagConstraints();
		gbc_lblTauxAug.anchor = GridBagConstraints.EAST;
		gbc_lblTauxAug.insets = new Insets(0, 0, 5, 5);
		gbc_lblTauxAug.gridx = 0;
		gbc_lblTauxAug.gridy = 6;
		Informations.add(lblTauxAug, gbc_lblTauxAug);
		
		tauxAugmentation = new JTextField();
		GridBagConstraints gbc_TauxAugm = new GridBagConstraints();
		gbc_TauxAugm.insets = new Insets(0, 0, 5, 5);
		gbc_TauxAugm.fill = GridBagConstraints.HORIZONTAL;
		gbc_TauxAugm.gridx = 1;
		gbc_TauxAugm.gridy = 6;
		Informations.add(tauxAugmentation, gbc_TauxAugm);
		tauxAugmentation.setColumns(10);
		
		JButton btnModifierAssurance = new JButton("Modifier");
		btnModifierAssurance.addActionListener(this.gestionAssurance);
		btnModifierAssurance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModifierAssurance.setBounds(100, 273, 99, 35);
		contentPane.add(btnModifierAssurance);
		
		JButton btnAnnulerAssurance = new JButton("Annuler");
		btnAnnulerAssurance.addActionListener(this.gestionFermerPages);
		btnAnnulerAssurance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAnnulerAssurance.setBounds(323, 273, 99, 34);
		contentPane.add(btnAnnulerAssurance);
	}

	public String getNumeroContrat() {
		return numeroContrat.getText();
	}

	public String getPrime() {
		return prime.getText();
	}

	public String getProtectionJuridique() {
		return protectionJuridique.getText();
	}

	public String getDateFinDeValiditee() {
		return dateFinDeValiditee.getText();
	}

	public String getDateDebutDeValiditee() {
		return dateDebutDeValiditee.getText();
	}

	public String getTauxAugmentation() {
		return tauxAugmentation.getText();
	}
}
