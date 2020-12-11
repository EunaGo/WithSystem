package egovframework.example.sample.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.EgovUserService;
import egovframework.example.sample.service.EgovUserVO;

@Service("userService")
public class EgovUserServiceImpl implements EgovUserService{
	
	@Resource(name = "userDAO")
	private EgovUserDAO userDAO;

	// 회원 등록
	public String userInsert(EgovUserVO vo) throws Exception{
		return userDAO.userInsert(vo);
	};
}
