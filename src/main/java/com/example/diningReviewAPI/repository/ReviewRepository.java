package com.example.diningReviewAPI.repository;

import com.example.diningReviewAPI.model.Restaurant;
import com.example.diningReviewAPI.model.Review;
import com.example.diningReviewAPI.model.ReviewStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/*As a registered user, I want to submit a dining review.
As an admin, I want to get the list of all dining reviews that are pending approval.
As an admin, I want to approve or reject a given dining review.
As part of the backend process that updates a restaurant’s set of scores,
I want to fetch the set of all approved dining reviews belonging to this restaurant.
 */


@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
    List<Review> findReviewsByStatus(ReviewStatus status);
    List<Review> findReviewsByRestaurantIdAndStatus(Long id, ReviewStatus status);
}
