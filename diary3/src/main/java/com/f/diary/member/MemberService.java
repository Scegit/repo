package com.f.diary.member;


public interface MemberService {
	//로그인
	public MemberVO getUser(MemberVO vo);
	//회원가입
	public MemberVO joinUser(MemberVO vo);
}
