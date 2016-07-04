package com.IgibuU.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.IgibuU.model.dao.MemberDao;
import com.IgibuU.model.dto.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	@Qualifier("oracleMemberDao")
	private MemberDao memberDao;

	@Override
	public void insert(Member member) {
		memberDao.insert(member);
	}

	@Override
	public List<Member> getAllMembers() {		
		return memberDao.getAllMembers();
	}

	@Override
	public Member getMemberById(String id) {
		Member m = memberDao.getMemberById(id);
		
		return m;
	}

	@Override
	public Member getMemberByIdAndPasswd(String id, String passwd) {
		Member m = memberDao.getMemberByIdAndPasswd(id, passwd);
		
		return m;
	}

	@Override
	public void updateMember(Member member) {
		memberDao.updateMember(member);		
	}

	/*@Override
	public void deleteMember(String id) {
		memberDao.deleteMember(id);		
	}	*/

}
