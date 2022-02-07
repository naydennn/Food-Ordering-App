package bg.foodorderingapplication.service.impl;

import bg.foodorderingapplication.model.entity.OrderEntity;
import bg.foodorderingapplication.model.service.OrderServiceModel;
import bg.foodorderingapplication.repository.OrderRepository;
import bg.foodorderingapplication.service.OrderService;
import bg.foodorderingapplication.service.RestaurantService;
import bg.foodorderingapplication.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final UserService userService;
    private final RestaurantService restaurantService;

    public OrderServiceImpl( OrderRepository orderRepository, UserService userService, RestaurantService restaurantService) {
        this.orderRepository = orderRepository;
        this.userService = userService;
        this.restaurantService = restaurantService;
    }

    @Override
    public void addOrder(OrderServiceModel orderServiceModel) {
        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setStatus(orderServiceModel.getStatus());
        orderEntity.setUser(userService.findUserByFirstName(orderServiceModel.getUserFirstName()));
        orderEntity.setDishes(restaurantService.getAllDishesByName(orderServiceModel.getRestaurantName()));

        orderRepository.save(orderEntity);
    }
}
