package kr.co.siksco.backend.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private SqlSession session;
	
	public int signup(Map<String, String> signupInfo) throws DataAccessException {
		int result = session.insert("user.signup", signupInfo);
		
		return result;
	}
}
