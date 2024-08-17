package com.alphaware.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alphaware.entity.Continent;
import com.alphaware.repository.ContinentRepository;
import com.lti.exception.ContinentSaveException;

@Service
public class ContinentService {

	@Autowired
	ContinentRepository continentRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Iterable<Continent> saveContinent() {

		try {
			String url = "https://dummy-json.mock.beeceptor.com/continents";
			Continent[] continents = restTemplate.getForObject(url, Continent[].class);
			Iterable<Continent> savedContinents = continentRepository.saveAll(Arrays.asList(continents));
			return savedContinents;
		} catch (Exception e) {
			throw new ContinentSaveException("Failed to save continents data to the database");
		}
	}

}
