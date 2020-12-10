package egovframework.example.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EgovUserController {

	// 회원 등록
	@RequestMapping(value = "/signUp.do")
	public String SignUp(){
		return "";
	}
	
	// 로그인
	@RequestMapping(value = "/signIn.do")
	public String SignIn(){
		return "";
	}
	
}
