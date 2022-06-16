package com.ty.keystore.controller;

import java.util.ArrayList;

import com.ty.keystore.dao.UserDao;
import com.ty.keystore.dto.UserDto;

public class UserSaveController {

	public static void main(String[] args) {
		ArrayList<UserDto> list = new ArrayList<UserDto>();
		UserDto dto1 = new UserDto();
		dto1.setUid(1);
		dto1.setUserName("Karthi1804");
		dto1.setEmail("karthi@mail.com");
		dto1.setPassword("121212");
		
		list.add(dto1);
		
		UserDto dto2 = new UserDto();
		dto2.setUid(2);
		dto2.setUserName("Peter123");
		dto2.setEmail("peter@mail.com");
		dto2.setPassword("131313");
		
		list.add(dto2);
		
		UserDto dto3 = new UserDto();
		dto3.setUid(3);
		dto3.setUserName("Nishanth");
		dto3.setEmail("nishu@mail.com");
		dto3.setPassword("141414");
         
		list.add(dto3);
		
		UserDao userDao = new UserDao();
		int[] res = userDao.saveUser(list);
		
		if(res != null)System.out.println("Data Inserted");
		else System.out.println("Not Inserted");
		
	}

}
