package com.demojdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {

	public static void main(String[] args) {

		String username = "postgres";
		String password = "vaishnavi*5";
		String url = "jdbc:postgresql://localhost:5432/postgres";

		Connection con = null;// the

		try {

			System.out.println("loading driver connecting....");
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection( url,username, password);
			System.out.println("connected...");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}