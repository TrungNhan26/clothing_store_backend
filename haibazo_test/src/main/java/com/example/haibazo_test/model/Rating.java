//package com.example.haibazo_test.model;
//
//import jakarta.persistence.*;
//import lombok.*;
//import lombok.experimental.FieldDefaults;
//
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE)
//@Table(name = "Rating")
//public class Rating {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;
//
//    @Column(name = "num_of_stars", nullable = false)
//    String numStars;
////
//    @ManyToOne(fetch = FetchType.LAZY)
//    Product product;
//}