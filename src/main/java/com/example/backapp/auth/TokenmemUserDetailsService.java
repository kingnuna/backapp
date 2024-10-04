package com.example.backapp.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.backapp.member.Member;
import com.example.backapp.member.MemberDao;

@Service // 인증 객체의 username으로 db에서 검색하여 유효한지 확인해주는 기능 제공
public class TokenmemUserDetailsService implements UserDetailsService {

	@Autowired
	private MemberDao dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Member m = dao.findById(username)
				.orElseThrow(() -> new UsernameNotFoundException("not found id:" + username));
		return new TokenUserDetails(m);
	}

}
