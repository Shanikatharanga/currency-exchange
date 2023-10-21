package com.exchangeservice.exchangeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

	@GetMapping("/exchange/from/{from}/to/{to}")
	public ExcVal getExchangeValue(@PathVariable("from") Currencies from, 
			@PathVariable("to") Currencies to) {
		ExcVal excVal = null;
		
		if(Currencies.USD==from && Currencies.IND==to) {
			excVal = new ExcVal(401L,Currencies.USD,Currencies.IND,60);
		}else if(Currencies.USD==from && Currencies.YEN==to) {
			excVal = new ExcVal(401L,Currencies.USD,Currencies.YEN,160);
		}
		
		return excVal;
	}
	
}
