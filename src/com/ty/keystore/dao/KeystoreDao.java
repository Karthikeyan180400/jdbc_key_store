package com.ty.keystore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.keystore.dto.KeystoreDto;
import com.ty.keystore.util.ConnectionObject;


public class KeystoreDao {
	Connection connection = null;
	public int saveKeystore(KeystoreDto keystoreDto) {
		connection =ConnectionObject.getConnection();
		String query = "insert into key_store value(?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, keystoreDto.getUid());
			preparedStatement.setString(2, keystoreDto.getComments());
			preparedStatement.setString(3, keystoreDto.getDescription());
			preparedStatement.setString(4, keystoreDto.getKey());
			preparedStatement.setString(5, keystoreDto.getValue());
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public List<KeystoreDto> getKeystore(int uid) {
		connection = ConnectionObject.getConnection();
		String query = "select * from key_store where uid = ?";

		connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, uid);
			

			ResultSet resultSet = preparedStatement.executeQuery();
			List<KeystoreDto> list = new ArrayList<KeystoreDto>();
			while (resultSet.next()) {
				KeystoreDto keystoreDto = new KeystoreDto();
				keystoreDto.setUid(resultSet.getInt(1));
				keystoreDto.setComments(resultSet.getString(2));
				keystoreDto.setDescription(resultSet.getString(3));
				keystoreDto.setKey(resultSet.getString(4));
				keystoreDto.setValue(resultSet.getString(5));
			
				list.add(keystoreDto);

			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}


}
