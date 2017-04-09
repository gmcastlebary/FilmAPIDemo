package main.objectControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateController {
	
	@RequestMapping(value="/rating", method = RequestMethod.POST)
	public void addRating(@RequestParam(required=false, defaultValue="") String rating) { //http://localhost:8080/rating
		
	}
}
