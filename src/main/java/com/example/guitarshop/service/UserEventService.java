package com.example.guitarshop.service;

import com.example.guitarshop.model.Order;
import com.example.guitarshop.model.UserEvent;
import com.example.guitarshop.repository.UserEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserEventService {

    @Autowired
    private UserEventRepository userEventRepository;

    public UserEvent logEvent(UserEvent event) {
        return userEventRepository.save(event);
    }

    public Order createOrder(Order order) {
        return order;
    }

    public UserEvent logPageView(String userId, String pageId) {
        UserEvent pageViewEvent = new UserEvent(userId, "PageView", "User viewed page", pageId, null, "PageView");
        return userEventRepository.save(pageViewEvent);
    }

    public UserEvent logProductView(String userId, String productId) {
        UserEvent productViewEvent = new UserEvent(userId, "ProductView", "User viewed product", null, productId, "ProductView");
        return userEventRepository.save(productViewEvent);
    }
}
