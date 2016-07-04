package com.IgibuU.model.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.IgibuU.model.dto.Member;
import com.IgibuU.model.mapper.MemberMapper;


@Repository(value = "oracleMemberDao")
public class OracleMemberDao implements MemberDao {

	
	
	@Autowired
	@Qualifier("memberMapper")
	private MemberMapper memberMapper;
	
	
	@Override
	public void insert(Member member) {
		memberMapper.insertMember(member);
	}

	@Override
	public List<Member> getAllMembers() {
		return memberMapper.selectAllMembers();
	}

	@Override
	public Member getMemberById(String id) {
		return memberMapper.selectMemberById(id);
	}

	@Override
	public Member getMemberByIdAndPasswd(String id, String passwd) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("memberId", id);
		map.put("passwd", passwd);

		Member member = memberMapper.selectMemberByIdAndPasswd(map);
		return member;
	}

	@Override
	public void updateMember(Member member) {
		memberMapper.updateMember(member);		
	}


	
}

