package modele;

import java.sql.Date;

public class BienImmobilier {
	private String adresse;
	private String ville;
	private int cp;
	private int numero;
	private String garage;
	private float superficie;
	private float tantiemes;
	private float loyer;
	private Date date_acquisition;
	private int nbrLocataireMax;
	private int idAssurance;
	private static final String NOMPROPRIO = "MILLANT";
	private static final String PRENOMPROPRIO = "Thierry";
	
	private String nom;
	private String prenom;
	public BienImmobilier(String adresse, String ville, int cp, int numero, String garage, float superficie,
			float tantiemes, float loyer, Date date_acquisition, int nbrLocataireMax, int idAssurance) {
		super();
		this.adresse = adresse;
		this.ville = ville;
		this.cp = cp;
		this.numero = numero;
		this.garage = garage;
		this.superficie = superficie;
		this.tantiemes = tantiemes;
		this.loyer = loyer;
		this.date_acquisition = date_acquisition;
		this.nbrLocataireMax = nbrLocataireMax;
		this.idAssurance = idAssurance;
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
	public String getGarage() {
		return garage;
	}
	public void setGarage(String garage) {
		this.garage = garage;
	}
	public float getSuperficie() {
		return superficie;
	}
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	public float getTantiemes() {
		return tantiemes;
	}
	public void setTantiemes(float tantiemes) {
		this.tantiemes = tantiemes;
	}
	public float getLoyer() {
		return loyer;
	}
	public void setLoyer(float loyer) {
		this.loyer = loyer;
	}
	public Date getDate_acquisition() {
		return date_acquisition;
	}
	public void setDate_acquisition(Date date_acquisition) {
		this.date_acquisition = date_acquisition;
	}
	public int getNbrLocataireMax() {
		return nbrLocataireMax;
	}
	public void setNbrLocataireMax(int nbrLocataireMax) {
		this.nbrLocataireMax = nbrLocataireMax;
	}
	public int getIdAssurance() {
		return idAssurance;
	}
	public void setIdAssurance(int idAssurance) {
		this.idAssurance = idAssurance;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public static String getNomproprio() {
		return NOMPROPRIO;
	}
	public static String getPrenomproprio() {
		return PRENOMPROPRIO;
	}
	
	
	
}
