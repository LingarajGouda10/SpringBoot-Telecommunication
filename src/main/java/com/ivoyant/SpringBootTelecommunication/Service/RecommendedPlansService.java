package com.ivoyant.SpringBootTelecommunication.Service;

import com.ivoyant.SpringBootTelecommunication.Entity.RecommendedPlans;

import java.util.List;

public interface RecommendedPlansService {
    public RecommendedPlans addRecommendedPlans(RecommendedPlans recommendedPlans);
    public List<RecommendedPlans> viewAllRecommendedPlans();
    public RecommendedPlans getRecommendedPlanbyPrice(int Price);
}
