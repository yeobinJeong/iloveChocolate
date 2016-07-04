package com.IgibuU.model.mapper;

import java.util.HashMap;
import java.util.List;

import com.IgibuU.model.dto.Member;


public interface MemberMapper {
	
	void insertMember(Member member);
	public List<Member> selectAllMembers();
	Member selectMemberById(String memberId);
	Member selectMemberByIdAndPasswd(HashMap<String, Object> params);
	void updateMember(Member member);
	/*void deleteMember(String id);	*/
}
