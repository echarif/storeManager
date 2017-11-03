package storeManager;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String template="Hello, $s!";
	private final AtomicLong counter=new AtomicLong();
	private Logger log = Logger.getLogger(getClass());
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="world") String name){
		return new Greeting(counter.incrementAndGet(), String.format(template,name));
	}

}
