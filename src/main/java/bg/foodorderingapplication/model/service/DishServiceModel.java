package bg.foodorderingapplication.model.service;

public class DishServiceModel {

    private String name;
    private String description;
    private String url;
    private String restaurantName;

    public DishServiceModel() {
    }

    public String getName() {
        return name;
    }

    public DishServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DishServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DishServiceModel setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public DishServiceModel setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
        return this;
    }
}
