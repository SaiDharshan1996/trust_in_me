package com.regnant.tim.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.regnant.tim.connection.DBConnection;

public class UserCRUDOperations {
	public void AddUser(UserBean u) {
		try {
			Connection connection=DBConnection.getDBconnection();
			PreparedStatement pstmt=null;
			String insert="insert into trsutinme.user_tbl values(?,?,?,?,?,?,?,?)";
			pstmt=connection.prepareStatement(insert);
			pstmt.setString(1,u.getFirstName() );
			pstmt.setString(2, u.getLastName());
			pstmt.setString(3, u.getCity());
			pstmt.setString(4, u.getState());
			pstmt.setString(5, u.getEmail());
			pstmt.setInt(6, u.getMobile());
			pstmt.setInt(7, u.getPincode());
			pstmt.setString(8, u.getPan());
			int rows_count=pstmt.executeUpdate();
			System.out.println(rows_count+" rows inserted");
			
		} catch (SQLException e) {
			System.out.println("Exception in AddUser");
			e.printStackTrace();
		}
	}

}
