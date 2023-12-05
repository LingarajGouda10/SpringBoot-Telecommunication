package com.ivoyant.SpringBootTelecommunication.Controller;

import com.ivoyant.SpringBootTelecommunication.Entity.ActivatedPlan;
import com.ivoyant.SpringBootTelecommunication.Entity.Payment;
import com.ivoyant.SpringBootTelecommunication.Entity.RecommendedPlans;
import com.ivoyant.SpringBootTelecommunication.Entity.User;
import com.ivoyant.SpringBootTelecommunication.Repository.ActivatedPlanRepository;
import com.ivoyant.SpringBootTelecommunication.Repository.PaymentRepository;
import com.ivoyant.SpringBootTelecommunication.Repository.RecommendedPlanRepository;
import com.ivoyant.SpringBootTelecommunication.Repository.UserRepository;
import com.ivoyant.SpringBootTelecommunication.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RecommendedPlanRepository recommendedPlanRepository;
    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private ActivatedPlanRepository activatedPlanRepository;

    @PostMapping("AddPack/{phoneNumber}/{price}")
    public String addPck(@PathVariable Long phoneNumber, @PathVariable int price, @RequestBody Payment payment,
                         @RequestBody ActivatedPlan activatedPlan) {
        User user = userRepository.findByPhoneNumber(phoneNumber);
        RecommendedPlans recommendedPlans = recommendedPlanRepository.findById(price).get();
        if (user.getPhoneNumber() == phoneNumber && recommendedPlans.getPrice() == price) {
            payment.setPrice(price);
            payment.setPhoneNumber(phoneNumber);

            //Payment Done
            Payment payment1 = paymentService.addPack(payment);

            //code for Activate Plan
            payment = paymentRepository.findByPhoneNumber(phoneNumber);
            activatedPlan.setUserId(payment.getUserId());

            recommendedPlans = recommendedPlanRepository.findById(price).get();
            recommendedPlans.setPrice(recommendedPlans.getPrice());
            activatedPlan.setPlanTitle(recommendedPlans.getPlanTitle());
            System.out.println(recommendedPlans.getPlanTitle());
            activatedPlan.setValidDays(recommendedPlans.getValidityDays());
            recommendedPlanRepository.save(recommendedPlans);
            //Activated plan
            activatedPlanRepository.save(activatedPlan);
            //System.out.println(activatedPlan.getPlanTitle());


            return "Thank You, your pack is Activated";
        } else {
            return "Something Went Wrong";
        }
    }

    @GetMapping("GetDetailsOfPayment")
    public List<Payment> getAllPaymnet() {

        return paymentService.getAllPaymentDetails();
    }

    @GetMapping("GetActivatedPlanByNumber/{phoneNumber}")
    public ActivatedPlan getActivatedPlanByNumber(@PathVariable("PhoneNumber") Long phoneNumber) {
        return activatedPlanRepository.findByPhoneNumber(phoneNumber);
    }

}
