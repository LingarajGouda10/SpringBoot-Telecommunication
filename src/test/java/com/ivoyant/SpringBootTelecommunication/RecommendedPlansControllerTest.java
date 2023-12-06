package com.ivoyant.SpringBootTelecommunication;


import com.ivoyant.SpringBootTelecommunication.Controller.RecommendedPlansController;
import com.ivoyant.SpringBootTelecommunication.Entity.Enums.Internet;
import com.ivoyant.SpringBootTelecommunication.Entity.Enums.Messages;
import com.ivoyant.SpringBootTelecommunication.Entity.Enums.Talktime;
import com.ivoyant.SpringBootTelecommunication.Entity.RecommendedPlans;
import com.ivoyant.SpringBootTelecommunication.Service.RecommendedPlansService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class RecommendedPlansControllerTest {

    @Autowired
    private RecommendedPlansController recommendedPlansController;

    @Test
    public void testRecommendedPlansController() {
        RecommendedPlans recommendedPlans = new RecommendedPlans();
        recommendedPlans.setPlanTitle("qwer");
        recommendedPlans.setPrice(500);
        recommendedPlans.setDescription("Exclusive_Packs");
        recommendedPlans.setValidityDays(74);


        recommendedPlans.setTalktime(Talktime.UNLIMITED_TALKTIME);
        recommendedPlans.setInternet(Internet.UNLIMITED_DATA);
        recommendedPlans.setMessages(Messages.UNLIMITED_MESSAGES);



        String result = recommendedPlansController.addRecommendedPlans(recommendedPlans);

        assertEquals("Recommended Plans added Successfully", result);


        assertEquals(500, recommendedPlans.getPrice());
        assertEquals("Exclusive_Packs", recommendedPlans.getDescription());
        assertEquals(74, recommendedPlans.getValidityDays());
        assertEquals(Talktime.UNLIMITED_TALKTIME, recommendedPlans.getTalktime());
        assertEquals(Internet.UNLIMITED_DATA, recommendedPlans.getInternet());
        assertEquals(Messages.UNLIMITED_MESSAGES, recommendedPlans.getMessages());
    }
}


