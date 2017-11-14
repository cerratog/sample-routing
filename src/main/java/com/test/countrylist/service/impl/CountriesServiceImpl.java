package com.test.countrylist.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.countrylist.dto.CountryWithCurrency;
import com.test.countrylist.service.CountriesService;

@Service("countriesService")
public class CountriesServiceImpl implements CountriesService {

	private final RestTemplate restTemplate;
	
	public CountriesServiceImpl(org.springframework.web.client.RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public List<CountryWithCurrency> getCountries() {
		
		ParameterizedTypeReference<List<CountryWithCurrency>> ptr = new ParameterizedTypeReference<List<CountryWithCurrency>>() {
        };
		ResponseEntity<List<CountryWithCurrency>> responseEntity = this.restTemplate.exchange("https://restcountries.eu/rest/v2/all", HttpMethod.GET,
		      null, ptr);
		
		return responseEntity .getBody().stream().collect(Collectors.toList());
	}

}
