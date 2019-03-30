package io.jps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
	@RequestMapping
	public String sayHi() {
		
		return "hello";
		
	}

}
