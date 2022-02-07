package bg.foodorderingapplication.model.binding;

import bg.foodorderingapplication.model.enums.OrderStatusEnum;

public class OrderAddBindingModel {

    private String restaurantName;
    private String userFirstName;
    private OrderStatusEnum status;

    public OrderAddBindingModel() {
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public OrderAddBindingModel setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
        return this;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public OrderAddBindingModel setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
        return this;
    }

    public OrderStatusEnum getStatus() {
        return status;
    }

    public OrderAddBindingModel setStatus(OrderStatusEnum status) {
        this.status = status;
        return this;
    }
}
