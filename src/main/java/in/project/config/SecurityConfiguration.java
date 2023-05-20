package in.project.config;


import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.ResourceHandlerRegistrationCustomizer;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import in.project.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebMvcAutoConfigurationAdapter {

	public SecurityConfiguration(WebProperties webProperties, WebMvcProperties mvcProperties,
			ListableBeanFactory beanFactory, ObjectProvider<HttpMessageConverters> messageConvertersProvider,
			ObjectProvider<ResourceHandlerRegistrationCustomizer> resourceHandlerRegistrationCustomizerProvider,
			ObjectProvider<DispatcherServletPath> dispatcherServletPath,
			ObjectProvider<ServletRegistrationBean<?>> servletRegistrations) {
		super(webProperties, mvcProperties, beanFactory, messageConvertersProvider,
				resourceHandlerRegistrationCustomizerProvider, dispatcherServletPath, servletRegistrations);
		// TODO Auto-generated constructor stub
	}

//	@Autowired
//	private UserService userService;
//	
//	@Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//	
//	@Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
//        auth.setUserDetailsService(userService);
//        auth.setPasswordEncoder(passwordEncoder());
//        return auth;
//    }
	
	
	
	
}