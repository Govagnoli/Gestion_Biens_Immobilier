package modele;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import JDBC.CictOracleDataSource;

public class RegularisationDesCharges {
	private int idLocation;
	private int idRDC;
	private Date dateEnvoie;
	private Connection connexion;
	
	public RegularisationDesCharges(int idLocation, int idRDC, Date dateEnvoie) throws SQLException {
		CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
		this.connexion = CictOracleDataSource.getConnexion();
		this.idLocation = idLocation;
		this.idRDC = idRDC;
		this.dateEnvoie = dateEnvoie;
	}
	public RegularisationDesCharges(int idLocation, int idRDG) throws SQLException {
		CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
		this.connexion = CictOracleDataSource.getConnexion();
		
		String req = "Select * from S3_REGULARISATION_DES_CHARGES WHERE Id_Location = ? and Id_REGULARISATION_DES_CHARGES = ?";
		PreparedStatement st = this.connexion.prepareStatement(req);
		st.setInt(1, idLocation);
		st.setInt(2, idRDG);
		ResultSet res = st.executeQuery();
		while(res.next()) {
			this.setIdLocation(idLocation);
			this.setIdRDG(idRDG);
			this.setDateEnvoie(res.getDate("DATE_ENVOIE"));
		}
	}
	
	public List<RegularisationDesCharges> rdcDUneLocation() throws SQLException {
		List<RegularisationDesCharges> regularisations = new LinkedList<>();
		String req = "Select * "
				+ "from S3_REGULARISATION_DES_CHARGES rdc "
				+ "where ID_LOCATION = ?";
		PreparedStatement st = this.connexion.prepareStatement(req);
		st.setInt(1, this.idLocation);
		ResultSet res = st.executeQuery();
		if(res.getFetchSize() == 0) {
			System.out.println("Le locataire n'a pas de régularisation des charges");
			return null;
		}
		while(res.next()) {
			int idLocation = res.getInt("ID_LOCATION");
			int idRDG = res.getInt("ID_REGULARISATION_DES_CHARGES");
			Date dateEnvoie = res.getDate("DATE_ENVOIE");
			regularisations.add(new RegularisationDesCharges(idLocation, idRDG, dateEnvoie));
		}
		return regularisations;
	}
	
	public int getIdLocation() {
		return idLocation;
	}
	public void setIdLocation(int idLocation) {
		this.idLocation = idLocation;
	}
	public int getIdRDG() {
		return idRDC;
	}
	public void setIdRDG(int idRDG) {
		this.idRDC = idRDG;
	}
	public Date getDateEnvoie() {
		return dateEnvoie;
	}
	public void setDateEnvoie(Date dateEnvoie) {
		this.dateEnvoie = dateEnvoie;
	}	
}