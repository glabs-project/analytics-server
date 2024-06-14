package com.example.guitarshop.controller;

import com.example.guitarshop.model.Order;
import com.example.guitarshop.model.UserEvent;
import com.example.guitarshop.service.UserEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private UserEventService userEventService;

    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
        UserEvent orderEvent = new UserEvent(order.getUserId(), "OrderPlaced", "User placed an order", null, null, "OrderPlaced");
        userEventService.logEvent(orderEvent);

        return userEventService.createOrder(order);
    }

}
