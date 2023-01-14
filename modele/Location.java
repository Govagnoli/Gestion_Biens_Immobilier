package modele;

import java.sql.Date;

public class Location {
	
	private int idLocation;
	private String taxe_fonciere;
	private int duree;
	private Date dateDebContrat;
	private String adresse;
	private String ville;
	private int cp;
	private int numero;
	
	public Location(int idLocation, String taxe_fonciere, int duree, Date dateDebContrat, String adresse,
			String ville, int cp, int numero) {
		super();
		this.idLocation = idLocation;
		this.taxe_fonciere = taxe_fonciere;
		this.duree = duree;
		this.dateDebContrat = dateDebContrat;
		this.adresse = adresse;
		this.ville = ville;
		this.cp = cp;
		this.numero = numero;
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
