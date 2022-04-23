package com.example.diningReviewAPI.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    private String submittedBy;
    private Long restaurantId;

    private String peanutScore;
    private String eggScore;
    private String dairyScore;
    private String comment;

    private ReviewStatus status;
}
