package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import controleur.GestionFermerPages;

public class FenGarant extends JFrame {

	private JPanel contentPane;
	private GestionFermerPages gestionFermerPages;
	private JLabel identifiant;
	private JLabel NomClient;
	private JLabel PrenomClient;
	private JLabel AdresseClient;
	private JLabel ville;
	private JLabel cp;
	private JLabel TelephoneClient;
	private JLabel EmailClient;

	public FenGarant() {
		
		this.gestionFermerPages = new GestionFermerPages(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 422);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel Page = new JPanel();
		contentPane.add(Page, BorderLayout.CENTER);
		Page.setLayout(null);
		
		JPanel informations = new JPanel();
		informations.setBounds(52, 47, 267, 267);
		Page.add(informations);
		informations.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Information du garant", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagLayout gbl_informations = new GridBagLayout();
		gbl_informations.columnWidths = new int[] {30, 0, 30, 30};
		gbl_informations.rowHeights = new int[] {0, 30, 30, 0, 0, 0, 30, 0, 30, 30};
		gbl_informations.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gbl_informations.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		informations.setLayout(gbl_informations);
		
		JLabel lblIdentifiant = new JLabel("Identifiant :");
		lblIdentifiant.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblIdentifiant = new GridBagConstraints();
		gbc_lblIdentifiant.anchor = GridBagConstraints.EAST;
		gbc_lblIdentifiant.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentifiant.gridx = 1;
		gbc_lblIdentifiant.gridy = 0;
		informations.add(lblIdentifiant, gbc_lblIdentifiant);
		
		identifiant = new JLabel("5");
		GridBagConstraints gbc_identifiant = new GridBagConstraints();
		gbc_identifiant.anchor = GridBagConstraints.WEST;
		gbc_identifiant.insets = new Insets(0, 0, 5, 5);
		gbc_identifiant.gridx = 2;
		gbc_identifiant.gridy = 0;
		informations.add(identifiant, gbc_identifiant);
		
		JLabel lblNomClient = new JLabel("Nom :");
		lblNomClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNomClient = new GridBagConstraints();
		gbc_lblNomClient.anchor = GridBagConstraints.EAST;
		gbc_lblNomClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomClient.gridx = 1;
		gbc_lblNomClient.gridy = 1;
		informations.add(lblNomClient, gbc_lblNomClient);
		
		NomClient = new JLabel("nom");
		GridBagConstraints gbc_NomClient = new GridBagConstraints();
		gbc_NomClient.anchor = GridBagConstraints.WEST;
		gbc_NomClient.insets = new Insets(0, 0, 5, 5);
		gbc_NomClient.gridx = 2;
		gbc_NomClient.gridy = 1;
		informations.add(NomClient, gbc_NomClient);
		
		JLabel lblPrenomClient = new JLabel("Pr\u00E9nom :");
		lblPrenomClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblPrenomClient = new GridBagConstraints();
		gbc_lblPrenomClient.anchor = GridBagConstraints.EAST;
		gbc_lblPrenomClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrenomClient.gridx = 1;
		gbc_lblPrenomClient.gridy = 2;
		informations.add(lblPrenomClient, gbc_lblPrenomClient);
		
		PrenomClient = new JLabel("Pr\u00E9nom");
		GridBagConstraints gbc_PrenomClient = new GridBagConstraints();
		gbc_PrenomClient.anchor = GridBagConstraints.WEST;
		gbc_PrenomClient.insets = new Insets(0, 0, 5, 5);
		gbc_PrenomClient.gridx = 2;
		gbc_PrenomClient.gridy = 2;
		informations.add(PrenomClient, gbc_PrenomClient);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblAdresse = new GridBagConstraints();
		gbc_lblAdresse.anchor = GridBagConstraints.EAST;
		gbc_lblAdresse.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdresse.gridx = 1;
		gbc_lblAdresse.gridy = 3;
		informations.add(lblAdresse, gbc_lblAdresse);
		
		AdresseClient = new JLabel("14 rue des tuilerie");
		GridBagConstraints gbc_AdresseClient = new GridBagConstraints();
		gbc_AdresseClient.anchor = GridBagConstraints.WEST;
		gbc_AdresseClient.insets = new Insets(0, 0, 5, 5);
		gbc_AdresseClient.gridx = 2;
		gbc_AdresseClient.gridy = 3;
		informations.add(AdresseClient, gbc_AdresseClient);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblVille = new GridBagConstraints();
		gbc_lblVille.anchor = GridBagConstraints.EAST;
		gbc_lblVille.insets = new Insets(0, 0, 5, 5);
		gbc_lblVille.gridx = 1;
		gbc_lblVille.gridy = 4;
		informations.add(lblVille, gbc_lblVille);
		
		ville = new JLabel("Toulouse");
		GridBagConstraints gbc_ville = new GridBagConstraints();
		gbc_ville.anchor = GridBagConstraints.WEST;
		gbc_ville.insets = new Insets(0, 0, 5, 5);
		gbc_ville.gridx = 2;
		gbc_ville.gridy = 4;
		informations.add(ville, gbc_ville);
		
		JLabel lblCP = new JLabel("Code postal :");
		lblCP.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblCP = new GridBagConstraints();
		gbc_lblCP.insets = new Insets(0, 0, 5, 5);
		gbc_lblCP.gridx = 1;
		gbc_lblCP.gridy = 5;
		informations.add(lblCP, gbc_lblCP);
		
		cp = new JLabel("31000");
		GridBagConstraints gbc_cp = new GridBagConstraints();
		gbc_cp.anchor = GridBagConstraints.WEST;
		gbc_cp.insets = new Insets(0, 0, 5, 5);
		gbc_cp.gridx = 2;
		gbc_cp.gridy = 5;
		informations.add(cp, gbc_cp);
		
		JLabel lblTelephoneClient = new JLabel("T\u00E9l\u00E9phone :");
		lblTelephoneClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblTelephoneClient = new GridBagConstraints();
		gbc_lblTelephoneClient.anchor = GridBagConstraints.EAST;
		gbc_lblTelephoneClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelephoneClient.gridx = 1;
		gbc_lblTelephoneClient.gridy = 6;
		informations.add(lblTelephoneClient, gbc_lblTelephoneClient);
		
		TelephoneClient = new JLabel("00-00-00-00-00");
		GridBagConstraints gbc_TelephoneClient = new GridBagConstraints();
		gbc_TelephoneClient.anchor = GridBagConstraints.WEST;
		gbc_TelephoneClient.insets = new Insets(0, 0, 5, 5);
		gbc_TelephoneClient.gridx = 2;
		gbc_TelephoneClient.gridy = 6;
		informations.add(TelephoneClient, gbc_TelephoneClient);
		
		JLabel lblEmailClient = new JLabel("E-mail :");
		lblEmailClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblEmailClient = new GridBagConstraints();
		gbc_lblEmailClient.anchor = GridBagConstraints.EAST;
		gbc_lblEmailClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailClient.gridx = 1;
		gbc_lblEmailClient.gridy = 7;
		informations.add(lblEmailClient, gbc_lblEmailClient);
		
		EmailClient = new JLabel("nomprenom@gmail.com");
		GridBagConstraints gbc_EmailClient = new GridBagConstraints();
		gbc_EmailClient.insets = new Insets(0, 0, 5, 5);
		gbc_EmailClient.gridx = 2;
		gbc_EmailClient.gridy = 7;
		informations.add(EmailClient, gbc_EmailClient);
		
		JLabel lblTitre = new JLabel("Garant");
		lblTitre.setBounds(10, 11, 60, 25);
		Page.add(lblTitre);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(this.gestionFermerPages);
		btnFermer.setBounds(337, 339, 89, 23);
		Page.add(btnFermer);
	}

	public JLabel getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant.setText(identifiant);
	}

	public JLabel getNomClient() {
		return NomClient;
	}

	public void setNomClient(String nomClient) {
		NomClient.setText(nomClient);
	}

	public JLabel getPrenomClient() {
		return PrenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		PrenomClient.setText(prenomClient);
	}

	public JLabel getAdresseClient() {
		return AdresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		AdresseClient.setText(adresseClient);
	}

	public JLabel getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville.setText(ville);
	}

	public JLabel getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp.setText(cp);
	}

	public JLabel getTelephoneClient() {
		return TelephoneClient;
	}

	public void setTelephoneClient(String telephoneClient) {
		TelephoneClient.setText(telephoneClient);
	}

	public JLabel getEmailClient() {
		return EmailClient;
	}

	public void setEmailClient(String emailClient) {
		EmailClient.setText(emailClient);
	}
	
	
}
