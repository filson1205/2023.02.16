package com.greedy.membermapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.greedy.member.model.dto.MemberDTO;

public interface MemberMapper {

	int insertNewMember(MemberDTO member); 
	
	List<MemberDTO> selectMemberList();
	
	MemberDTO selectByid(String id);

	List<MemberDTO> selectByGender(String gender);

	int updatePwdMember(MemberDTO member);

	int updateEmailMember(MemberDTO member);

	int updatePhoneMember(MemberDTO member);

	int updateAddressMember(MemberDTO member);

	int deleteIdMember(String memberId);

	



}
