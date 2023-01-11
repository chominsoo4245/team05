package com.shop.cart;

import com.shop.service.ReviewService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DeleteTests {
    @Autowired
    ReviewService service;
    @Test
    void contentLoads(){
        try {
            service.remove(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
