package bg.foodorderingapplication.repository;

import bg.foodorderingapplication.model.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {

    RestaurantEntity findByName(String name);
}
