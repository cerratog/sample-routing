package com.test.countrylist.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CountryWithCurrency implements Serializable {

	private static final long serialVersionUID = 2652173310789295944L;

	@JsonProperty("name")
	@JsonIgnore
	private String name;
	
	@JsonProperty("currencies")
	private List<Currency> currencies;
	
	public CountryWithCurrency() {
	}

	public CountryWithCurrency(String name, List<Currency> currencies) {
		this.name = name;
		this.currencies = currencies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Currency> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}
	
	public String getJson() {
		String json = "";
		
		
		return json;
	}
	
	
}
