package com.ivoyant.SpringBootTelecommunication.Service.impl;

import com.ivoyant.SpringBootTelecommunication.Entity.Enums.Internet;
import com.ivoyant.SpringBootTelecommunication.Entity.RecommendedPlans;
import com.ivoyant.SpringBootTelecommunication.Repository.RecommendedPlanRepository;
import com.ivoyant.SpringBootTelecommunication.Service.RecommendedPlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecommendedPlansServiceImplementation implements RecommendedPlansService {

    @Autowired
    private RecommendedPlanRepository recommendedPlanRepository;

    @Override
    public RecommendedPlans addRecommendedPlans(RecommendedPlans recommendedPlans) {
        return recommendedPlanRepository.save(recommendedPlans) ;
    }

    @Override
    public List<RecommendedPlans> viewAllRecommendedPlans() {

        return recommendedPlanRepository.findAll() ;
    }

    @Override
    public RecommendedPlans getRecommendedPlanbyPrice(int Price) {
        return recommendedPlanRepository.findById(Price).get();
    }
}
