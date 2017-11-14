package com.test.countrylist.endpoint;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.test.countrylist.dto.CountryWithCurrency;
import com.test.countrylist.service.CountriesService;

@Component
public class CountriesEndPoint {
	
	private final CountriesService countriesService;

	public CountriesEndPoint(CountriesService countriesService) {
		this.countriesService = countriesService;
	}
	
	public Message<?> get() {

		List<CountryWithCurrency> countries = this.countriesService.getCountries();
		
		System.out.println(countries);
        
        return MessageBuilder.withPayload(countries)
            .setHeader("http_statusCode", HttpStatus.OK)
            .build();
    }

}
