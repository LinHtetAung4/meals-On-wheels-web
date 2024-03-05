package com.educlaas.sociallogin.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.educlaas.sociallogin.dao.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
	Optional<Users> findByEmail(String email);
	
	 //Check or Find existing mail - return true or false
    //For Register (duplicate mail)
    Boolean existsByEmail(String email);
    
    @Query(nativeQuery =true,value ="select * from users" + "where users.user_name like %userName")
    List<Users> searchByUserName(@Param("userName")String userName);
}
