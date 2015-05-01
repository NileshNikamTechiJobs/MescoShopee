package com.mesco.grocery.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mesco.grocery.model.Fruit;
import com.mesco.grocery.service.FruitService;
import com.mesco.grocery.util.AppURIContants;

/**
 * Handles requests for the Fruit service.
 */
@Controller
public class FruitController {
	
	private static final Logger logger = LoggerFactory.getLogger(FruitController.class);
	
	@Autowired
	protected FruitService fruitService;
	
	@RequestMapping(value = AppURIContants.GET_DUMMY_FRUIT, method = RequestMethod.GET)
    public @ResponseBody Fruit getDummyFruit() {
		
		logger.info("Start get DummyFruit");
		
		return fruitService.getDummyFruit();
    }
	
	@RequestMapping(value = AppURIContants.GET_FRUIT, method = RequestMethod.GET)
    public @ResponseBody Fruit getFruit(@PathVariable("name") String name) {
		
		logger.info("Start get Fruit by name");
		
		return fruitService.getFruit(name);
    }
	
	@RequestMapping(value = AppURIContants.POST_FRUIT, method = RequestMethod.POST)
    public @ResponseBody List<Fruit> updateFruit(@RequestBody List<Fruit> fruits) {
		
		logger.info("Start update Fruit");
		
		return fruitService.updateFruits(fruits);
    }
	
	@RequestMapping(value = AppURIContants.PUT_FRUITS, method = RequestMethod.PUT)
    public ResponseEntity<List<Fruit>> addFruits(@RequestBody List<Fruit> fruits) {
		
		logger.info("Start adding Fruits");
		
		return new ResponseEntity<List<Fruit>>(fruitService.addFruits(fruits), 
				HttpStatus.OK);
    }
	
	@RequestMapping(value = AppURIContants.GET_ALL_FRUIT, method = RequestMethod.GET)
    public ResponseEntity<List<Fruit>> getFruits() {
		
		logger.info("Start getting all Fruits");
		
		return new ResponseEntity<List<Fruit>>(fruitService.getFruits(), 
				HttpStatus.OK);
    }

}
