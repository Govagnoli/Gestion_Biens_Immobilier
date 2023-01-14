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
import vue.FenAjoutAssociation;

public class GestionAjoutAssociation implements ActionListener, ItemListener{
	
	private FenAjoutAssociation fenAjoutAssociation;
	private boolean donationMensuel;
	
	public GestionAjoutAssociation(FenAjoutAssociation fenAjoutAssociation) {
		this.fenAjoutAssociation = fenAjoutAssociation;
		this.donationMensuel = true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		switch(item.getText()) {
		case "Ajouter":
			
			String sirenAsso = this.fenAjoutAssociation.getSirenAssociation();
			String nomAsso = this.fenAjoutAssociation.getNomAssociation() ;
			String dateDonation = this.fenAjoutAssociation.getDateDonnation() ;
			String montantDon = this.fenAjoutAssociation.getMontantDonnation() ;
			int siren = Integer.parseInt(sirenAsso);
			int montDonation = Integer.parseInt(montantDon);
			if(sirenAsso.isBlank() ||nomAsso.isBlank() ||dateDonation.isBlank() ||montantDon.isBlank()) {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutAssociation,"Il manque des informations.", "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
			} else {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutAssociation,"L'enregistrement à bien été pris en compte.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
				try {
					CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
					Connection connexion = CictOracleDataSource.getConnexion();
					
					
				    CallableStatement statement = connexion.prepareCall("{call S3_AJOUT_ASSOCIATION(?,?,?,?,?,?)}");
				    statement.setInt(1, siren);
				    statement.setString(2, nomAsso);
				    statement.setString(3, dateDonation);
				    statement.setInt(4, montDonation);
				    statement.setString(5, "MILLANT");
				    statement.setString(6, "Thierry");
				    
				    statement.executeUpdate();
				    
				    connexion.close();

				} catch (SQLException e1) {
				    e1.printStackTrace();
				}
				this.fenAjoutAssociation.dispose();
			}
			break;
		case "Annuler":
			this.fenAjoutAssociation.dispose();
			break;
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
