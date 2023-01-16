package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;

import JDBC.CictOracleDataSource;
import vue.FenAjoutLocataire;

public class GestionAjoutLocataire implements ActionListener, ItemListener{
	
	private FenAjoutLocataire fenAjoutLocataire;
	private boolean ancienLocataire;
	
	public GestionAjoutLocataire(FenAjoutLocataire fenAjoutLocataire) {
		this.fenAjoutLocataire = fenAjoutLocataire;
		this.ancienLocataire = false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		switch(item.getText()) {
		case "Ajouter un garant":
			String NomGarant = this.fenAjoutLocataire.getNomGarant();
			String prenomGarant = this.fenAjoutLocataire.getPrenomGarant();
			String adresseGarant = this.fenAjoutLocataire.getAdresseGarant();
			String villeGarant = this.fenAjoutLocataire.getVilleGarant();
			String codePostalGarant = this.fenAjoutLocataire.getCodePostalGarant();
			int codePostal = Integer.parseInt(codePostalGarant);
			String telephoneGarant = this.fenAjoutLocataire.getTelephoneGarant();
			int telGarant = Integer.parseInt(telephoneGarant);
			String emailGarant = this.fenAjoutLocataire.getEmailGarant();
			
			if(NomGarant.isBlank() || prenomGarant.isBlank() || adresseGarant.isBlank() || villeGarant.isBlank() || codePostalGarant.isBlank() || telephoneGarant.isBlank() || emailGarant.isBlank()) {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutLocataire,"Il manque des informations.", "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
			} else {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutLocataire,"Le garant a bien été ajouté.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
				try {
					CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
					Connection connexion = CictOracleDataSource.getConnexion();

				    CallableStatement statement = connexion.prepareCall("{call S3_AJOUT_GARANT(?,?,?,?,?,?,?)}");
				    statement.setString(1, NomGarant);
				    statement.setString(2, prenomGarant);
				    statement.setString(3, adresseGarant);
				    statement.setString(4, villeGarant);
				    statement.setInt(5, codePostal);
				    statement.setInt(6, telGarant);
				    statement.setString(7, emailGarant);
				    statement.executeUpdate();
				    
					connexion.close();
				} catch (SQLException e1) {
				    e1.printStackTrace();
				}
			}
			break;
		case "Ajouter":
			//ATTENTION, à faire lors de l'ajout de la BDD.
			//Vérifier qu'un garant existe et poser la question si le locataire à bien pas de garant.
			
			String nomLocataire = this.fenAjoutLocataire.getNomLocataire();
			String prenomLocataire = this.fenAjoutLocataire.getPrenomLocataire();
			String telephoneLocataire = this.fenAjoutLocataire.getTelephoneLocataire();
			String emailLocataire = this.fenAjoutLocataire.getEmailLocataire();
			String dateDeNaissanceLocataire = this.fenAjoutLocataire.getDateDeNaissanceLocataire();
			String adresseBienLocataire = this.fenAjoutLocataire.getAdresseBienLocataire();
			String dateEntree = this.fenAjoutLocataire.getDateEntree();
			String numBienLocataire = this.fenAjoutLocataire.getNumeroBien();
			int numBien = Integer.parseInt(numBienLocataire);
			int telLocataire = Integer.parseInt(telephoneLocataire);
			int depotGarantie = Integer.parseInt("300");
			int partPossession = Integer.parseInt("1");
			//ATTENTION, à faire lors de l'ajout de la BDD.
			//Verifier que l'adresse du locataire à ajouter est bien une adresse d'un bien appartenant au propriétaire.
			
			if(nomLocataire.isBlank() || prenomLocataire.isBlank() || telephoneLocataire.isBlank() || emailLocataire.isBlank() || dateDeNaissanceLocataire.isBlank() || adresseBienLocataire.isBlank() || dateEntree.isBlank()) {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutLocataire,"Il manque des informations.", "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
			} else {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutLocataire,"Le locataire à bien été ajouté.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
				try {
					CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
					Connection connexion = CictOracleDataSource.getConnexion();

				    CallableStatement statement = connexion.prepareCall("{call S3_AJOUT_LOCATAIRE(?,?,?,?,?,?,?,?)}");
				    statement.setString(1, nomLocataire);
				    statement.setString(2, prenomLocataire);
				    statement.setInt(3, telLocataire);
				    statement.setString(4, emailLocataire);
				    statement.setString(5, dateDeNaissanceLocataire);
				    statement.setInt(6, depotGarantie);
				    if(this.fenAjoutLocataire.getRdbtnAncienNon().getSelectedObjects() == null) {
				    	statement.setString(7, "OUI");
					} else {
						statement.setString(7, "NON");
					}
				    statement.setInt(8, partPossession);
				    statement.executeUpdate();
				    
				    String req1 = "select ID_LOCATAIRE from S3_LOCATAIRE where TEL = ?";
				    PreparedStatement stmt1 = connexion.prepareStatement(req1);
				    stmt1.setInt(1, telLocataire);
				    ResultSet res1 = stmt1.executeQuery();
					res1.next();
					int idLocataire = res1.getInt("ID_LOCATAIRE");
					
				    String req2 = "select ID_LOCATION from S3_LOCATION where ADRESSE = ? and NUMERO = ?";
					PreparedStatement stmt2 = connexion.prepareStatement(req2);
					stmt2.setString(1, adresseBienLocataire);
					stmt2.setInt(2, numBien);
					ResultSet res2 = stmt2.executeQuery();
					res2.next();
					int idLocation = res2.getInt("ID_LOCATION");
					
					String req3 = "insert into S3_LOUER values(?, ?)";
					PreparedStatement stmt3 = connexion.prepareStatement(req3);
					stmt3.setInt(1, idLocation);
					stmt3.setInt(2, idLocataire);
					stmt3.executeUpdate();
					
				    connexion.close();

				} catch (SQLException e1) {
				    e1.printStackTrace();
				}
			}
			break;
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(this.fenAjoutLocataire.getRdbtnAncienNon().getSelectedObjects() == null) {
			this.ancienLocataire = true;
		} else {
			this.ancienLocataire = false;
		}		
	}
}
