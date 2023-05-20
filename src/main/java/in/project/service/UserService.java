package in.project.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import in.project.model.User;
import in.project.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}