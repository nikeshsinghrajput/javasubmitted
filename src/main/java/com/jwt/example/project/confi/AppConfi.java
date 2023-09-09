package com.jwt.example.project.confi;

 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfi {
	@Bean
public UserDetailsService userDetailsService()
{
UserDetails user1=User.builder().username("nikesh")
.password(passwordEncoder().encode("12345")).roles("ADMIN1").build();
UserDetails user2=User.builder().username("shruti")
.password(passwordEncoder().encode("12345")).roles("ADMIN2").build();

return new InMemoryUserDetailsManager(user1,user2);
}
	 @Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}
