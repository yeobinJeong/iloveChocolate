package com.IgibuU.model.service;

import java.util.List;
import com.IgibuU.model.dto.Member;

public interface MemberService {

	public void insert(Member member);
	
	public List<Member> getAllMembers();
	
	public Member getMemberById(String id);
	
	public Member getMemberByIdAndPasswd(String id, String passwd);
	
	public void updateMember(Member member);
	
	/*public void deleteMember(String id);*/
		
}