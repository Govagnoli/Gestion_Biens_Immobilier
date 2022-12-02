package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.DateFormatter;

import controleur.GestionAjoutBien;
import controleur.GestionFermerPages;

public class FenAjoutBien extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textAdresse;
	private JTextField textVille;
	private JFormattedTextField textCP;
	private JFormattedTextField textLoyer;
	private JFormattedTextField TextSuperficie;
	private JFormattedTextField textTantiemes;
	private JSpinner spinnerNbrLocataireMax;
	private JFormattedTextField textDateAcquisition;
	private JRadioButton rdbtnLogement;
	private JRadioButton rdbtnGarage;
	private GestionFermerPages gestionFermerPages;
	private GestionAjoutBien gestionAjoutBien;
	
	public FenAjoutBien() {
		this.gestionFermerPages = new GestionFermerPages(this);
		this.gestionAjoutBien = new GestionAjoutBien(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 482);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informations \u00E0 remplir", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(53, 45, 390, 290);
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{131, 46, 86, 0};
		gbl_panel.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblAdresse = new JLabel("Adresse : ");
		GridBagConstraints gbc_lblAdresse = new GridBagConstraints();
		gbc_lblAdresse.anchor = GridBagConstraints.EAST;
		gbc_lblAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse.gridx = 0;
		gbc_lblAdresse.gridy = 2;
		panel.add(lblAdresse, gbc_lblAdresse);
		
		textAdresse = new JTextField();
		GridBagConstraints gbc_textAdresse = new GridBagConstraints();
		gbc_textAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_textAdresse.fill = GridBagConstraints.HORIZONTAL;
		gbc_textAdresse.gridx = 1;
		gbc_textAdresse.gridy = 2;
		panel.add(textAdresse, gbc_textAdresse);
		textAdresse.setColumns(50);
		
		JLabel lblVille = new JLabel("Ville :");
		GridBagConstraints gbc_lblVille = new GridBagConstraints();
		gbc_lblVille.anchor = GridBagConstraints.EAST;
		gbc_lblVille.insets = new Insets(0, 0, 5, 5);
		gbc_lblVille.gridx = 0;
		gbc_lblVille.gridy = 3;
		panel.add(lblVille, gbc_lblVille);
		
		textVille = new JTextField();
		GridBagConstraints gbc_textVille = new GridBagConstraints();
		gbc_textVille.insets = new Insets(0, 0, 5, 5);
		gbc_textVille.fill = GridBagConstraints.HORIZONTAL;
		gbc_textVille.gridx = 1;
		gbc_textVille.gridy = 3;
		panel.add(textVille, gbc_textVille);
		textVille.setColumns(50);
		
		JLabel lblCodePostal = new JLabel("Code Postal");
		GridBagConstraints gbc_lblCodePostal = new GridBagConstraints();
		gbc_lblCodePostal.anchor = GridBagConstraints.EAST;
		gbc_lblCodePostal.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodePostal.gridx = 0;
		gbc_lblCodePostal.gridy = 4;
		panel.add(lblCodePostal, gbc_lblCodePostal);
		
		this.textCP = new JFormattedTextField();
		textCP.setColumns(5);
		GridBagConstraints gbc_textCP = new GridBagConstraints();
		gbc_textCP.insets = new Insets(0, 0, 5, 5);
		gbc_textCP.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCP.gridx = 1;
		gbc_textCP.gridy = 4;
		panel.add(textCP, gbc_textCP);
		
		JLabel lblPrixLoyer = new JLabel("Prix loyer :");
		GridBagConstraints gbc_lblPrixLoyer = new GridBagConstraints();
		gbc_lblPrixLoyer.anchor = GridBagConstraints.EAST;
		gbc_lblPrixLoyer.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrixLoyer.gridx = 0;
		gbc_lblPrixLoyer.gridy = 5;
		panel.add(lblPrixLoyer, gbc_lblPrixLoyer);
		
		this.textLoyer = new JFormattedTextField();
		textLoyer.setColumns(7);
		GridBagConstraints gbc_textLoyer = new GridBagConstraints();
		gbc_textLoyer.insets = new Insets(0, 0, 5, 5);
		gbc_textLoyer.fill = GridBagConstraints.HORIZONTAL;
		gbc_textLoyer.gridx = 1;
		gbc_textLoyer.gridy = 5;
		panel.add(textLoyer, gbc_textLoyer);
		
		JLabel lblSuperficie = new JLabel("Superficie :");
		GridBagConstraints gbc_lblSuperficie = new GridBagConstraints();
		gbc_lblSuperficie.anchor = GridBagConstraints.EAST;
		gbc_lblSuperficie.insets = new Insets(0, 0, 5, 5);
		gbc_lblSuperficie.gridx = 0;
		gbc_lblSuperficie.gridy = 6;
		panel.add(lblSuperficie, gbc_lblSuperficie);
		
		this.TextSuperficie = new JFormattedTextField();
		TextSuperficie.setColumns(6);
		GridBagConstraints gbc_TextSuperficie = new GridBagConstraints();
		gbc_TextSuperficie.insets = new Insets(0, 0, 5, 5);
		gbc_TextSuperficie.fill = GridBagConstraints.HORIZONTAL;
		gbc_TextSuperficie.gridx = 1;
		gbc_TextSuperficie.gridy = 6;
		panel.add(TextSuperficie, gbc_TextSuperficie);
		
		JLabel lblTantième = new JLabel("* Tantièmes :");
		GridBagConstraints gbc_lblTantième = new GridBagConstraints();
		gbc_lblTantième.anchor = GridBagConstraints.EAST;
		gbc_lblTantième.insets = new Insets(0, 0, 5, 5);
		gbc_lblTantième.gridx = 0;
		gbc_lblTantième.gridy = 7;
		panel.add(lblTantième, gbc_lblTantième);
		
		this.textTantiemes = new JFormattedTextField();
		GridBagConstraints gbc_textTantiemes = new GridBagConstraints();
		gbc_textTantiemes.insets = new Insets(0, 0, 5, 5);
		gbc_textTantiemes.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTantiemes.gridx = 1;
		gbc_textTantiemes.gridy = 7;
		panel.add(textTantiemes, gbc_textTantiemes);
		
		JLabel lblNbrLocataireMax = new JLabel("Nombre de locataire maximum :");
		GridBagConstraints gbc_lblNbrLocataireMax = new GridBagConstraints();
		gbc_lblNbrLocataireMax.anchor = GridBagConstraints.EAST;
		gbc_lblNbrLocataireMax.insets = new Insets(0, 0, 5, 5);
		gbc_lblNbrLocataireMax.gridx = 0;
		gbc_lblNbrLocataireMax.gridy = 8;
		panel.add(lblNbrLocataireMax, gbc_lblNbrLocataireMax);
		
		this.spinnerNbrLocataireMax = new JSpinner();
		spinnerNbrLocataireMax.setModel(new SpinnerNumberModel(1, null, 9, 1));
		GridBagConstraints gbc_spinnerNbrLocataireMax = new GridBagConstraints();
		gbc_spinnerNbrLocataireMax.anchor = GridBagConstraints.WEST;
		gbc_spinnerNbrLocataireMax.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerNbrLocataireMax.gridx = 1;
		gbc_spinnerNbrLocataireMax.gridy = 8;
		panel.add(spinnerNbrLocataireMax, gbc_spinnerNbrLocataireMax);
		
		JLabel lblDateAcquisition = new JLabel("Date d'acquisition :");
		lblDateAcquisition.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblDateAcquisition = new GridBagConstraints();
		gbc_lblDateAcquisition.anchor = GridBagConstraints.EAST;
		gbc_lblDateAcquisition.insets = new Insets(0, 0, 5, 5);
		gbc_lblDateAcquisition.gridx = 0;
		gbc_lblDateAcquisition.gridy = 9;
		panel.add(lblDateAcquisition, gbc_lblDateAcquisition);
		
		//pour formatter les nombres
		//NumberFormat formatNumber = new NumberFormat();
		DateFormatter formatDate = new DateFormatter(new SimpleDateFormat("dd/MM/yyyy"));
		
		this.textDateAcquisition = new JFormattedTextField(formatDate);
		GridBagConstraints gbc_textDateAcquisition = new GridBagConstraints();
		gbc_textDateAcquisition.insets = new Insets(0, 0, 5, 5);
		gbc_textDateAcquisition.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDateAcquisition.gridx = 1;
		gbc_textDateAcquisition.gridy = 9;
		panel.add(textDateAcquisition, gbc_textDateAcquisition);
		
		JLabel lblTypeBien = new JLabel("Type de bien :");
		GridBagConstraints gbc_lblTypeBien = new GridBagConstraints();
		gbc_lblTypeBien.anchor = GridBagConstraints.EAST;
		gbc_lblTypeBien.insets = new Insets(0, 0, 5, 5);
		gbc_lblTypeBien.gridx = 0;
		gbc_lblTypeBien.gridy = 10;
		panel.add(lblTypeBien, gbc_lblTypeBien);
		
		this.rdbtnLogement = new JRadioButton("Logement");
		rdbtnLogement.setSelected(true);
		this.rdbtnLogement.addItemListener(this.gestionAjoutBien);
		buttonGroup.add(rdbtnLogement);
		GridBagConstraints gbc_rdbtnLogement = new GridBagConstraints();
		gbc_rdbtnLogement.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnLogement.gridx = 1;
		gbc_rdbtnLogement.gridy = 10;
		panel.add(rdbtnLogement, gbc_rdbtnLogement);
		
		this.rdbtnGarage = new JRadioButton("Garage");
		buttonGroup.add(rdbtnGarage);
		GridBagConstraints gbc_rdbtnGarage = new GridBagConstraints();
		gbc_rdbtnGarage.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnGarage.gridx = 2;
		gbc_rdbtnGarage.gridy = 10;
		panel.add(rdbtnGarage, gbc_rdbtnGarage);
		
		JLabel lblFacultatif = new JLabel("Les éléments avec * sont facultatif");
		lblFacultatif.setBounds(76, 384, 201, 14);
		contentPane.add(lblFacultatif);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(this.gestionAjoutBien);
		btnAjouter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAjouter.setBounds(73, 341, 142, 32);
		contentPane.add(btnAjouter);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(this.gestionFermerPages);
		btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAnnuler.setBounds(397, 398, 99, 34);
		contentPane.add(btnAnnuler);
		
		JLabel lblTitreAjoutBien = new JLabel("Ajouter d'un bien immobilier :");
		lblTitreAjoutBien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitreAjoutBien.setBounds(10, 9, 292, 25);
		contentPane.add(lblTitreAjoutBien);
	}

	public String getTextAdresse() {
		return textAdresse.getText();
	}

	public String getTextVille() {
		return textVille.getText();
	}

	public String getTextCP() {
		return textCP.getText();
	}

	public String getTextLoyer() {
		return textLoyer.getText();
	}

	public String getTextSuperficie() {
		return TextSuperficie.getText();
	}

	public String getTextTantiemes() {
		return textTantiemes.getText();
	}

	public String getStrSpinnerNbrLocataireMax() {
		return spinnerNbrLocataireMax.getValue().toString() ;
	}
	
	public int getIntSpinnerNbrLocataireMax() {
		return Integer.parseInt(getStrSpinnerNbrLocataireMax());
	}
	
	public String getTextDateAcquisition() {
		return textDateAcquisition.getText();
	}

	public JRadioButton getRdbtnLogement() {
		return rdbtnLogement;
	}
}
