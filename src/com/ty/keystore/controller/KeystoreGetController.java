package com.ty.keystore.controller;

import java.util.Scanner;

import com.ty.keystore.dao.KeystoreDao;
import com.ty.keystore.dao.UserDao;

public class KeystoreGetController {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		UserDao userDao = new UserDao();
		int uid = userDao.validateUser("peter@mail.com", "131313");
		
		if(uid>0) {
		KeystoreDao keystoreDao = new KeystoreDao();
		System.out.println(keystoreDao.getKeystore(uid));
		}
		else System.out.println("No user Found");

	}

}
