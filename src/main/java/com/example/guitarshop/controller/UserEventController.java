package com.example.guitarshop.controller;

import com.example.guitarshop.model.UserEvent;
import com.example.guitarshop.service.UserEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
public class UserEventController {

    @Autowired
    private UserEventService userEventService;

    @PostMapping("/log")
    public UserEvent logEvent(@RequestBody UserEvent event) {
        return userEventService.logEvent(event);
    }

    @PostMapping("/page-view")
    public UserEvent logPageView(@RequestParam String userId, @RequestParam String pageId) {
        return userEventService.logPageView(userId, pageId);
    }

    @PostMapping("/product-view")
    public UserEvent logProductView(@RequestParam String userId, @RequestParam String productId) {
        return userEventService.logProductView(userId, productId);
    }
}
