package com.example.diningReviewAPI.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private String city;
    private String state;
    private String zipcode;
    private String phoneNumber;
    private String website;

    private String overallScore;
    private String peanutScore;
    private String eggScore;
    private String dairyScore;
}
