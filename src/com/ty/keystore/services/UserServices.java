package com.ty.keystore.services;

import static com.ty.keystore.util.AppConstants.SECRET_KEY;



import com.ty.keystore.dao.UserDao;
import com.ty.keystore.dto.UserDto;
import com.ty.keystore.util.AES;

public class UserServices {
	UserDao userDao = new UserDao();
	
	public int saveVisitor(KeystoreDto keystoreDto) {
		String name = AES.encrypt(keystoreDto.getName(), SECRET_KEY);
		String email = AES.encrypt(keystoreDto.getEmail(), SECRET_KEY);
		String phone  = AES.encrypt(keystoreDto.getPhone(), SECRET_KEY);
		
		keystoreDto.setName(name);
		keystoreDto.setEmail(email);
		keystoreDto.setPhone(phone);
		
		return UserDao.saveVisitor(keystoreDto);
		
	}
	
	public KeystoreDto getVisitorById(int id) {
		keystoreDto visitorDto = visitorDao.
		return null;
		
		
	}

}
