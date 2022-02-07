package bg.foodorderingapplication.service;

import bg.foodorderingapplication.model.binding.UserUpdateBindingModel;
import bg.foodorderingapplication.model.entity.UserEntity;
import bg.foodorderingapplication.model.service.UserServiceModel;
import bg.foodorderingapplication.model.view.UserFirstNameViewModel;
import bg.foodorderingapplication.model.view.UserViewModel;

import java.util.List;

public interface UserService {

    void addUser(UserServiceModel userServiceModel);

    List<UserFirstNameViewModel> getAllUserFirstName();

    UserEntity findUserByFirstName(String userFirstName);

    void initUsers();

    List<UserViewModel> getAll();

    void deleteUser(Long id);

    UserViewModel findUserById(Long id);

    void updateUser(Long id, UserUpdateBindingModel userUpdateBindingModel);
}
