package com.test.mesco.grocery.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mesco.grocery.model.Fruit;
import com.mesco.grocery.util.AppURIContants;

import org.springframework.web.client.RestTemplate;

public class TestFruitController {
	
	public static final String SERVER_URI = "http://localhost:8080/mescoShopee";
	
	public static void main(String... args) {
		testGetDummyFruit();
		testGetFruit();
		testUpdateFruit();
		testAddFruits();
		testGetFruits();
	}
	
	private static void testGetDummyFruit() {
		System.out.println("testing get dummy........");
		RestTemplate restTemplate = new RestTemplate();
		Fruit fruit = restTemplate.getForObject(
				SERVER_URI+AppURIContants.GET_DUMMY_FRUIT, Fruit.class);
		
		System.out.println("Testing Fruit details : " + fruit.toString());
	}
	
	private static void testGetFruit() {
		System.out.println("testing get fruit..........");
		RestTemplate restTemplate = new RestTemplate();
		
		Fruit fruit = restTemplate.getForObject(
				SERVER_URI+AppURIContants.GET_FRUIT+"apple", Fruit.class);
		
		System.out.println("Testing Fruit details : " + fruit.toString());
		
	}
	
	private static void testUpdateFruit() {
		System.out.println("testing update fruit..........");
		RestTemplate restTemplate = new RestTemplate();
		
		List<Fruit> fruits = new ArrayList(1);
		Fruit temp = new Fruit("Banana", 0.90f, 30, new Date());
		fruits.add(temp);
		
		List<Fruit> fruitsReturn = restTemplate.postForObject(
				SERVER_URI+AppURIContants.POST_FRUIT, fruits, List.class);
		
		System.out.println("Testing No of Fruit update : " + fruitsReturn.size());
		
	}
	
	private static void testAddFruits() {
		
		System.out.println("testing add fruit...........");
		RestTemplate restTemplate = new RestTemplate();
		
		List<Fruit> fruits = new ArrayList(1);
		Fruit temp = new Fruit("Apple", 0.40f, 20, new Date());
		fruits.add(temp);
		
		restTemplate.put(SERVER_URI+AppURIContants.POST_FRUIT, fruits);
	}
	
	private static void testGetFruits() {
		System.out.println("testing get all fruit(s)...........");
		RestTemplate restTemplate = new RestTemplate();
		
		List<Fruit> fruitsReturn = restTemplate.getForObject(
				SERVER_URI+AppURIContants.GET_ALL_FRUIT, List.class);
		
		System.out.println("Testing No of Fruit update : " + fruitsReturn.size());
		
	}

}
