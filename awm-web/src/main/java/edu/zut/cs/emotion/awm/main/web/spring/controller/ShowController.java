package edu.zut.cs.emotion.awm.main.web.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/show")
public class ShowController {
    
	@RequestMapping("/index")
    public String index() {
    	
        return "show/index";
    }
	
}
