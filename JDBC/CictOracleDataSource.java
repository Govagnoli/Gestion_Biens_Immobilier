package JDBC;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class CictOracleDataSource extends OracleDataSource{
	private static final long serialVersionUID = 1L;
	private static Connection connexion = null;
	private static CictOracleDataSource cOD = null;
	private static boolean statut = false;
	
	private CictOracleDataSource(String login, String mdp) throws SQLException {
		this.setURL("jdbc:oracle:thin:@telline.univ-tlse3.fr:1521:etupre");
		this.setUser(login);
		this.setPassword(mdp);
	}
		
	public static void creerAcces(String login, String mdp) throws SQLException {
		CictOracleDataSource.cOD = new CictOracleDataSource(login, mdp);
		CictOracleDataSource.connexion = CictOracleDataSource.cOD.getConnection();
		CictOracleDataSource.statut = true;
	}
	
	public void Deconnecter() throws SQLException {
		try {
			CictOracleDataSource.connexion.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		CictOracleDataSource.cOD = null;
		CictOracleDataSource.connexion = null;
		CictOracleDataSource.statut = false;
	}
	
	public static boolean estConnexionReussi() { 
		return CictOracleDataSource.statut;
	}
	
	public static Connection getConnexion() {
		return connexion;
	}
}
