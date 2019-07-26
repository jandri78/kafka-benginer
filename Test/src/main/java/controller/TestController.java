package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TestController")
public class TestController {

	@GetMapping
	public void httprequest(HttpServletRequest request){
		
		HttpServletRequest a = request;
	}
}
