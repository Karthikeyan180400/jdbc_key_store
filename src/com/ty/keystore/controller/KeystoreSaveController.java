package com.ty.keystore.controller;

import com.ty.keystore.dao.UserDao;
import com.ty.keystore.dto.KeystoreDto;
import com.ty.keystore.dao.KeystoreDao;
import java.util.Scanner;

public class KeystoreSaveController {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		UserDao userDao = new UserDao();
		int uid = userDao.validateUser("peter@mail.com", "131313");
		
		if(uid>0) {
			KeystoreDto keystoreDto = new KeystoreDto();
			
			keystoreDto.setUid(uid);
			System.out.println("Enter your Comments: ");
			keystoreDto.setComments(scn.nextLine());
			System.out.println("Enter your Description: ");
			keystoreDto.setDescription(scn.nextLine());
			System.out.println("Enter your AccountCompanyName: ");
			keystoreDto.setKey(scn.nextLine());
			System.out.println("Enter your passwords: ");
			keystoreDto.setValue(scn.nextLine());
			
			
			KeystoreDao keystoreDao = new KeystoreDao();
			int res = keystoreDao.saveKeystore(keystoreDto);
			if(res!=0)System.out.println("Data inserted");
			else System.out.println("Not Inserted");
		}
		else System.out.println("email or password is incorrect");		
	

	}

}
