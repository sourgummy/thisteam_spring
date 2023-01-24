package com.thisteam.dangdangeat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thisteam.dangdangeat.mapper.MemberMapper;
import com.thisteam.dangdangeat.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper mapper;
	
	// 로그인, 패스워드 확인
	public String getPass(String member_id) {
//		System.out.println("Service : " + member_id);
		return mapper.selectPass(member_id);
	}

	// 회원 정보 조회
	public MemberVO getMemberInfo(String id) {
		return mapper.selectMemberInfo(id);
	}
	
	

}















