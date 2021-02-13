package com.example.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.object.User;


/*
@Repository
public class UserRepository {

	public User selectUser(int id) {
		User users = new User();

		//
		users.setId(501);
		users.setName("testname");
		users.setPassword("testpassword");

		return users;

    }

}
*/

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}

