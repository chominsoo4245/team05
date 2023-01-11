package com.shop.order;

import com.shop.dto.Order;
import com.shop.service.OrderService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsertTests {
    @Autowired
    OrderService service;

    @DisplayName("Insert")
    @Test
    void contentLoads(){
        Order order = new Order(0, 1, 1, 10000, "카카오페이", null);
        try{
            service.register(order);
            System.out.printf("OK");
        }catch (Exception e){
            e.printStackTrace();
            System.out.printf("Fail");
        }
    }
}
