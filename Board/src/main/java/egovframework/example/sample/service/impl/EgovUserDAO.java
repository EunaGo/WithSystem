package egovframework.example.sample.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.example.cmm.service.impl.EgovComAbstractDAO;
import egovframework.example.sample.service.EgovUserVO;

@Repository("userDAO")
public class EgovUserDAO extends EgovComAbstractDAO{

	// 회원 등록
	public String userInsert(EgovUserVO vo) throws Exception{
		return (String)insert("userDAO.userInsert", vo);
	}
}
