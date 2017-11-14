## Build Project
cd to project root.

```sh
mvn clean install -DskipTests=true
```

copy war file will be created in target folder. copy this to your tomcat webapps directory.

## Spring Security Configuration

	-CustomWebSecurityConfigurerAdapter class extends WebSecurityConfigurerAdapter for basic authentication using spring security. 
	-This class overrides configureGlobal and configure methods for. configureGlobal describes credentials for basic authentication with roles.
	-Method configure overriden to define resouces needed to protected.
	-Credentials for basic authentication are use/password.
	
	
## Rest Endpoint using Spring Integration
	

	- Integration configuration is defined in integration.xml file in resources folder.
	- DTOs classes CountryWithCurrency, Currency for json parsing are in package com.test.countrylist.dto .
	- MessageEndPoint for rest based endpoint is in com.test.countrylist.endpoint.CountriesEndPoint .
	
## Test Cases

	- Test cases exists to check the resulted data size, First Country Name and Currency returned.
	
## Index Page.

	- Index page exists which calls the created rest end point and shows result with pagination.
	
## Testing enpoint
	After deploying war file on tomcat. Run the url http://hostname:port/context-path/countiesList in the postman. Also need to set header content-type to "application/json". Then authorize user using basic authentication with username "user" and password "password". 


