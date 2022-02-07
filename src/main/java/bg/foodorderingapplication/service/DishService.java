package bg.foodorderingapplication.service;


import bg.foodorderingapplication.model.service.DishServiceModel;

public interface DishService {
    void addDish(DishServiceModel dishServiceModel);

    void initDishes();

}
