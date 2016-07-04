package com.IgibuU.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.IgibuU.model.dto.Member;
import com.IgibuU.model.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = { "/member/" })
public class MemeberController {
	
	@Autowired
	@Qualifier("memberService")
	private MemberService memberService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "register.action", method = RequestMethod.POST)
	public void register(Locale locale, Model model, String memberId, String passwd, String gender, String memberType, String name) {
		Member member = new Member();
		
		member.setMemberId(memberId);
		member.setMemberType(memberType);
		member.setPasswd(passwd);
		member.setGender(gender);
		member.setName(name);
		
		
		memberService.insert(member);
		
	}
	
}
