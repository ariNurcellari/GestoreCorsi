package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() throws SQLException {
		String jdbcl = "jdbc:mysql://localhost/iscritticorsi?user=root&password=Gestionale1992";
		return DriverManager.getConnection(jdbcl) ;
	
	}
}
