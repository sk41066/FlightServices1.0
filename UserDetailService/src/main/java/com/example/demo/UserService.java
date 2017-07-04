package com.example.demo;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

	@Autowired
	private UserRepository userRep;
	@Autowired
	private EntityManager em;

	public boolean saveUserDetail(User user) {

		try {
			userRep.save(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public User getUser(Long userid) {
		return userRep.findOne(userid);
	}

}
