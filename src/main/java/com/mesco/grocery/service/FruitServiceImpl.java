package com.mesco.grocery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mesco.grocery.dao.FruitDAO;
import com.mesco.grocery.model.Fruit;

/**
 * This class will execute all services for Fruit entity.
 * @author Nilesh
 *
 */
@Service
public class FruitServiceImpl implements FruitService {
	
	private static final Logger logger = LoggerFactory.getLogger(FruitServiceImpl.class);
	
	@Autowired
	protected FruitDAO fruitDAO;

	@Transactional
	public Fruit getDummyFruit() {
		logger.info("Start get DummyFruit");
		
		return fruitDAO.getDummyFruit();
	}

	@Transactional
	public Fruit getFruit(String name) {
		logger.info("Start get Fruit by name");
		
		return fruitDAO.getFruitListByName(name);
	}

	@Transactional
	public List<Fruit> updateFruits(List<Fruit> fruits) {
		logger.info("Start update Fruits");
		
		return fruitDAO.updateFruits(fruits);
	}

	@Transactional
	public List<Fruit> addFruits(List<Fruit> fruits) {
		logger.info("Start adding Fruits");
		
		return fruitDAO.addFruits(fruits);		
	}

	@Transactional
	public List<Fruit> getFruits() {		
		logger.info("Start getting all Fruits");
		
		return fruitDAO.getFruitList();
	}
}
