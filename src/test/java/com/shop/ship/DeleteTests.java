package com.shop.ship;

import com.shop.service.ShipService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DeleteTests {
    @Autowired
    ShipService service;
    @Test
    void contentLoads(){
        try {
            service.remove(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
