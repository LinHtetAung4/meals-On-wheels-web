package com.educlaas.sociallogin;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.educlaas.sociallogin.dao.Users;
import com.educlaas.sociallogin.repository.UsersRepository;

@SpringBootTest
class UserEmailTestExisting {
	@Autowired
	UsersRepository userRepo;

	@Test
	void userEmailTestCheck() {
		String email="Lin@gmail.com";
		Users users=userRepo.findByEmail(email).get();
		assertNotNull(users);
	}

}
