package com.ty.keystore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ty.keystore.dto.UserDto;
import com.ty.keystore.util.ConnectionObject;

public class UserDao {

	Connection connection = null;
	
	public int[] saveUser(List<UserDto> list) {
		connection = ConnectionObject.getConnection();
		String query = "insert into user values(?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			for(UserDto userDto : list) {
				preparedStatement.setInt(1, userDto.getUid());
				preparedStatement.setString(2, userDto.getUserName());
				preparedStatement.setString(3, userDto.getEmail());
				preparedStatement.setString(4, userDto.getPassword());
				
				preparedStatement.addBatch();
			}
			return preparedStatement.executeBatch();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public int validateUser(String email,String password) {
		connection = ConnectionObject.getConnection();
		String query = "select * from user where email=? and password=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			
			 ResultSet resultSet= preparedStatement.executeQuery();
			 if(resultSet.next()) {
				 return resultSet.getInt(1);
			 }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
}
