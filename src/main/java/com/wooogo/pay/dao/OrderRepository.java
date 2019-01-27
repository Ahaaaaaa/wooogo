package com.wooogo.pay.dao;
import com.wooogo.pay.pojo.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}