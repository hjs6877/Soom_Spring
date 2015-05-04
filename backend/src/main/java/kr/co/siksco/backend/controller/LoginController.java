package kr.co.siksco.backend.controller;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import kr.co.siksco.backend.controller.LoginController;
import kr.co.siksco.backend.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpServletRequest request, Map<String, Object> model){
		String userEmail = request.getParameter("userEmail");
		String userPass = request.getParameter("userPass");
		
		logger.info("서버쪽 로그인 컨트롤러 호출..");
		logger.info("userEmail: " + userEmail);
		logger.info("userPass: " + userPass);
		
		logger.info("서비스 객체: " + userService);
		try {
			logger.info("Dao 호출 테스트: " + userService.getUser());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
