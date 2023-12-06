package com.ivoyant.SpringBootTelecommunication.Repository;

import com.ivoyant.SpringBootTelecommunication.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByPhoneNumber(long phoneNumber);

    boolean existsByPhoneNumber(long phoneNumber);
}

