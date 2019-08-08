package dj.security.secman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityMainController {

	@GetMapping("seccheck")
	public String secCheck() {
		System.out.println("figure");
		return "secload";
	}
	@GetMapping("/")
	public String jill() {
		return "jill";
	}
	
	@GetMapping("logi")
	public String logi() {
		System.out.println("login");
		return "logi";
	}
	
	@GetMapping("/access-denied")
	public String accessDenied() {
		return "accessDenied";
	}
	
}
