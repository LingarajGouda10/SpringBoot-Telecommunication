package com.ivoyant.SpringBootTelecommunication.Repository;

import com.ivoyant.SpringBootTelecommunication.Entity.RecommendedPlans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendedPlanRepository extends JpaRepository<RecommendedPlans, Integer> {

}

