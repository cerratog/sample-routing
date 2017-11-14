$(document).ready(function() {
	
	$.ajax({
		url: "/countriesList",
		type:"GET",
		contentType:"application/json; charset=utf-8",
		dataType:"json"
	})
	  .done(function(data) {
	    let countryTableRows = data.map((country, index) => {
	    	let countryCurrencies = country.currencies.map((currency, index) => currency.name);
	    	return `<tr><td>${country.name}</td><td>${countryCurrencies.join()}</td></tr>`
	    });
	    $("#countriesTable tbody").append(countryTableRows)
	    $('#countriesTable').DataTable({
	    	  "pageLength": 5
	    });
	  })
	  .fail(function() {
	    alert( "error" );
	  })
	  .always(function() {
	  });
});