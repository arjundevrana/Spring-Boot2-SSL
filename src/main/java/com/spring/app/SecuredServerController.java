package com.spring.app;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SecuredServerController {
	 @RequestMapping("/")
	    public String secured(){
	        System.out.println("Inside secured()");
	        return "Hello user !!! : " + new Date();
	    }
}
