package thymeleafHtmlCssJs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	
	@GetMapping("/hi")
	public String hello(Model m) {
		
		m.addAttribute("message","Hello World");
		return "helloworld";
	}
	@GetMapping("/style")
	public String style() {
		
		return "css-js";
	}
}
