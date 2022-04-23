package com.example.diningReviewAPI.repository;

import com.example.diningReviewAPI.model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
As an application experience, I want to submit a new restaurant entry. Should a restaurant with
the same name and with the same zip code already exist, I will see a failure.
As an application experience, I want to fetch the details of a restaurant, given its unique Id.
As an application experience, I want to fetch restaurants that match a given zip code and that also
have at least one user-submitted score for a given allergy. I want to see them sorted in descending order.
 */


@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    List<Restaurant> findRestaurantById(Long id);
    List<Restaurant> findRestaurantsByZipcodeAndPeanutScoreNotNullOrderByPeanutScore(String zipcode);
    List<Restaurant> findRestaurantsByZipcodeAndDairyScoreNotNullOrderByDairyScore(String zipcode);
    List<Restaurant> findRestaurantsByZipcodeAndEggScoreNotNullOrderByEggScore(String zipcode);

}
