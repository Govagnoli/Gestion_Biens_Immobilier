package modele;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC.CictOracleDataSource;

public class Assurance {
	private int idAssurance;
	private String numContrant;
	private float prime;
	private float protectionJuridique;
	private Date finDeValidite;
	private Date debutDeValidite;
	private float tauxAugmentation;
	private static final String NOMPROPRIO = "MILLANT";
	private static final String PRENOMPROPRIO = "Thierry";
	private Connection connexion;
	
	
	public Assurance(int idAssurance, String numContrant, float prime, float protectionJuridique, Date finDeValidite,
			Date debutDeValidite, float tauxAugmentation) throws SQLException {
		CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
		this.connexion = CictOracleDataSource.getConnexion();
		this.idAssurance = idAssurance;
		this.numContrant = numContrant;
		this.prime = prime;
		this.protectionJuridique = protectionJuridique;
		this.finDeValidite = finDeValidite;
		this.debutDeValidite = debutDeValidite;
		this.tauxAugmentation = tauxAugmentation;
	}
	public Assurance(int idAssurance) throws SQLException {
		CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
		this.connexion = CictOracleDataSource.getConnexion();
		String req = "Select * from S3_ASSURANCE WHERE ID_ASSURANCE = ?";
		PreparedStatement st = this.connexion.prepareStatement(req);
		st.setInt(1, idAssurance);
		ResultSet res = st.executeQuery();
		while(res.next()) {
			this.setIdAssurance(res.getInt("ID_ASSURANCE"));
			this.setNumContrant(res.getString("NUM_CONTRAT"));
			this.setPrime(res.getFloat("PRIME"));
			this.setProtectionJuridique(res.getFloat("PROTECTION_JURIDIQUE"));
			this.setFinDeValidite(res.getDate("DATE_FIN_DE_VALIDITE"));
			this.setDebutDeValidite(res.getDate("DATE_DEBUT_VALIDITE"));
			this.setTauxAugmentation(res.getFloat("TAUX_AUGMENTATION"));
		}
	}
	
	public int getIdAssurance() {
		return idAssurance;
	}
	public void setIdAssurance(int idAssurance) {
		this.idAssurance = idAssurance;
	}
	public String getNumContrant() {
		return numContrant;
	}
	public void setNumContrant(String numContrant) {
		this.numContrant = numContrant;
	}
	public float getPrime() {
		return prime;
	}
	public void setPrime(float prime) {
		this.prime = prime;
	}
	public float getProtectionJuridique() {
		return protectionJuridique;
	}
	public void setProtectionJuridique(float protectionJuridique) {
		this.protectionJuridique = protectionJuridique;
	}
	public Date getFinDeValidite() {
		return finDeValidite;
	}
	public void setFinDeValidite(Date finDeValidite) {
		this.finDeValidite = finDeValidite;
	}
	public Date getDebutDeValidite() {
		return debutDeValidite;
	}
	public void setDebutDeValidite(Date debutDeValidite) {
		this.debutDeValidite = debutDeValidite;
	}
	public float getTauxAugmentation() {
		return tauxAugmentation;
	}
	public void setTauxAugmentation(float tauxAugmentation) {
		this.tauxAugmentation = tauxAugmentation;
	}
	public Connection getConnexion() {
		return connexion;
	}
	public void setConnexion(Connection connexion) {
		this.connexion = connexion;
	}
	public static String getNomproprio() {
		return NOMPROPRIO;
	}
	public static String getPrenomproprio() {
		return PRENOMPROPRIO;
	}
	
	
}
