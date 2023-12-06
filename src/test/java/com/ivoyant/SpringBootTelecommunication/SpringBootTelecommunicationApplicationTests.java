package com.ivoyant.SpringBootTelecommunication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivoyant.SpringBootTelecommunication.Controller.UserController;
import com.ivoyant.SpringBootTelecommunication.Entity.SubEntities.Address;
import com.ivoyant.SpringBootTelecommunication.Entity.SubEntities.Kyc;
import com.ivoyant.SpringBootTelecommunication.Entity.User;
import com.ivoyant.SpringBootTelecommunication.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootTelecommunicationApplicationTests {

	@Autowired
	private UserController userController;

	@Test
	public void testAddUserController() {
		User user = new User();
		user.setUserName("Lingaraj");
		user.setDob("21/01/2000");
		user.setEmail("abc@email.com");
		user.setPhoneNumber(1234567890);

		Address address = new Address();
		address.setCity("DVG");
		address.setCountry("India");
		address.setState("Karnataka");
		address.setLandMark("STPI");
		address.setPinCode(1234);

		Kyc kyc = new Kyc();
		kyc.setIdNo(1);
		kyc.setType("Pan_Card");

		user.setAddress(address);
		user.setKyc(kyc);


		String result = userController.add(user);


		assertEquals("User Added Succesfully", result);


		assertEquals("Lingaraj", user.getUserName());
		assertEquals("21/01/2000", user.getDob());
		assertEquals("abc@email.com", user.getEmail());
		assertEquals(1234567890, user.getPhoneNumber());


		assertEquals("DVG", user.getAddress().getCity());
		assertEquals("India", user.getAddress().getCountry());
		assertEquals("Karnataka", user.getAddress().getState());
		assertEquals("STPI", user.getAddress().getLandMark());
		assertEquals(1234, user.getAddress().getPinCode());


		assertEquals(1, user.getKyc().getIdNo());
		assertEquals("Pan_Card", user.getKyc().getType());
	}
}

