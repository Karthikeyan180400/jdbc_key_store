package com.ty.keystore.services;

import static com.ty.keystore.util.AppConstants.SECRET_KEY;


import com.ty.keystore.dao.KeystoreDao;
import com.ty.keystore.dto.KeystoreDto;
import com.ty.keystore.util.AES;

public class KeystoreServices {
	KeystoreDao keystoreDao = new KeystoreDao();
	
	public int saveVisitor(KeystoreDto keystoreDto) {
		String name = AES.encrypt(keystoreDto.getName(), SECRET_KEY);
		String email = AES.encrypt(keystoreDto.getEmail(), SECRET_KEY);
		String phone  = AES.encrypt(keystoreDto.getPhone(), SECRET_KEY);
		
		keystoreDto.setName(name);
		keystoreDto.setEmail(email);
		keystoreDto.setPhone(phone);
		
		return keystoreDao.saveVisitor(keystoreDto);
		
	}
	
	public KeystoreDto getVisitorById(int id) {
		keystoreDto visitorDto = visitorDao.
		return null;
		
		
	}

}
