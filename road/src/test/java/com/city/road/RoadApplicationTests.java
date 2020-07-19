package com.city.road;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.ModelMap;

import com.city.road.controller.ConnectRoadController;
import com.city.road.controller.WelcomeController;
import com.city.road.service.ConnectRoadService;

@SpringBootTest
class RoadApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testWelcomeController() {
        WelcomeController wlController = new WelcomeController();
        ModelMap map = null;
        String result = wlController.showWelcome(map);
        assertEquals(result, "welcome");
    }
	
	@Test
	public void testConnectRoadTrueCase() {
		
        ConnectRoadController crController = new ConnectRoadController();
        ConnectRoadService rdService = new ConnectRoadService();
        rdService.loadCityMap();
        String result = crController.showRoadConnection("Boston", "Atlanta");
        assertEquals(result, "yes");
    }
	
	@Test
	public void testConnectRoadTrue_1Hop() {
		
        ConnectRoadController crController = new ConnectRoadController();
        ConnectRoadService rdService = new ConnectRoadService();
        rdService.loadCityMap();
        String result = crController.showRoadConnection("New York", "Chicago");
        assertEquals(result, "yes");
    }
	
	@Test
	public void testConnectRoadTrue_2Hops() {
		
        ConnectRoadController crController = new ConnectRoadController();
        ConnectRoadService rdService = new ConnectRoadService();
        rdService.loadCityMap();
        String result = crController.showRoadConnection("Boston", "Chicago");
        assertEquals(result, "yes");
    }
	
	@Test
	public void testConnectRoadTrue_3Hops() {
		
        ConnectRoadController crController = new ConnectRoadController();
        ConnectRoadService rdService = new ConnectRoadService();
        rdService.loadCityMap();
        String result = crController.showRoadConnection("Boston", "Mason");
        assertEquals(result, "yes");
    }
	
	@Test
	public void testConnectRoad_BtoA_True_3Hops() {
		
        ConnectRoadController crController = new ConnectRoadController();
        ConnectRoadService rdService = new ConnectRoadService();
        rdService.loadCityMap();
        String result = crController.showRoadConnection("Mason", "Boston");
        assertEquals(result, "yes");
    }
	@Test
	public void testConnectRoad_BtoA_True_2Hops() {
		
        ConnectRoadController crController = new ConnectRoadController();
        ConnectRoadService rdService = new ConnectRoadService();
        rdService.loadCityMap();
        String result = crController.showRoadConnection("Chicago", "Boston");
        assertEquals(result, "yes");
    }
	@Test
	public void testConnectRoad_BtoA_True_1Hop() {
		
        ConnectRoadController crController = new ConnectRoadController();
        ConnectRoadService rdService = new ConnectRoadService();
        rdService.loadCityMap();
        String result = crController.showRoadConnection("Chicago", "New York");
        assertEquals(result, "yes");
    }
	@Test
	public void testConnectRoad_No_Case() {
		
        ConnectRoadController crController = new ConnectRoadController();
        ConnectRoadService rdService = new ConnectRoadService();
        rdService.loadCityMap();
        String result = crController.showRoadConnection("Boston", "Albany");
        assertEquals(result, "no");
    }
	
	@Test
	public void testConnectRoad_No_NoCity() {
		
        ConnectRoadController crController = new ConnectRoadController();
        ConnectRoadService rdService = new ConnectRoadService();
        rdService.loadCityMap();
        String result = crController.showRoadConnection("ABC", "Albany");
        assertEquals(result, "no");
    }
	
	@Test
	public void testConnectRoad_No_NoCites() {
		
        ConnectRoadController crController = new ConnectRoadController();
        ConnectRoadService rdService = new ConnectRoadService();
        rdService.loadCityMap();
        String result = crController.showRoadConnection("ABC", "TEMP");
        assertEquals(result, "no");
    }
	
	
	@Test
	public void testConnectRoad_No_NULLDATA() {
		
        ConnectRoadController crController = new ConnectRoadController();
        ConnectRoadService rdService = new ConnectRoadService();
        rdService.loadCityMap();
        String result = crController.showRoadConnection("", "");
        assertEquals(result, "no");
    }
}
