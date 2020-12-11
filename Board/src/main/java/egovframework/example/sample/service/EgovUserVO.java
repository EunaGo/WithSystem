package egovframework.example.sample.service;

import egovframework.example.cmm.ComDefaultVO;

@SuppressWarnings("serial")
public class EgovUserVO extends ComDefaultVO{

	private String userId = "";
	private String userPw = "";
	private String userName = "";
	private String useYn = "";
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	
	
}
