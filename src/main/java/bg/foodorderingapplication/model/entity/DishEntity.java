package bg.foodorderingapplication.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dishes")
public class DishEntity extends BaseEntity {

    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String url;
    @ManyToOne(fetch = FetchType.EAGER)
    private RestaurantEntity restaurant;
    @ManyToMany(mappedBy = "dishes", fetch = FetchType.EAGER)
    Set<OrderEntity> orders;

    public DishEntity() {
    }

    public String getName() {
        return name;
    }

    public DishEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DishEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DishEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    public RestaurantEntity getRestaurant() {
        return restaurant;
    }

    public DishEntity setRestaurant(RestaurantEntity restaurant) {
        this.restaurant = restaurant;
        return this;
    }

    public Set<OrderEntity> getOrders() {
        return orders;
    }

    public DishEntity setOrders(Set<OrderEntity> orders) {
        this.orders = orders;
        return this;
    }
}
