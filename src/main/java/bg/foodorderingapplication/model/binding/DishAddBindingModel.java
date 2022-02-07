package bg.foodorderingapplication.model.binding;

import bg.foodorderingapplication.model.entity.RestaurantEntity;

public class DishAddBindingModel {

    private String name;
    private String description;
    private String url;
    private String restaurantName;

    public DishAddBindingModel() {
    }

    public String getName() {
        return name;
    }

    public DishAddBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DishAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DishAddBindingModel setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public DishAddBindingModel setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
        return this;
    }
}
