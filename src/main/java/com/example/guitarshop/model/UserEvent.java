package com.example.guitarshop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_events")
public class UserEvent {

    @Id
    private String id;
    private String userId;
    private String eventName;
    private String details;
    private String pageId; // Идентификатор страницы
    private String productId; // Идентификатор продукта
    private String actionType; // Тип действия (например, "AddToCart", "OrderPlaced", "LeaveReview")

    // Конструкторы, геттеры, сеттеры

    public UserEvent(String userId, String eventName, String details, String pageId, String productId, String actionType) {
        this.userId = userId;
        this.eventName = eventName;
        this.details = details;
        this.pageId = pageId;
        this.productId = productId;
        this.actionType = actionType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
}
