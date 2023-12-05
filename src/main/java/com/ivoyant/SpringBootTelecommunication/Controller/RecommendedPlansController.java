package com.ivoyant.SpringBootTelecommunication.Controller;

import com.ivoyant.SpringBootTelecommunication.Entity.RecommendedPlans;
import com.ivoyant.SpringBootTelecommunication.Service.RecommendedPlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecommendedPlansController {

    @Autowired
    private RecommendedPlansService recommendedPlansService;
    @PostMapping("addRecommendedPlans")
    public String addRecommendedPlans(@RequestBody RecommendedPlans recommendedPlans){
        recommendedPlansService.addRecommendedPlans(recommendedPlans);
        return "Recommended Plans added Succesfully";
    }

    @GetMapping("GetAllRecommendePlans")
    public List<RecommendedPlans> getAllRecommendePlans() {

        return recommendedPlansService.viewAllRecommendedPlans();
    }

    @GetMapping("GetRecommendePlanByPrice/{Price}")
    public RecommendedPlans getRecommendePlanByPrice(@PathVariable("Price") int Price){
        return recommendedPlansService.getRecommendedPlanbyPrice(Price);
    }
}
