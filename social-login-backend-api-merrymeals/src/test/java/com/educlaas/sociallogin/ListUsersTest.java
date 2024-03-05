package com.educlaas.sociallogin;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.educlaas.sociallogin.dao.Users;
import com.educlaas.sociallogin.repository.UsersRepository;


@SpringBootTest
class ListUsersTest {
	@Autowired
	UsersRepository userRepo;

	@Test
	void userListTest() {
		String userName="123";
		List<Users> userList=userRepo.searchByUserName(userName);
		assertFalse(userList.isEmpty());
		
	}

}
