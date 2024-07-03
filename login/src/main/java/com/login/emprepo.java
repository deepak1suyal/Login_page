package com.login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface emprepo extends JpaRepository<empentity, Integer> {
    
}
