package com.amandarangel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amandarangel.entities.Order;
import com.amandarangel.entities.OrderItem;
import com.amandarangel.entities.User;
import com.amandarangel.entities.pk.OrderItemPK;

//os repositorios serão interfaces
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
