package bg.foodorderingapplication.web;

import bg.foodorderingapplication.model.binding.DishAddBindingModel;
import bg.foodorderingapplication.model.service.DishServiceModel;
import bg.foodorderingapplication.service.DishService;
import bg.foodorderingapplication.service.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DishController {

    private final ModelMapper modelMapper;
    private final DishService dishService;
    private final RestaurantService restaurantService;

    public DishController(ModelMapper modelMapper, DishService dishService, RestaurantService restaurantService) {
        this.modelMapper = modelMapper;
        this.dishService = dishService;
        this.restaurantService = restaurantService;
    }

    @GetMapping("/dish/add")
    public String addDish(Model model) {

        model.addAttribute("restaurants", restaurantService.getAllRestaurantsName());

        return "add-dish";
    }


    @PostMapping("/dish/add")
    public String add(DishAddBindingModel dishAddBindingModel){

        DishServiceModel dishServiceModel = modelMapper.map(dishAddBindingModel, DishServiceModel.class);

        this.dishService.addDish(dishServiceModel);
        return "redirect:/";
    }
}
