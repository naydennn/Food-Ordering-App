package bg.foodorderingapplication.web;

import bg.foodorderingapplication.model.binding.UserAddBindingModel;
import bg.foodorderingapplication.model.binding.UserUpdateBindingModel;
import bg.foodorderingapplication.model.service.UserServiceModel;
import bg.foodorderingapplication.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final ModelMapper modelMapper;
    private final UserService userService;

    public UserController(ModelMapper modelMapper, UserService userService) {
        this.modelMapper = modelMapper;
        this.userService = userService;
    }

    @GetMapping("/user/add")
    public String addUser() {
        return "add-user";
    }

    @GetMapping("/user/all")
    public String getAllUsers(Model model) {

        model.addAttribute("users", userService.getAll());

        return "all-users";
    }

    @GetMapping("/user/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {

        model.addAttribute("user", userService.findUserById(id));

        return "edit-user";
    }

    @PostMapping("/user/add")
    public String add(UserAddBindingModel userAddBindingModel) {

        userService.addUser(modelMapper.map(userAddBindingModel, UserServiceModel.class));

        return "redirect:/";
    }

    @DeleteMapping("/delete/{id}/user")
    public String deleteUser(@PathVariable Long id) {

        userService.deleteUser(id);

        return "redirect:/user/all";
    }

    @PatchMapping("/user/{id}/edit")
    public String editUser(@PathVariable Long id, UserUpdateBindingModel userUpdateBindingModel) {

        userService.updateUser(id, userUpdateBindingModel);
        return "redirect:/user/all";
    }

}
