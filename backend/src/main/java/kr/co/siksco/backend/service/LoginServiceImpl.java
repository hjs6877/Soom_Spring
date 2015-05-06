package kr.co.siksco.backend.service;

import java.util.Map;

import kr.co.siksco.backend.controller.LoginController;
import kr.co.siksco.backend.dao.LoginDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServiceImpl implements LoginService {
	public static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Autowired
	private LoginDao loginDao;
	
	@Autowired 
	private ShaPasswordEncoder passwordEncoder;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public int signup(Map<String, String> signupInfo){
		String userPass = signupInfo.get("userPass");
		signupInfo.put("userPass", passwordEncoder.encodePassword(userPass, null));
		
		return loginDao.signup(signupInfo);
	}
}
