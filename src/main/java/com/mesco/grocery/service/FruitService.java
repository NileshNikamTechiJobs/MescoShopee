package com.mesco.grocery.service;

import java.util.List;

import com.mesco.grocery.model.Fruit;

public interface FruitService {
	
	/**
	 * Return dummy Fruit
	 * @return
	 */
	public Fruit getDummyFruit();
	
	/**
	 * Return fruit with given name
	 * @param name
	 * @return
	 */
	public Fruit getFruit(String name);
	
	/**
	 * Updating Fruit details
	 * 
	 * @param fruit
	 * @return
	 */
	public List<Fruit> updateFruits(List<Fruit> fruits);
	
	/**
	 * Adding new fruits to DB
	 * 
	 * @param fruits
	 */
	public List<Fruit> addFruits(List<Fruit> fruits);
	
	/**
	 * Return all fruits with their prices and stock levels, ordered by their update date
	 * @return
	 */
	public List<Fruit> getFruits();

}
