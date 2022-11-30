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
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.border.TitledBorder;
import javax.swing.text.DateFormatter;

import controleur.GestionAjoutAssociation;
import controleur.GestionAjoutLocataire;
import controleur.GestionAssurance;

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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class FenAssurance extends JFrame {

	private JPanel contentPane;
	private JTextField NumeroDeContrat;
	private JTextField Prime;
	private JTextField ProtectionJuridique;
	private JTextField DateFinVali;
	private GestionAssurance gestionAssurance;
	private JTextField DateDebutVali;
	private JTextField TauxAugm;

	public FenAssurance() {
		
		this.gestionAssurance = new GestionAssurance(this);
		
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
		
		NumeroDeContrat = new JTextField();
		GridBagConstraints gbc_NumeroDeContrat = new GridBagConstraints();
		gbc_NumeroDeContrat.fill = GridBagConstraints.HORIZONTAL;
		gbc_NumeroDeContrat.gridwidth = 3;
		gbc_NumeroDeContrat.insets = new Insets(0, 0, 5, 5);
		gbc_NumeroDeContrat.gridx = 1;
		gbc_NumeroDeContrat.gridy = 1;
		Informations.add(NumeroDeContrat, gbc_NumeroDeContrat);
		NumeroDeContrat.setColumns(10);
		
		JLabel lblPrime = new JLabel("Prime :");
		GridBagConstraints gbc_lblPrime = new GridBagConstraints();
		gbc_lblPrime.anchor = GridBagConstraints.EAST;
		gbc_lblPrime.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrime.gridx = 0;
		gbc_lblPrime.gridy = 2;
		Informations.add(lblPrime, gbc_lblPrime);
		
		Prime = new JTextField();
		GridBagConstraints gbc_Prime = new GridBagConstraints();
		gbc_Prime.fill = GridBagConstraints.HORIZONTAL;
		gbc_Prime.insets = new Insets(0, 0, 5, 5);
		gbc_Prime.gridx = 1;
		gbc_Prime.gridy = 2;
		Informations.add(Prime, gbc_Prime);
		Prime.setColumns(10);
		
		JLabel lblTelAssociation = new JLabel("Protection Juridique  :");
		GridBagConstraints gbc_lblTelAssociation = new GridBagConstraints();
		gbc_lblTelAssociation.anchor = GridBagConstraints.EAST;
		gbc_lblTelAssociation.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelAssociation.gridx = 0;
		gbc_lblTelAssociation.gridy = 3;
		Informations.add(lblTelAssociation, gbc_lblTelAssociation);
		
		ProtectionJuridique = new JTextField();
		GridBagConstraints gbc_ProtectionJuridique = new GridBagConstraints();
		gbc_ProtectionJuridique.gridwidth = 3;
		gbc_ProtectionJuridique.fill = GridBagConstraints.HORIZONTAL;
		gbc_ProtectionJuridique.insets = new Insets(0, 0, 5, 5);
		gbc_ProtectionJuridique.gridx = 1;
		gbc_ProtectionJuridique.gridy = 3;
		Informations.add(ProtectionJuridique, gbc_ProtectionJuridique);
		ProtectionJuridique.setColumns(10);
		
		JLabel lblDateFinVali = new JLabel("Date de Fin de validité :");
		GridBagConstraints gbc_lblDateFinVali = new GridBagConstraints();
		gbc_lblDateFinVali.anchor = GridBagConstraints.EAST;
		gbc_lblDateFinVali.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateFinVali.gridx = 0;
		gbc_lblDateFinVali.gridy = 4;
		Informations.add(lblDateFinVali, gbc_lblDateFinVali);
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		DateFormatter df = new DateFormatter(format);
		JFormattedTextField DateFinVali = new JFormattedTextField(df);
		GridBagConstraints gbc_DateFinVali = new GridBagConstraints();
		gbc_DateFinVali.fill = GridBagConstraints.HORIZONTAL;
		gbc_DateFinVali.insets = new Insets(0, 0, 5, 5);
		gbc_DateFinVali.gridx = 1;
		gbc_DateFinVali.gridy = 4;
		Informations.add(DateFinVali, gbc_DateFinVali);
		DateFinVali.setColumns(10);
		
		JLabel lblDateDeDbut = new JLabel("Date de début de validité :");
		GridBagConstraints gbc_lblDateDeDbut = new GridBagConstraints();
		gbc_lblDateDeDbut.anchor = GridBagConstraints.EAST;
		gbc_lblDateDeDbut.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateDeDbut.gridx = 0;
		gbc_lblDateDeDbut.gridy = 5;
		Informations.add(lblDateDeDbut, gbc_lblDateDeDbut);
			
		JFormattedTextField DateDebutVali = new JFormattedTextField(df);
		DateDebutVali.setColumns(10);
		GridBagConstraints gbc_DateDebutVali = new GridBagConstraints();
		gbc_DateDebutVali.insets = new Insets(0, 0, 5, 5);
		gbc_DateDebutVali.fill = GridBagConstraints.HORIZONTAL;
		gbc_DateDebutVali.gridx = 1;
		gbc_DateDebutVali.gridy = 5;
		Informations.add(DateDebutVali, gbc_DateDebutVali);
		
		JLabel lblTauxAug = new JLabel("Taux augmentation :");
		GridBagConstraints gbc_lblTauxAug = new GridBagConstraints();
		gbc_lblTauxAug.anchor = GridBagConstraints.EAST;
		gbc_lblTauxAug.insets = new Insets(0, 0, 5, 5);
		gbc_lblTauxAug.gridx = 0;
		gbc_lblTauxAug.gridy = 6;
		Informations.add(lblTauxAug, gbc_lblTauxAug);
		
		TauxAugm = new JTextField();
		GridBagConstraints gbc_TauxAugm = new GridBagConstraints();
		gbc_TauxAugm.insets = new Insets(0, 0, 5, 5);
		gbc_TauxAugm.fill = GridBagConstraints.HORIZONTAL;
		gbc_TauxAugm.gridx = 1;
		gbc_TauxAugm.gridy = 6;
		Informations.add(TauxAugm, gbc_TauxAugm);
		TauxAugm.setColumns(10);
		
		JButton btnModifierAssurance = new JButton("Modifier");
		btnModifierAssurance.addActionListener(this.gestionAssurance);
		btnModifierAssurance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModifierAssurance.setBounds(100, 273, 99, 35);
		contentPane.add(btnModifierAssurance);
		
		JButton btnAnnulerAssurance = new JButton("Annuler");
		btnAnnulerAssurance.addActionListener(this.gestionAssurance);
		btnAnnulerAssurance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAnnulerAssurance.setBounds(323, 273, 99, 34);
		contentPane.add(btnAnnulerAssurance);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
