package bg.foodorderingapplication.service;

import bg.foodorderingapplication.model.entity.DishEntity;
import bg.foodorderingapplication.model.entity.RestaurantEntity;
import bg.foodorderingapplication.model.service.RestaurantServiceModel;
import bg.foodorderingapplication.model.view.RestaurantViewModel;
import bg.foodorderingapplication.model.view.RestaurantNameViewModel;

import java.util.List;
import java.util.Set;

public interface RestaurantService {
    void addRestaurant(RestaurantServiceModel restaurantServiceModel);

    List<RestaurantNameViewModel> getAllRestaurantsName();

    RestaurantEntity getRestaurantByName(String restaurantName);

    Set<DishEntity> getAllDishesByName(String restaurantName);

    List<RestaurantViewModel> getAll();

    void deleteRestaurantById(Long id);

    void initRestaurants();
}
