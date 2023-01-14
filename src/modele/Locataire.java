package modele;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import JDBC.CictOracleDataSource;

public class Locataire {
	private int idLocataire;
	private String nom;
	private String prenom;
	private int tel;
	private String email;
	private Date dateNaissance;
	private float depotGarantie;
	private String ancienLocataire;
	private float partPossession;
	private Connection connexion;
	
	public Locataire(int idLocataire, String nom, String prenom, int tel, String email, Date dateNaissance,
			float depotGarantie, String ancienLocataire, float partPossession) throws SQLException {
		this.idLocataire = idLocataire;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.dateNaissance = dateNaissance;
		this.depotGarantie = depotGarantie;
		this.ancienLocataire = ancienLocataire;
		this.partPossession = partPossession;
		CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
		this.connexion = CictOracleDataSource.getConnexion();
	}
	
	public Locataire(int idLocataire) throws SQLException {
		CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
		this.connexion = CictOracleDataSource.getConnexion();
		
		String req = "select * "
				+ "from S3_Locataire "
				+ "where ID_LOCATAIRE = ?";
		PreparedStatement st = this.connexion.prepareStatement(req);
		st.setInt(1, idLocataire);
		ResultSet res = st.executeQuery();
		
		while(res.next()) {
			this.setIdLocataire(idLocataire);
			this.setNom(res.getString("NOM"));
			this.setPrenom(res.getString("PRENOM"));
			this.setTel(res.getInt("TEL"));
			this.setEmail(res.getString("EMAIL"));
			this.setDateNaissance(res.getDate("DATE_NAISSANCE"));
			this.setDepotGarantie(res.getFloat("DEPOT_GARANTIE"));
			this.setAncienLocataire(res.getString("ANCIEN_LOCATAIRE"));
			this.setPartPossession(res.getFloat("PART_POSSESSION"));
		}
	}
	
	//retourne la liste des locataires habitants avec le locataire
	//S'il n'y a pas de colocataire renvoit null
	public LinkedList<Locataire> colocataires() throws SQLException {
		LinkedList<Locataire> colocataires = new LinkedList<>();
		
		String req = "Select l.* "
				+ "from S3_Locataire l, S3_Location lo "
				+ "where l.ancien_locataire = 'NON' "
				+ "and lo.adresse = ? "
				+ "and lo.ville = ? "
				+ "and lo.cp = ? "
				+ "and lo.numero = ? "
				+ "and l.id_locataire != ?";
		PreparedStatement st = this.connexion.prepareStatement(req);
		Location location = this.LocationLocataire();
		
		st.setString(1, location.getAdresse());
		st.setString(2, location.getVille());
		st.setInt(3, location.getCp());
		st.setInt(4, location.getNumero());
		st.setInt(5, this.idLocataire);
		
		ResultSet res = st.executeQuery();
		if(res.getFetchSize() == 0) {
			System.out.println("Le locataire n'a pas de colocataire");
			return null;
		}
		
		while(res.next()) {
			int idLocataire = res.getInt("ID_LOCATAIRE");
			String nom = res.getString("NOM");
			String prenom = res.getString("PRENOM");
			int tel = res.getInt("TEL");
			String email = res.getString("EMAIL");
			Date dateNaissance = res.getDate("DATE_NAISSANCE");
			float depotGarantie = res.getFloat("DEPOT_GARANTIE");
			String ancienLocataire = res.getString("ANCIEN_LOCATAIRE");
			float partPossession = res.getFloat("PART_POSSESSION");
			Locataire locataire = new Locataire(idLocataire, nom, prenom, tel, email, dateNaissance, depotGarantie, ancienLocataire, partPossession);
			colocataires.add(locataire);
		}
		return colocataires;
				
	}
	
