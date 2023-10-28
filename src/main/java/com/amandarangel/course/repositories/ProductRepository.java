package com.amandarangel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amandarangel.entities.User;

//os repositorios serão interfaces
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
