package bg.foodorderingapplication.model.entity;

import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "restaurants")
public class RestaurantEntity extends BaseEntity{

    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String url;
    private String address;
    @OneToMany(mappedBy = "restaurant", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<DishEntity> dishes;

    public RestaurantEntity() {
    }

    public String getName() {
        return name;
    }

    public RestaurantEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RestaurantEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public RestaurantEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public RestaurantEntity setAddress(String address) {
        this.address = address;
        return this;
    }

    public Set<DishEntity> getDishes() {
        return dishes;
    }

    public RestaurantEntity setDishes(Set<DishEntity> dishes) {
        this.dishes = dishes;
        return this;
    }
}
