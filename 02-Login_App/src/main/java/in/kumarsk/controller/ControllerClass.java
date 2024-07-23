package in.kumarsk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControllerClass {
	
	private Logger logger=LoggerFactory.getLogger(ControllerClass.class);
		
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		logger.warn("Warning To You All Massage");
		logger.debug("My debug Massage printing");
		logger.info("getWelcome() method Started.....");
		String msg="Welcome To My House";
		logger.info("getWelcome() method Ended...");
		return msg;
		
	}
	@GetMapping("/read")
	public String getReadMsg() {
		logger.info("getRead() method Started...");
		String msg="Good Night";
		logger.warn("Warning To Massageg read Component");
		logger.info("getRead() method Ended.....");
		return msg;
	}

}
