package bg.foodorderingapplication.model.view;

import bg.foodorderingapplication.model.entity.DishEntity;

import java.util.List;

public class RestaurantViewModel {

    private Long id;
    private String name;
    private String description;
    private String url;
    private String address;
    private List<DishEntity> dishes;

    public RestaurantViewModel() {
    }

    public String getName() {
        return name;
    }

    public RestaurantViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RestaurantViewModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public RestaurantViewModel setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public RestaurantViewModel setAddress(String address) {
        this.address = address;
        return this;
    }

    public List<DishEntity> getDishes() {
        return dishes;
    }

    public RestaurantViewModel setDishes(List<DishEntity> dishes) {
        this.dishes = dishes;
        return this;
    }

    public Long getId() {
        return id;
    }

    public RestaurantViewModel setId(Long id) {
        this.id = id;
        return this;
    }
}
