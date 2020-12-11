package egovframework.example.sample.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.EgovUserService;
import egovframework.example.sample.service.EgovUserVO;

@Controller
public class EgovUserController {
	
	@Resource
	private EgovUserService userService;

	// 회원 등록
	@RequestMapping(value = "/signUp.do")
	public String SignUp(@ModelAttribute("userVO") EgovUserVO userVO,
			HttpServletRequest request) throws Exception{
		
		userService.userInsert(userVO);
		
		return "/home";
	}
	
	// 로그인
	@RequestMapping(value = "/signIn.do")
	public String SignIn(){
		return "";
	}
	
}
