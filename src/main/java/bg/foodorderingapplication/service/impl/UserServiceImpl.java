package bg.foodorderingapplication.service.impl;

import bg.foodorderingapplication.model.binding.UserUpdateBindingModel;
import bg.foodorderingapplication.model.entity.UserEntity;
import bg.foodorderingapplication.model.service.UserServiceModel;
import bg.foodorderingapplication.model.view.UserFirstNameViewModel;
import bg.foodorderingapplication.model.view.UserViewModel;
import bg.foodorderingapplication.repository.UserRepository;
import bg.foodorderingapplication.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements UserService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;


    public UserServiceImpl(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(UserServiceModel userServiceModel) {

        UserEntity userEntity = modelMapper.
                map(userServiceModel, UserEntity.class);

        userRepository.
                save(userEntity);
    }

    @Override
    public List<UserFirstNameViewModel> getAllUserFirstName() {

        return userRepository.
                findAll().
                stream().
                map(userEntity -> modelMapper.map(userEntity, UserFirstNameViewModel.class)).
                collect(Collectors.toList());
    }

    @Override
    public UserEntity findUserByFirstName(String userFirstName) {

        return userRepository.findByFirstName(userFirstName);
    }

    @Override
    public void initUsers() {
        if (userRepository.count() == 0) {
            UserEntity user1 = new UserEntity()
                    .setFirstName("Stela")
                    .setLastName("Popova")
                    .setPassword("123456")
                    .setAddress("Plovidv")
                    .setPhoneNumber("083978723")
                    .setEmail("stela@gmail.com");

            UserEntity user2 = new UserEntity()
                    .setFirstName("Stoyan")
                    .setLastName("Kolev")
                    .setPassword("123226")
                    .setAddress("Sofia")
                    .setPhoneNumber("083978723")
                    .setEmail("s_kolev@gmail.com");

            UserEntity user3 = new UserEntity()
                    .setFirstName("Kiril")
                    .setLastName("Dobrev")
                    .setPassword("12326")
                    .setAddress("Varna")
                    .setPhoneNumber("083973723")
                    .setEmail("kiril@gmail.com");

            userRepository.saveAll(List.of(user1, user2, user3));
        }
    }

    @Override
    public List<UserViewModel> getAll() {
        return userRepository
                .findAll()
                .stream()
                .map(userEntity -> modelMapper.map(userEntity, UserViewModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserViewModel findUserById(Long id) {

        return modelMapper.map(userRepository.findById(id), UserViewModel.class);
    }

    @Override
    public void updateUser(Long id, UserUpdateBindingModel userUpdateBindingModel) {
        UserEntity user = userRepository.findById(id).orElse(null);

        user.setAddress(userUpdateBindingModel.getAddress());
        user.setEmail(userUpdateBindingModel.getEmail());
        user.setFirstName(userUpdateBindingModel.getFirstName());
        user.setLastName(userUpdateBindingModel.getLastName());
        user.setPhoneNumber(userUpdateBindingModel.getPhoneNumber());

        userRepository.save(user);
    }
}
