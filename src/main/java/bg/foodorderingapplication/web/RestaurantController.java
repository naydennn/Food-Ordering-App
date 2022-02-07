package bg.foodorderingapplication.web;

import bg.foodorderingapplication.model.binding.RestaurantAddBindingModel;
import bg.foodorderingapplication.model.service.RestaurantServiceModel;
import bg.foodorderingapplication.service.RestaurantService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestaurantController {

    private final ModelMapper modelMapper;
    private final RestaurantService restaurantService;

    public RestaurantController(ModelMapper modelMapper, RestaurantService restaurantService) {
        this.modelMapper = modelMapper;
        this.restaurantService = restaurantService;
    }

    @GetMapping("/restaurant/add")
    public String addRestaurant(){
        return "add-restaurant";
    }

    @GetMapping("/restaurant/all")
    public String getAll(Model model) {
        model.addAttribute("restaurants", restaurantService.getAll());

        return "all-restaurants";
    }

    @PostMapping("/restaurant/add")
    public String add(RestaurantAddBindingModel restaurantAddBindingModel) {

        restaurantService.addRestaurant(modelMapper.map(restaurantAddBindingModel, RestaurantServiceModel.class));

        return "redirect:/";
    }

    @DeleteMapping("/delete/{id}/restaurant")
    public String delete(@PathVariable Long id) {
        restaurantService.deleteRestaurantById(id);

        return "redirect:/restaurant/all";
    }
}
