//package com.example.haibazo_test.service.impl;
//
//import com.example.haibazo_test.dto.RatingDTO;
//import com.example.haibazo_test.mapper.RatingMapper;
//import com.example.haibazo_test.model.Rating;
//import com.example.haibazo_test.repository.RatingRepository;
//import com.example.haibazo_test.service.IRatingService;
//
//import java.util.List;
//import java.util.Optional;
//
//public class RatingService implements IRatingService {
//
//    RatingRepository ratingRepository;
//
//    RatingMapper ratingMapper;
//
//    public List<RatingDTO> getAllRatings() {
//        List<Rating> colors = ratingRepository.findAll();
//        return colors.stream().map(ratingMapper::toRatingDTO).toList();
//    }
//
//    public Optional<RatingDTO> findById(Long id) {
//        Optional<Rating> ratingOptional = ratingRepository.findById(id);
//        return ratingOptional.map(ratingMapper::toRatingDTO);
//    }
//
//    public Rating save(Rating rating) {
//        return ratingRepository.save(rating);
//    }
//
//}
