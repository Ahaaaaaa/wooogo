package com.wooogo.pay.controller;

import com.wooogo.pay.dao.OrderRepository;
import com.wooogo.pay.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RestController
public class OrderController {

    // 注入JPA接口
   @Autowired
   private OrderRepository orderRepository=null;


   @PostMapping(path = "/createorder")
   @ResponseStatus(HttpStatus.CREATED)
   public ResponseEntity<String> createOrder(@RequestBody Order order){
       orderRepository.save(order);
       return ResponseEntity.status(HttpStatus.CREATED)
               .body("success");
   }


   @GetMapping(path="/queryorder")
    public @ResponseBody Iterable<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
