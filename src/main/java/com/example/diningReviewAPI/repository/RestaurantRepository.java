package com.example.diningReviewAPI.repository;

import com.example.diningReviewAPI.model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    List<Restaurant> findRestaurantById(Long id);
    List<Restaurant> findRestaurantsByZipcodeAndPeanutScoreNotNullOrderByPeanutScore(String zipcode);
    List<Restaurant> findRestaurantsByZipcodeAndDairyScoreNotNullOrderByDairyScore(String zipcode);
    List<Restaurant> findRestaurantsByZipcodeAndEggScoreNotNullOrderByEggScore(String zipcode);

}
