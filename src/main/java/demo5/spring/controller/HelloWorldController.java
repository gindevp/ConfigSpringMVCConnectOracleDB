package demo5.spring.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import demo5.spring.model.HelloWorld;

@Controller
public class HelloWorldController {
	@GetMapping("/helloworld")
	public String handle(Model model) {
		HelloWorld helloWorld= new HelloWorld();
		helloWorld.setMessage("Hello spring 5");
		helloWorld.setDatetime(LocalDateTime.now().toString());
		model.addAttribute("helloWorld",helloWorld);
		return "helloworld";
	}
}
