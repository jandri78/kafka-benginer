package hello;

import java.io.IOException;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping("/request")
	public String request(HttpServletRequest request) throws IOException {

		Enumeration<String> a = request.getHeaderNames();

		String l = request.getRemoteHost();

		return l;

	}
	
	
	@PostMapping("/test")
	public ResponseEntity<SignupApiDTO> Testing(@RequestBody SignupApiDTO organization) {
		
		SignupApiDTO a = organization;
		
		
		return new ResponseEntity<SignupApiDTO>(a,HttpStatus.CREATED);
	}
}