	//Retourne la table Location du locataire
	public Location LocationLocataire() throws SQLException {
		String req="Select l.* "
				+ "from S3_Locataire loc, S3_louer louer, S3_Location l "
				+ "WHERE loc.id_locataire = ? "
				+ "and louer.id_locataire = loc.id_locataire "
				+ "and l.id_location = louer.id_location ";
		PreparedStatement st = this.connexion.prepareStatement(req);
		st.setInt(1, this.idLocataire);
		ResultSet res = st.executeQuery();
		if(res.getFetchSize() == 0) {
			System.out.println("Le locataire n'a pas de location");
			return null;
		}
		Location location = null;
		while(res.next()) {
			int idLocation = res.getInt("ID_LOCATION");
			String taxe_fonciere = res.getString("taxe_fonciere");
			int duree = res.getInt("DUREE");
			Date dateDebContrat = res.getDate("date_debut_contrat");
			String adresse = res.getString("adresse");
			String ville = res.getString("ville");
			int cp = res.getInt("cp");
			int numero = res.getInt("numero");
			location = new Location(idLocation, taxe_fonciere, duree, dateDebContrat, adresse, ville, cp, numero);
		}
		return location;
	}
	
	//insert les données du joueur dans la table Locataire sur la bd 
	public void insert() throws SQLException {
		String req = "insert into S3_Locataire "
				+ "values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = this.connexion.prepareStatement(req);
		
		st.setInt(1, this.getIdLocataire());
		st.setString(2, this.getNom());
		st.setString(3, this.getPrenom());
		st.setInt(4, this.getTel());
		st.setString(5, this.getEmail());
		st.setDate(6, this.getDateNaissance());
		st.setFloat(7, this.getDepotGarantie());
		st.setString(8, this.getAncienLocataire());
		st.setFloat(9, this.getPartPossession());
		st.executeUpdate();
	}
	
	//Update la table Locataire sur la bd 
	public void update() throws SQLException {
		String req = "Update S3_Locataire "
				+ "set id_locataire = ?, nom = ?, prenom = ?, tel = ?, email = ?, Date_naissance = ?, depot_garantie = ?, ancien_locataire = ?, part_possession = ?) "
				+ "where id_locataire = ?";
		PreparedStatement st = this.connexion.prepareStatement(req);
		
		st.setInt(1, this.getIdLocataire());
		st.setString(2, this.getNom());
		st.setString(3, this.getPrenom());
		st.setInt(4, this.getTel());
		st.setString(5, this.getEmail());
		st.setDate(6, this.getDateNaissance());
		st.setFloat(7, this.getDepotGarantie());
		st.setString(8, this.getAncienLocataire());
		st.setFloat(9, this.getPartPossession());
		st.setInt(10, this.getIdLocataire());
		st.executeUpdate();
	}
	
	
	public LinkedList<Garant> garants() throws SQLException {
	    LinkedList<Garant> garants = new LinkedList<Garant>();
	    String req = "Select * "
	            + "from S3_GARANT g, S3_LOCATAIRE l, S3_ASSOCIER a "
	            + "where l.id_locataire = ? "
	            + "and l.id_locataire = a.id_locataire "
	            + "and a.id_Garant = g.id_Garant";
	    PreparedStatement st = this.connexion.prepareStatement(req);
	    st.setInt(1, this.getIdLocataire());
	    ResultSet res = st.executeQuery();
	    
	    if(res.getFetchSize() == 0) {
			System.out.println("Le locataire n'a pas de garant.");
			return null;
		}
	    while(res.next()) {
	        int idGarant = res.getInt("id_garant");
	        String nom = res.getString("nom");
	        String prenom = res.getString("prenom");
	        String adresse = res.getString("adresse");
	        String ville = res.getString("ville");
	        int cp = res.getInt("cp");
	        int tel = res.getInt("tel");
	        String email = res.getString("email");

	        Garant garant = new Garant(idGarant, nom, prenom, adresse, ville, cp, tel, email);
	        garants.add(garant);
	    }
	    return garants;
	}


	public int getIdLocataire() {
		return idLocataire;
	}

	private void setIdLocataire(int idLocataire) {
		this.idLocataire = idLocataire;
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

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public float getDepotGarantie() {
		return depotGarantie;
	}

	public void setDepotGarantie(float depotGarantie) {
		this.depotGarantie = depotGarantie;
	}

	public String getAncienLocataire() {
		return ancienLocataire;
	}

	public void setAncienLocataire(String ancienLocataire) {
		this.ancienLocataire = ancienLocataire;
	}

	public float getPartPossession() {
		return partPossession;
	}

	public void setPartPossession(float partPossession) {
		this.partPossession = partPossession;
	}

	public Connection getConnexion() {
		return connexion;
	}

	public void setConnexion(Connection connexion) {
		this.connexion = connexion;
	}	
}
