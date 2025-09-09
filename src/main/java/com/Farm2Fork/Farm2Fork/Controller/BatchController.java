package com.Farm2Fork.Farm2Fork.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BatchController {
	
	// Home page
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    //About page 
    @GetMapping("/about")
    public String our_about()
    {
    	return "about";
    }
    
    @GetMapping("/dashboard")
    public String dash()
    {
    	return "workinprogress";
    }
    
    @GetMapping("contact")
    public String ourcontact()
    {
    	return "workinprogress";
    	
    }

}
