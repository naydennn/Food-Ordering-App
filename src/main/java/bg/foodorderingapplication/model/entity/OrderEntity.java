package bg.foodorderingapplication.model.entity;

import bg.foodorderingapplication.model.enums.OrderStatusEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "orders")
public class OrderEntity extends BaseEntity {

    @ManyToOne
    private UserEntity user;
    @ManyToMany()
    private Set<DishEntity> dishes;
    @Enumerated(EnumType.STRING)
    private OrderStatusEnum status;

    public UserEntity getUser() {
        return user;
    }

    public OrderEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public Set<DishEntity> getDishes() {
        return dishes;
    }

    public OrderEntity setDishes(Set<DishEntity> dishes) {
        this.dishes = dishes;
        return this;
    }

    public OrderStatusEnum getStatus() {
        return status;
    }

    public OrderEntity setStatus(OrderStatusEnum status) {
        this.status = status;
        return this;
    }
}
