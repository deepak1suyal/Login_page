package com.login;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@Controller
@CrossOrigin
public class controler {
    @Autowired 
    service ser;
    @GetMapping("path")
    public String getMethodName() {
        return "deepak";
    }
    
   @PutMapping("email")
   public void postMethodName(@RequestBody emp entity) {
       //TODO: process POST request
       
       ser.createmp(entity);
   }
    
  
}
