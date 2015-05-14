package kr.co.siksco.backend.controller;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import kr.co.siksco.backend.constant.ConstantManager;
import kr.co.siksco.backend.controller.LoginController;
import kr.co.siksco.backend.service.LoginServiceImpl;
import kr.co.siksco.backend.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private LoginServiceImpl loginService;
	
	@RequestMapping(value="/signin", method=RequestMethod.POST)
	public String login(@RequestParam("userEmail")String userEmail, @RequestParam("userPass")String userPass, Map<String, Object> model){
		
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
	
	@RequestMapping(value="signup", method=RequestMethod.POST)
	public String signup(@RequestParam("userEmail")String userEmail, @RequestParam("userPass")String userPass, Map<String, String> map, ModelMap model){
		
		map.put("userEmail", userEmail);
		map.put("userPass", userPass);
		
		int result = loginService.signup(map);
		String msg = result > 0 ? ConstantManager.MSG_SUCCESS : ConstantManager.MSG_FAILED;
		
		model.addAttribute("userPass", "");
		model.addAttribute("result", msg);
		return "jsonReport";
	}
}
