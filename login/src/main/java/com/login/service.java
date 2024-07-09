package com.login;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.text.html.Option;

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


    @Override
    public boolean getemp(emp e) {
        // TODO Auto-generated method stub
        System.out.println("null");
        ArrayList <empentity> qw=repo.findByPassAndUser(e.getPass(),e.getUser());
       if(!qw.isEmpty())
       return true;
       else 
       return false;
    }
}
