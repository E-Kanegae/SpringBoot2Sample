package com.example.ek.login;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * OAuth2ログインに関する設定クラス<br>
 * 
 * @author E-Kanegae
 *
 */
@Configuration
@EnableWebSecurity
public class OAuth2LoginSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
			.antMatchers("/webjars/**").permitAll() // ログインページのcss用
			.anyRequest()
			  .authenticated()
			.and()
			.oauth2Login()
			  .loginPage("/login/oauth2").permitAll();
			;
	}
}
