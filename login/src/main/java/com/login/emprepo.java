package com.login;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Repository
public interface emprepo extends JpaRepository<empentity, Integer> {

public ArrayList<empentity>  findByPassAndUser(String pass,String user);

}
