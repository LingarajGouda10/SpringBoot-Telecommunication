package com.ivoyant.SpringBootTelecommunication.Repository;

import com.ivoyant.SpringBootTelecommunication.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    Payment findByPhoneNumber(Long phoneNumber);
}

