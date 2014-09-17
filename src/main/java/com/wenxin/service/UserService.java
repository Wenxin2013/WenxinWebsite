package com.wenxin.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Servlet implementation class UserService
 */
public class UserService implements UserDetailsService {

	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		
		return null;
	}


}
