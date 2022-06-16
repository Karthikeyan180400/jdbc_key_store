package com.ty.kestore.services;

import static com.ty.keystore.util.AppConstants.SECRET_KEY;


import com.ty.keystore.util.AES;

public class VisitorServices {
	KeysotreDao keysotreDao = new KeysotreDao();
	
	public int saveVisitor(KeysotreDto keysotreDto) {
		String name = AES.encrypt(keysotreDto.getName(), SECRET_KEY);
		String email = AES.encrypt(keysotreDto.getEmail(), SECRET_KEY);
		String phone  = AES.encrypt(keysotreDto.getPhone(), SECRET_KEY);
		
		keysotreDto.setName(name);
		keysotreDto.setEmail(email);
		keysotreDto.setPhone(phone);
		
		return keysotreDao.saveVisitor(keysotreDto);
		
	}
	
	public VisitorDto getVisitorById(int id) {
		VisitorDto visitorDto = visitorDao.
		return null;
		
		
	}

}
