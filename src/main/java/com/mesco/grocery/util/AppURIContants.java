package com.mesco.grocery.util;

public interface AppURIContants {
	
	public static final String GET_DUMMY_FRUIT = "/rest/fruits/dummy";
    public static final String GET_FRUIT = "/rest/fruits/{name}"; // retrieve by name
    public static final String GET_ALL_FRUIT = "/rest/fruits"; // retrieve all fruits
    public static final String PUT_FRUITS = "/rest/fruits"; // add/create fruits
    public static final String POST_FRUIT = "/rest/fruits"; // update fruit price

}
