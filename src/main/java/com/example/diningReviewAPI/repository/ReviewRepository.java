package com.example.diningReviewAPI.repository;

import com.example.diningReviewAPI.model.Restaurant;
import com.example.diningReviewAPI.model.Review;
import com.example.diningReviewAPI.model.ReviewStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
    List<Review> findReviewsByStatus(ReviewStatus status);
    List<Review> findReviewsByRestaurantIdAndStatus(Long id, ReviewStatus status);
}
