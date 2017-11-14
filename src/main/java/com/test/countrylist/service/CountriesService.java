package com.test.countrylist.service;

import java.util.List;

import com.test.countrylist.dto.CountryWithCurrency;

public interface CountriesService {

	public List<CountryWithCurrency> getCountries();
}
