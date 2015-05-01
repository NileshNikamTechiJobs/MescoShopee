package com.mesco.grocery.dao;

import java.util.List;

import com.mesco.grocery.model.Fruit;

/**
 * This interface will perform all Fruit related CRUD operations.
 * @author Nilesh
 *
 */
public interface FruitDAO {
	
	/**
	 * Return dummy fruit, only for testing
	 * @return
	 */
	public Fruit getDummyFruit();

	/**
	 * This method will upload/add new fruits
	 * @param fruits
	 */
	public List<Fruit> addFruits(List<Fruit> fruits);
	
	/**
	 * This method will return Fruit list with their prices and stock levels and
	 * ordered by their update date
	 * @return
	 */
	public List<Fruit> getFruitList();
	
	/**
	 * This method will return fruit list by their name
	 * @param name
	 * @return
	 */
	public Fruit getFruitListByName(String name);
	
	/**
	 * This method will update fruits price 
	 * @param fruit
	 */
	public List<Fruit> updateFruits(List<Fruit> fruits);
}
