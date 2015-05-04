package kr.co.siksco.backend.service;

import java.sql.SQLException;

import kr.co.siksco.backend.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public String getUser() throws SQLException {
		return userDao.selectUser();
	}
}
