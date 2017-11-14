package com.test.countrylist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.countrylist.dto.CountryWithCurrency;
import com.test.countrylist.dto.Currency;
import com.test.countrylist.service.CountriesService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountrylistApplicationTests {
	
	@Autowired
	private  CountriesService countriesService;
	
	@Test
	public void testCountriesSize() {
		assertEquals("Countries Size Test failed.",250, countriesService.getCountries().size());
	}
	
	@Test
	public void testFirstCountyName() {
		assertEquals("Name test failed for first country returned.","Afghanistan", ((CountryWithCurrency)countriesService.getCountries().get(0)).getName() );
	}
	
	
	 @Test
	 public void testFirstCurrencyCode() {
		 CountryWithCurrency countryWithCurrency =(CountryWithCurrency)countriesService.getCountries().get(0);
		 Currency firstCountryCurrency = (Currency)countryWithCurrency.getCurrencies().get(0);
		 
		 assertEquals("Currency test failed for first country returned.","AFN", firstCountryCurrency.getCode() );
	 }

}
