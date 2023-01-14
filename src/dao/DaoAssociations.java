package dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import modele.Association;

public class DaoAssociations extends DaoModele implements Dao<Association> {

	public DaoAssociations() throws SQLException {
		super();
	}

	@Override
	public Association findById(String... id) throws SQLException {
		return null;
	}

	@Override
	public void create(Association donnee) throws SQLException {
		
	}

	@Override
	public void update(Association donnee) throws SQLException {
		
	}

	@Override
	public void delete(Association donnee) throws SQLException {
		
	}

	@Override
	public List<Association> findAll() throws SQLException {
		List<Association> associations = new LinkedList<>();
		Statement st = this.getConnexion().createStatement();
		ResultSet res = st.executeQuery("Select * from S3_ASSOCIATIONS");
		
		if(res.getFetchSize() == 0) {
			System.out.println("Le locataire n'a pas de garant.");
			return null;
		}
		while(res.next()) {
			int siren = res.getInt("SIREN");
			String libelle = res.getString("LIBELLE");
			Date dateDonnation = res.getDate("DATE_DONNATIONS");
			float montantDonnation = res.getFloat("MONTANT_DONNATION");
			associations.add(new Association(siren, libelle, dateDonnation, montantDonnation));
		}		
		return associations;
	}
	
}
