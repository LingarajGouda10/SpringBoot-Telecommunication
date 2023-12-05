package com.ivoyant.SpringBootTelecommunication.Repository;

import com.ivoyant.SpringBootTelecommunication.Entity.ActivatedPlan;
import com.ivoyant.SpringBootTelecommunication.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivatedPlanRepository extends JpaRepository<ActivatedPlan, Integer> {
    ActivatedPlan findByPhoneNumber(long phoneNumber);
}

