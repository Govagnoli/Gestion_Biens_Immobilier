package vue;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controleur.GestionDetailsLocataire;

public class DetailsLocataire extends JInternalFrame {
	private JTable tableGarant;
	private JTable tableColocataire;
	private int idLocataire;
	private String email;
	private float depotGarantie;
	private float partPossession;

	private JLabel nom;
	private JLabel prenom;
	private JLabel telephone;
	private JLabel dateNaissance;
	private JLabel ancienLocataire;
	private JLabel loyer;
	private JLabel adresse;
	private GestionDetailsLocataire gestionDetailsLocataire;
	
	public DetailsLocataire() {
		
		this.gestionDetailsLocataire = new GestionDetailsLocataire(this);
		setBounds(864, 0, 1204, 300);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		this.nom = new JLabel("Nom");
		this.nom.setFont(new Font("Tahoma", Font.PLAIN, 25));
		this.nom.setBounds(10, 11, 191, 50);
		panel.add(this.nom);
		
		this.prenom = new JLabel("Prenom");
		this.prenom.setFont(new Font("Tahoma", Font.PLAIN, 25));
		this.prenom.setBounds(211, 11, 158, 50);
		panel.add(this.prenom);
		
		JButton buttonQuittanceDeLoyer = new JButton("Les Quittances de Loyer");
		buttonQuittanceDeLoyer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonQuittanceDeLoyer.setBounds(130, 209, 278, 27);
		buttonQuittanceDeLoyer.addActionListener(this.gestionDetailsLocataire);
		panel.add(buttonQuittanceDeLoyer);
		
		this.telephone = new JLabel("Telephone");
		this.telephone.setBounds(168, 85, 122, 13);
		panel.add(this.telephone);
		
		this.dateNaissance = new JLabel("Date de Naissance");
		this.dateNaissance.setBounds(168, 128, 122, 13);
		panel.add(this.dateNaissance);
		
		this.ancienLocataire = new JLabel("oui ou non");
		ancienLocataire.setBounds(168, 174, 108, 13);
		panel.add(ancienLocataire);
		
		this.loyer = new JLabel("loyer");
		loyer.setFont(new Font("Tahoma", Font.PLAIN, 17));
		loyer.setBounds(363, 149, 108, 27);
		panel.add(loyer);
		
		this.adresse = new JLabel("Adresse");
		adresse.setBounds(418, 85, 109, 14);
		panel.add(adresse);
		
		JScrollPane scrollPaneGarants = new JScrollPane();
		scrollPaneGarants.setBounds(553, 83, 228, 138);
		panel.add(scrollPaneGarants);
		
		tableGarant = new JTable();
		tableGarant.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Nom"
			}
		));
		this.getTableGarant().getSelectionModel().addListSelectionListener(this.gestionDetailsLocataire);
		scrollPaneGarants.setViewportView(tableGarant);
		
		JLabel label = new JLabel("New label");
		scrollPaneGarants.setColumnHeaderView(label);
		
		JLabel lblTableGarant = new JLabel("Le(s) Garant(s) :");
		lblTableGarant.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTableGarant.setBounds(562, 61, 109, 20);
		panel.add(lblTableGarant);
		
		JScrollPane scrollPaneColocataire = new JScrollPane();
		scrollPaneColocataire.setBounds(890, 83, 239, 138);
		panel.add(scrollPaneColocataire);
		
		tableColocataire = new JTable();
		tableColocataire.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Nom", "Prénom"
			}
		));
		scrollPaneColocataire.setViewportView(tableColocataire);
		
		JLabel labelColocataires = new JLabel("Colocataire(s) :");
		labelColocataires.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelColocataires.setBounds(890, 58, 108, 27);
		panel.add(labelColocataires);
		
		JLabel lblTelephone = new JLabel("Telephone :");
		lblTelephone.setBounds(31, 84, 116, 14);
		panel.add(lblTelephone);
		
		JLabel lblDateNaissance = new JLabel("Date de naissance :");
		lblDateNaissance.setBounds(31, 127, 116, 14);
		panel.add(lblDateNaissance);
		
		JLabel lblAncienLocataire = new JLabel("Ancien locataire :");
		lblAncienLocataire.setBounds(31, 173, 117, 14);
		panel.add(lblAncienLocataire);
		
		JLabel lblMontantloyer = new JLabel("Montant du loyer :");
		lblMontantloyer.setBounds(355, 127, 116, 14);
		panel.add(lblMontantloyer);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(324, 85, 84, 14);
		panel.add(lblAdresse);
		
		JButton btnModifierLocataire = new JButton("Modifier");
		btnModifierLocataire.addActionListener(gestionDetailsLocataire);
		btnModifierLocataire.setBounds(420, 32, 107, 20);
		panel.add(btnModifierLocataire);
		
		JButton btnCharger = new JButton("Charger les tableaux");
		btnCharger.addActionListener(gestionDetailsLocataire);
		btnCharger.setBounds(553, 240, 175, 21);
		panel.add(btnCharger);

	}
	public String getNom() {
		return nom.getText();
	}


	public void setNom(String nom) {
		this.nom.setText(nom); 
	}


	public String getPrenom() {
		return prenom.getText();
	}


	public void setPrenom(String prenom) {
		this.prenom.setText(prenom);
	}


	public String getTelephone() {
		return telephone.getText();
	}


	public void setTelephone(String telephone) {
		this.telephone.setText(telephone);
	}


	public String getDateNaissance() {
		return dateNaissance.getText();
	}


	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance.setText(dateNaissance);
	}


	public String getAncienLocataire() {
		return ancienLocataire.getText();
	}


	public void setAncienLocataire(String ancienLocataire) {
		this.ancienLocataire.setText(ancienLocataire);
	}


	public String getLoyer() {
		return loyer.getText();
	}


	public void setLoyer(String loyer) {
		this.loyer.setText(loyer);
	}


	public String getAdresse() {
		return adresse.getText();
	}


	public void setAdresse(String adresse) {
		this.adresse.setText(adresse);
	}


	public JTable getTableGarant() {
		return tableGarant;
	}


	public JTable getTableColocataire() {
		return tableColocataire;
	}
	
	
	public int getIdLocataire() {
		return idLocataire;
	}
	public void setIdLocataire(int idLocataire) {
		this.idLocataire = idLocataire;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getDepotGarantie() {
		return depotGarantie;
	}
	public void setDepotGarantie(float depotGarantie) {
		this.depotGarantie = depotGarantie;
	}
	public float getPartPossession() {
		return partPossession;
	}
	public void setPartPossession(float partPossession) {
		this.partPossession = partPossession;
	}
	
	
}
