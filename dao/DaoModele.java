package dao;

import java.sql.Connection;
import java.sql.SQLException;

import JDBC.CictOracleDataSource;

public class DaoModele {
	private Connection connexion;
	public DaoModele() throws SQLException {
		CictOracleDataSource.creerAcces("BNL4208A", "$iutinfo");
		this.connexion = CictOracleDataSource.getConnexion();
	}
	public Connection getConnexion() {
		return connexion;
	}
}
