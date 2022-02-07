package bg.foodorderingapplication.service.impl;

import bg.foodorderingapplication.model.entity.DishEntity;
import bg.foodorderingapplication.model.entity.RestaurantEntity;
import bg.foodorderingapplication.model.service.DishServiceModel;
import bg.foodorderingapplication.repository.DishRepository;
import bg.foodorderingapplication.service.DishService;
import bg.foodorderingapplication.service.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishServiceImpl implements DishService {

    private final ModelMapper modelMapper;
    private final RestaurantService restaurantService;
    private final DishRepository dishRepository;

    public DishServiceImpl(ModelMapper modelMapper, RestaurantService restaurantService, DishRepository dishRepository) {
        this.modelMapper = modelMapper;
        this.restaurantService = restaurantService;
        this.dishRepository = dishRepository;
    }

    @Override
    public void addDish(DishServiceModel dishServiceModel) {
        DishEntity dishEntity = modelMapper.map(dishServiceModel, DishEntity.class);

        dishEntity.setRestaurant(this.restaurantService.getRestaurantByName(dishServiceModel.getRestaurantName()));

        dishRepository.save(dishEntity);
    }

    @Override
    public void initDishes() {
        if (dishRepository.count() == 0) {

            RestaurantEntity redChicken = restaurantService.getRestaurantByName("Red Chicken");
            RestaurantEntity foodCheff = restaurantService.getRestaurantByName("Food Cheff");
            RestaurantEntity bonAppetit = restaurantService.getRestaurantByName("Bon Appetit");

            DishEntity dish1 = new DishEntity()
                    .setName("fish and potatoes")
                    .setUrl("www.fish.bg")
                    .setDescription("roasted fish")
                    .setRestaurant(redChicken);

            DishEntity dish2 = new DishEntity()
                    .setName("cesar salad")
                    .setUrl("www.salad.bg")
                    .setDescription("salad with chicken")
                    .setRestaurant(redChicken);

            DishEntity dish3 = new DishEntity()
                    .setName("steak")
                    .setUrl("www.steak.bg")
                    .setDescription("best steak")
                    .setRestaurant(foodCheff);

            DishEntity dish4 = new DishEntity()
                    .setName("souffle")
                    .setUrl("www.souffle.bg")
                    .setDescription("chocolate souffle")
                    .setRestaurant(bonAppetit);

            DishEntity dish5 = new DishEntity()
                    .setName("pizza")
                    .setUrl("www.pizza.bg")
                    .setDescription("best italian pizza")
                    .setRestaurant(bonAppetit);

            dishRepository.saveAll(List.of(dish1, dish2, dish3 ,dish4, dish5));
        }
    }
}
