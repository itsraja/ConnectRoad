package com.city.road.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class ConnectRoadService {

	public HashMap<String, List<String>> connectedCities = new HashMap<String, List<String>>();

	public void loadCityMapFromFile() {

		Resource resource = new ClassPathResource("city.txt");
		try {
			File fileObj = resource.getFile();
			Scanner myReader = new Scanner(fileObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] parts = data.split(",", 2);
				if (parts.length >= 2) {
					String key = parts[0];
					String value = parts[1];
					if (connectedCities.get(key) != null) {
						List<String> nextCity = connectedCities.get(key);
						List<String> values = new ArrayList<String>();
						for (int j = 0; j < nextCity.size(); j++) {
							values.add(nextCity.get(j));
						}
						values.add(value);
						connectedCities.replace(key, values);
					} else {
						List<String> values = new ArrayList<String>();
						values.add(value);
						connectedCities.put(key, values);
					}
				} else {
					System.out.println("ignoring line: ");
				}
			}
			myReader.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public void loadCityMap() {

		if (connectedCities.size() == 0) {
			loadCityMapFromFile();
		}
	}

	public boolean checkConnected(String srcCity, String dstCity) {
		boolean bConnected = false;
		for (int i = 0; i < connectedCities.size(); i++) {
			if (!bConnected) {
				List<String> nextCity = connectedCities.get(srcCity);
				if (nextCity == null)
					return false;

				for (int j = 0; j < nextCity.size(); j++) {
					if (nextCity.get(j).equals(dstCity)) {
						bConnected = true;
					} else {
						srcCity = nextCity.get(j);
					}
				}
				if (!bConnected)
					bConnected = checkConnected(srcCity, dstCity);
				else
					bConnected = true;
			} else {
				return bConnected;
			}
		}
		return bConnected;
	}
}
