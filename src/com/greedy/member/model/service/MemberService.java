package com.greedy.member.model.service;

import static com.greedy.common.Template.getSqlSession;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.greedy.member.model.dto.MemberDTO;
import com.greedy.membermapper.MemberMapper;

public class MemberService {

	public boolean creatNewMember(MemberDTO member) {

		SqlSession sqlSession = getSqlSession();

		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

		int result = memberMapper.insertNewMember(member);

		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return result > 0? true: false;
	}

	public List<MemberDTO> findAllMember() {

		SqlSession sqlSession = getSqlSession();

		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

		List<MemberDTO> memberList = memberMapper.selectMemberList();

		sqlSession.close();

		return memberList;
	}

	public MemberDTO findIdMember(String id) {

		SqlSession sqlSession = getSqlSession();

		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

		MemberDTO memberId = memberMapper.selectByid(id);

		sqlSession.close();

		return memberId;
	}

	public List<MemberDTO> findGenderMember(String gender) {

		SqlSession sqlSession = getSqlSession();

		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		List<MemberDTO> memberGender = memberMapper.selectByGender(gender);

		sqlSession.close();

		return memberGender;
	}

	public boolean updatePwdMember(MemberDTO member) {

		SqlSession sqlSession = getSqlSession();

		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

		int result = memberMapper.updatePwdMember(member);

		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return false;

	}

	public boolean updateEmailMember(MemberDTO member) {

		SqlSession sqlSession = getSqlSession();

		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

		int result = memberMapper.updateEmailMember(member);

		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return result > 0? true: false;
	}

	public boolean updatePhoneMember(MemberDTO member) {

		SqlSession sqlSession = getSqlSession();

		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

		int result = memberMapper.updatePhoneMember(member);

		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return result > 0? true: false;
	}

	public boolean updateAddressMember(MemberDTO member) {

		SqlSession sqlSession = getSqlSession();

		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

		int result = memberMapper.updateAddressMember(member);

		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return result > 0? true: false;
	}

	public boolean deleteIdMember(String memberId) {

		SqlSession sqlSession = getSqlSession();

		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);


		int result = memberMapper.deleteIdMember(memberId);

		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}

		sqlSession.close();

		return result > 0? true: false;
	}

}