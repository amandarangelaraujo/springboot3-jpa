package com.amandarangel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amandarangel.entities.Category;
import com.amandarangel.entities.Order;
import com.amandarangel.entities.User;

//os repositorios serão interfaces
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
