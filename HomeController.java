package com.teressas.hoppersreceipt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("/hello")
    public String hello() {
		return "Hello World!";
    }

	@GetMapping("/world")
	public String world() {
		return "world";
	}
}
