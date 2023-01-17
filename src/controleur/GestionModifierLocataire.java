package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;

import JDBC.CictOracleDataSource;
import vue.FenModifierLocataire;

public class GestionModifierLocataire implements ActionListener, ItemListener{
	
	private FenModifierLocataire fenModifierLocataire;
	private boolean ancienLocataire;
	
	public GestionModifierLocataire(FenModifierLocataire fenModifierLocataire) {
		this.fenModifierLocataire = fenModifierLocataire;
		this.ancienLocataire = false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Modifier":
			//ATTENTION, à faire lors de l'ajout de la BDD.
			//Vérfier qu'un garant existe et poser la question si le locataire à bien pas de garant.
			
			int idLoc = Integer.parseInt(this.fenModifierLocataire.getIdLocataire());
			String nomLocataire = this.fenModifierLocataire.getNomLocataire();
			String prenomLocataire = this.fenModifierLocataire.getPrenomLocataire();
			String telephoneLocataire = this.fenModifierLocataire.getTelephoneLocataire();
			String emailLocataire = this.fenModifierLocataire.getEmailLocataire();
			String dateDeNaissanceLocataire = this.fenModifierLocataire.getDateDeNaissanceLocataire();
			int telLoc = Integer.parseInt(telephoneLocataire);
			int depotGarantie = Integer.parseInt("300");
			int partPossession = Integer.parseInt("1");
			
			//ATTENTION, à faire lors de l'ajout de la BDD.
			//Verifier que l'adresse du locataire à ajouter est bien une adresse d'un bien appartenant au propriétaire.
			
			if(nomLocataire.isBlank() || prenomLocataire.isBlank() || telephoneLocataire.isBlank() || emailLocataire.isBlank() || dateDeNaissanceLocataire.isBlank()) {
				javax.swing.JOptionPane.showMessageDialog(this.fenModifierLocataire,"Il manque des informations.", "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
			} else {
				javax.swing.JOptionPane.showMessageDialog(this.fenModifierLocataire,"Le locataire à bien été modifié.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
				try {
					CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
					Connection connexion = CictOracleDataSource.getConnexion();

				    CallableStatement statement = connexion.prepareCall("UPDATE S3_LOCATAIRE SET NOM = ?, "
				    		+ "PRENOM = ?, TEL = ?, EMAIL = ?, DATE_NAISSANCE = ?, DEPOT_GARANTIE = ?, "
				    		+ "ANCIEN_LOCATAIRE = ?, PART_POSSESSION = ? where id_locataire = ?");
				    statement.setString(1, nomLocataire);
				    statement.setString(2, prenomLocataire);
				    statement.setInt(3, telLoc);
				    statement.setString(4, emailLocataire);
				    statement.setString(5, dateDeNaissanceLocataire);
				    statement.setInt(6, depotGarantie);
				    if(this.fenModifierLocataire.getRdbtnAncienNon().getSelectedObjects() == null) {
				    	statement.setString(7, "OUI");
					} else {
						statement.setString(7, "NON");
					}
				    statement.setInt(8, partPossession);
				    statement.setInt(9, idLoc);
				    statement.executeUpdate();
				    
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
		if(this.fenModifierLocataire.getRdbtnAncienNon().getSelectedObjects() == null) {
			this.ancienLocataire = true;
		} else {
			this.ancienLocataire = false;
		}		
	}
}
