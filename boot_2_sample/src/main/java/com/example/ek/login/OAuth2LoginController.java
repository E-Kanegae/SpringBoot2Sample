package com.example.ek.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * OAuth 2.0 のログイン関連処理用Controllerクラス<br>
 * @author E-Kanegae
 *
 */
@Controller
public class OAuth2LoginController {
	
	/**
	 * ログインページへの画面遷移
	 * @return login/login.html
	 */
	@GetMapping("/login/oauth2")
	public String login(Model model) {
		model.addAttribute("login", "Spring Boot 2.0 Sample App. Welcome to Login Page.");
		return "login/login";
	}

}
