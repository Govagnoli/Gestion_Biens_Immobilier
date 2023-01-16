package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;

import JDBC.CictOracleDataSource;
import vue.FenAjoutBien;

public class GestionAjoutBien implements ActionListener, ItemListener{

	private FenAjoutBien fenAjoutBien;
	private boolean Logement;
	
	public GestionAjoutBien(FenAjoutBien fenAjoutBien) {
		this.fenAjoutBien = fenAjoutBien;
		this.Logement = true;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();		
		switch(item.getText()) {
		case "Ajouter":
			String textAdresse = this.fenAjoutBien.getTextAdresse();
			String textVille = this.fenAjoutBien.getTextVille();
			String textCP = this.fenAjoutBien.getTextCP();
			String WithoutSpace = textCP.replaceAll(" ", "");
			int CP = Integer.parseInt(WithoutSpace);
			String textLoyer = this.fenAjoutBien.getTextLoyer();
			textLoyer = textLoyer.replaceAll(" ", "");
			textLoyer = textLoyer.replaceAll(",", ".");
			double decimal = Double.parseDouble(textLoyer);
			int Loyer = (int)decimal;
			String TextSuperficie = this.fenAjoutBien.getTextSuperficie();
			TextSuperficie = TextSuperficie.replaceAll(",", ".");
			TextSuperficie = TextSuperficie.replaceAll(" ", "");
			double decimalSup = Double.parseDouble(TextSuperficie);
			int Superficie = (int)decimalSup;
			String textDateAcquisition = this.fenAjoutBien.getTextDateAcquisition();
			String SpinnerNbrLocataireMax = this.fenAjoutBien.getStrSpinnerNbrLocataireMax();
			int LocataireMax = Integer.parseInt(SpinnerNbrLocataireMax);
			String textNumero = this.fenAjoutBien.getTextNumero();
			textNumero = textNumero.replaceAll(",", ".");
			int Numero = Integer.parseInt(textNumero);
			String textLG = this.fenAjoutBien.getRadioSelected();
			String textTantieme = this.fenAjoutBien.getTextTantiemes();
			int tantieme = java.sql.Types.INTEGER;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
			
			if(textAdresse.isBlank() || textVille.isBlank() || textCP.isBlank() || textLoyer.isBlank() || TextSuperficie.isBlank() || textDateAcquisition.isBlank() || SpinnerNbrLocataireMax.isBlank()) {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutBien,"Il manque des informations.", "Erreur", javax.swing.JOptionPane.ERROR_MESSAGE);
			} else if(this.Logement) {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutBien,"Le logement a bien été ajouté à la liste de vos biens.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
				try {
					java.util.Date utilDate = sdf.parse(textDateAcquisition);
					java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
					
	                CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
	                Connection connexion = CictOracleDataSource.getConnexion();

	                CallableStatement statement = connexion.prepareCall("{call S3_AJOUT_BIEN_IMMOBILIER(?,?,?,?,?,?,?,?,?,?,?)}");
	                statement.setString(1, textAdresse);
	                statement.setString(2, textVille);
	                statement.setInt(3, CP);
	                if (textNumero.isBlank()) {
	                	statement.setInt(4, 666);
	                }else {
	                	statement.setInt(4, Numero);
	                }
	                statement.setInt(5, Superficie);
	                if (textLG == "Logement") {
	                	statement.setString(6, "NON");
	                }else {
	                	statement.setString(6, "OUI");
	                }
	                if (textTantieme.isBlank()) {
	                	statement.setNull(7, tantieme);
	                }else {
	                	statement.setInt(7, Integer.parseInt(textTantieme));
	                }
	                statement.setInt(8, Loyer);
	                statement.setString(9, textDateAcquisition);
	                statement.setInt(10, LocataireMax);
	                statement.setInt(11, 1);
	                statement.executeUpdate();
	                connexion.close();

	            } catch (SQLException | ParseException e1) {
	                e1.printStackTrace();
	            }
				fenAjoutBien.dispose();
			} else {
				javax.swing.JOptionPane.showMessageDialog(this.fenAjoutBien,"Le garage a bien été ajouté à la liste de vos biens.", "information", javax.swing.JOptionPane.INFORMATION_MESSAGE);
				fenAjoutBien.dispose();
			}
			break;
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(this.fenAjoutBien.getRdbtnLogement().getSelectedObjects() == null) {
			this.Logement = false;
		} else {
			this.Logement = true;
		}		
	}
}
