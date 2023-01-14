package modele;

public class Garant {
	int idGarant;
	String nom;
	String prenom;
	String adresse;
	String ville;
	int cp;
	int tel;
	String email;
	
	public Garant(int idGarant, String nom, String prenom, String adresse, String ville, int cp, int tel,
			String email) {
		super();
		this.idGarant = idGarant;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.cp = cp;
		this.tel = tel;
		this.email = email;
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

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdGarant() {
		return idGarant;
	}
	
	
}
