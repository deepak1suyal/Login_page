package com.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service implements impservice {

@Autowired
 emprepo repo;


    @Override
    public void createmp(emp e) {
        // TODO Auto-generated method stub
        empentity epmen=new empentity();
         epmen.setId(e.getId()); 
         epmen.setUser(e.getUser());
         epmen.setPass(e.getPass());
         repo.save(epmen);
    }
    
}
