package com.city.road.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.city.road.service.ConnectRoadService;

@Controller
@SessionAttributes("name")
public class ConnectRoadController {
	@Autowired
	ConnectRoadService service;

	@RequestMapping(path = "/login", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String processForm(@RequestParam(defaultValue = "Guest") String id) {
		return "welcome";
	}

	@RequestMapping(path = "/connected", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String showRoadConnection(@RequestParam String origin, @RequestParam String destination) {
		
		ConnectRoadService service = new ConnectRoadService();
		service.loadCityMap();
		String service_resp = "no";
		if (service.checkConnected(origin, destination)) {
			service_resp = "yes";
		}
		if (service_resp.equals("no")) {
			if (service.checkConnected(destination, origin)) {
				service_resp = "yes";
			}
		}
		return service_resp;
	}
}
