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
	
	
}
