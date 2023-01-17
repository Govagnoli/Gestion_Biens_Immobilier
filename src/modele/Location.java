package modele;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC.CictOracleDataSource;

public class Location {
	
	private int idLocation;
	private String taxe_fonciere;
	private int duree;
	private Date dateDebContrat;
	private String adresse;
	private String ville;
	private int cp;
	private int numero;
	private Connection connexion;
	
	public Location(int idLocation, String taxe_fonciere, int duree, Date dateDebContrat, String adresse,
			String ville, int cp, int numero) throws SQLException {
		this.idLocation = idLocation;
		this.taxe_fonciere = taxe_fonciere;
		this.duree = duree; 
		this.dateDebContrat = dateDebContrat;
		this.adresse = adresse;
		this.ville = ville;
		this.cp = cp;
		this.numero = numero;
		CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
		this.connexion = CictOracleDataSource.getConnexion();
	}
	
	public Location(int idLocation) throws SQLException {
		CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
		this.connexion = CictOracleDataSource.getConnexion();
		
		String req = "select * "
				+ "from S3_Location "
				+ "where ID_LOCATION = ?";
		PreparedStatement st = this.connexion.prepareStatement(req);
		st.setInt(1, idLocation);
		ResultSet res = st.executeQuery();
		
		while(res.next()) {
			this.setIdLocation(idLocation);
			this.setTaxe_fonciere(res.getString("TAXE_FONCIERE"));
			this.setDuree(res.getInt("DUREE"));
			this.setDateDebContrat(res.getDate("DATE_DEBUT_CONTRAT"));
			this.setAdresse(res.getString("ADRESSE"));
			this.setVille(res.getString("VILLE"));
			this.setCp(res.getInt("CP"));
			this.setNumero(res.getInt("NUMEREO"));
		}	
	}
	
	public int getIdLocation() {
		return idLocation;
	}

	public void setIdLocation(int idLocation) {
		this.idLocation = idLocation;
	}

	public String getTaxe_fonciere() {
		return taxe_fonciere;
	}

	public void setTaxe_fonciere(String taxe_fonciere) {
		this.taxe_fonciere = taxe_fonciere;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Date getDateDebContrat() {
		return dateDebContrat;
	}

	public void setDateDebContrat(Date dateDebContrat) {
		this.dateDebContrat = dateDebContrat;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}	
}
