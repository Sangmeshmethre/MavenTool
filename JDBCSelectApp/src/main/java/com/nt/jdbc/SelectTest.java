package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	
	private static final String SELECT_MAX_SAL="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE SAL=(SELECT max(SAL) FROM EMP)";
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","tiger");
			
			if(con != null)
				st = con.createStatement();
			if(st != null)
				rs = st.executeQuery(SELECT_MAX_SAL);
			if(rs != null) {
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
				}
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(ClassNotFoundException cfe) {
			cfe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)
					rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(st != null)
					st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(con !=null)
					con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
