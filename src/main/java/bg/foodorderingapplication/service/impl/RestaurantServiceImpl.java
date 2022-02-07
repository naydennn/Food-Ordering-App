package bg.foodorderingapplication.service.impl;

import bg.foodorderingapplication.model.entity.DishEntity;
import bg.foodorderingapplication.model.entity.RestaurantEntity;
import bg.foodorderingapplication.model.service.RestaurantServiceModel;
import bg.foodorderingapplication.model.view.RestaurantNameViewModel;
import bg.foodorderingapplication.model.view.RestaurantViewModel;
import bg.foodorderingapplication.repository.RestaurantRepository;
import bg.foodorderingapplication.service.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final ModelMapper modelMapper;
    private final RestaurantRepository restaurantRepository;


    public RestaurantServiceImpl(ModelMapper modelMapper, RestaurantRepository restaurantRepository) {
        this.modelMapper = modelMapper;
        this.restaurantRepository = restaurantRepository;

    }

    @Override
    public void addRestaurant(RestaurantServiceModel restaurantServiceModel) {
        RestaurantEntity restaurant = modelMapper.map(restaurantServiceModel, RestaurantEntity.class);

        restaurantRepository.save(restaurant);
    }

    @Override
    public List<RestaurantNameViewModel> getAllRestaurantsName() {

        return restaurantRepository.
                findAll().
                stream().
                map(restaurantEntity -> modelMapper.map(restaurantEntity, RestaurantNameViewModel.class)).
                collect(Collectors.toList());
    }

    @Override
    public RestaurantEntity getRestaurantByName(String restaurantName) {

        return this.restaurantRepository.findByName(restaurantName);
    }

    @Override
    public Set<DishEntity> getAllDishesByName(String restaurantName) {

        return restaurantRepository.findByName(restaurantName).getDishes();
    }

    @Override
    public List<RestaurantViewModel> getAll() {

        List<RestaurantViewModel> restaurants = restaurantRepository.
                findAll().
                stream().
                map(restaurantEntity -> modelMapper.map(restaurantEntity, RestaurantViewModel.class)).
                collect(Collectors.toList());

        return restaurants;
    }

    @Override
    public void deleteRestaurantById(Long id) {
        RestaurantEntity restaurant = restaurantRepository.findById(id).orElse(null);

        restaurantRepository.delete(restaurant);
    }

    @Override
    public void initRestaurants() {
        if (restaurantRepository.count() == 0) {

            RestaurantEntity restaurant1 = new RestaurantEntity()
                    .setName("Red Chicken")
                    .setDescription("Delicious and health food.")
                    .setUrl("www.redchicken.com")
                    .setAddress("ul. Casablanka 4")
                    .setDishes(new HashSet<>());

            RestaurantEntity restaurant2 = new RestaurantEntity()
                    .setName("Food Cheff")
                    .setDescription("The best food")
                    .setAddress("ul Pobeda 2")
                    .setDishes(new HashSet<>());

            RestaurantEntity restaurant3 = new RestaurantEntity()
                    .setName("Bon Appetit")
                    .setDescription("Incredible taste")
                    .setAddress("ul Maritsa 2")
                    .setDishes(new HashSet<>());

            restaurantRepository.saveAll(List.of(restaurant1, restaurant2, restaurant3));
        }
    }
}
