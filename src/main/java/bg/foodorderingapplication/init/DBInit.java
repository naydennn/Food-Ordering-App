package bg.foodorderingapplication.init;

import bg.foodorderingapplication.service.DishService;
import bg.foodorderingapplication.service.RestaurantService;
import bg.foodorderingapplication.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInit implements CommandLineRunner {

    private final RestaurantService restaurantService;
    private final DishService dishService;
    private final UserService userService;

    public DBInit(RestaurantService restaurantService, DishService dishService, UserService userService) {
        this.restaurantService = restaurantService;
        this.dishService = dishService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        restaurantService.initRestaurants();
        dishService.initDishes();
        userService.initUsers();
    }
}
