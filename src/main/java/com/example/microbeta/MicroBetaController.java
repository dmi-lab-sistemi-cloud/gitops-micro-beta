package com.example.microbeta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroBetaController {
	@GetMapping("/")
	public String hello() {
		return "<h1>Hello from MicroBeta!!</h1>\n";
	}
}
