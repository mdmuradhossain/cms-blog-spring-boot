package io.murad.cms.blog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.murad.cms.blog.model.CustomUserDetails;
import io.murad.cms.blog.model.User;
import io.murad.cms.blog.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optionalsUsers = userRepository.findByUserName(username);
		optionalsUsers.orElseThrow(()-> new UsernameNotFoundException("User Not Found"));
		return optionalsUsers.map(CustomUserDetails::new).get();
	}

}
