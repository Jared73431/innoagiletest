package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class democontroller {
	Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("message", "message2222");
		return "hello";
		
	}
	
	@GetMapping(value = "/sample/testlog")
	@ResponseBody
	public String helloString() {
		System.out.println("=> Hello Log4jDemo...");
		logger.trace("trace level");
		logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.info("统计异常池数量异常,异常信息如下:e.getStackTrace().toString()");
		return "Hello Spring Boot";
	}
}
