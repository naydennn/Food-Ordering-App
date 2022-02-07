package bg.foodorderingapplication.web;

import bg.foodorderingapplication.model.binding.OrderAddBindingModel;
import bg.foodorderingapplication.model.service.OrderServiceModel;
import bg.foodorderingapplication.service.OrderService;
import bg.foodorderingapplication.service.RestaurantService;
import bg.foodorderingapplication.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    private final ModelMapper modelMapper;
    private final OrderService orderService;
    private final RestaurantService restaurantService;
    private final UserService userService;

    public OrderController(ModelMapper modelMapper, OrderService orderService, RestaurantService restaurantService, UserService userService) {
        this.modelMapper = modelMapper;
        this.orderService = orderService;
        this.restaurantService = restaurantService;
        this.userService = userService;
    }

    @GetMapping("/order/add")
    public String addOrder(Model model) {

        model.addAttribute("restaurants", restaurantService.getAllRestaurantsName());
        model.addAttribute("users", userService.getAllUserFirstName());

        return "add-order";
    }

    @PostMapping("/order/add")
    public String add(OrderAddBindingModel orderAddBindingModel) {

        orderService.addOrder(modelMapper.map(orderAddBindingModel, OrderServiceModel.class));

        return "redirect:/";
    }
}
