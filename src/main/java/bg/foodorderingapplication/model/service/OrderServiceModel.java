package bg.foodorderingapplication.model.service;

import bg.foodorderingapplication.model.enums.OrderStatusEnum;

public class OrderServiceModel {

    private String restaurantName;
    private String userFirstName;
    private OrderStatusEnum status;

    public OrderServiceModel() {
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public OrderServiceModel setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
        return this;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public OrderServiceModel setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
        return this;
    }

    public OrderStatusEnum getStatus() {
        return status;
    }

    public OrderServiceModel setStatus(OrderStatusEnum status) {
        this.status = status;
        return this;
    }
}
