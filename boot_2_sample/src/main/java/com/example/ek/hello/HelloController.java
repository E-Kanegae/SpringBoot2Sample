package com.example.ek.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Hello World Controller
 * @author E-Kanegae
 *
 */
@Controller
public class HelloController {
	
	/**
	 * default request mapping method.<br>
	 * return hello/hello.html
	 * @return fixed character
	 */
	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("hello", "Welocome to Spring Boot 2.0 Application.");
		return "hello/hello";
	}
	
	/**
	 * if request is "/number", return {@link DataObj} depending on argument number.
	 * @param num
	 * @return{@link DataObj}
	 */
	@RequestMapping("/{num}")
	public HelloObject index(@PathVariable Integer num) {
		return new HelloObject(num);
	}

}
