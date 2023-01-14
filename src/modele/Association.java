package modele;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JDBC.CictOracleDataSource;

public class Association {
	private int siren;
	private String libelle;
	private Date dateDonation;
	private float montantDonation;
	private static final String NOMPROPRIO = "MILLANT";
	private static final String PRENOMPROPRIO = "Thierry";
	private Connection connexion;
	
	public Association(int siren, String libelle, Date dateDonation, float montantDonation) throws SQLException {
		super();
		this.siren = siren;
		this.libelle = libelle;
		this.dateDonation = dateDonation;
		this.montantDonation = montantDonation;
		CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
		this.connexion = CictOracleDataSource.getConnexion();
		
	}
	
	public Association(int siren) throws SQLException {
		CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
		this.connexion = CictOracleDataSource.getConnexion();
		String req = "Select * from S3_ASSOCIATIONS WHERE SIREN = ?";
		PreparedStatement st = this.connexion.prepareStatement(req);
		st.setInt(1, siren);
		ResultSet res = st.executeQuery();
		while(res.next()) {
			this.setSiren(res.getInt("Siren"));
			this.setLibelle(res.getString("LIBELLE"));
			this.setDateDonation(res.getDate("DATE_DONATION"));
			this.setMontantDonation(res.getFloat("MONTANT_DONNATION"));
		}
	}
	
	public int getSiren() {
		return siren;
	}

	public void setSiren(int sren) {
		this.siren = sren;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDateDonation() {
		return dateDonation;
	}

	public void setDateDonation(Date dateDonation) {
		this.dateDonation = dateDonation;
	}

	public float getMontantDonation() {
		return montantDonation;
	}

	public void setMontantDonation(float montantDonation) {
		this.montantDonation = montantDonation;
	}

	public static String getNomproprio() {
		return NOMPROPRIO;
	}

	public static String getPrenomproprio() {
		return PRENOMPROPRIO;
	}
	
	
	
}
