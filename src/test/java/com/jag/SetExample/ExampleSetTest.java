package com.jag.SetExample;

import static org.junit.Assert.*;

import java.util.Hashtable;

import org.junit.Test;

public class ExampleSetTest {

	@Test
	public void add_returnsTrueWhenObjIsAdded(){
		Hashtable<Object, Object> hashtable= new Hashtable<>();
		ExampleSet exampleSet = new ExampleSet();
		String jag = "jag";
		boolean actualResult = exampleSet.add(jag);
		assertEquals(actualResult, true);	
	}
	
	@Test
	public void add_returnsFalseWhenObjectIsAlreadyPresent(){
		Hashtable<Object, Object> hashtable= new Hashtable<>();
		ExampleSet exampleSet = new ExampleSet();
		String jag = "jag";
		exampleSet.add(jag);
		boolean actualResult = exampleSet.add(jag);
		assertEquals(actualResult, false);
	}
	
	@Test
	public void add_returnsFlaseWhenNullValueIsAdded(){
		Hashtable<Object, Object> hashtable= new Hashtable<>();
		ExampleSet exampleSet = new ExampleSet();
		boolean actualResult = exampleSet.add(null);
		assertEquals(actualResult, false);
	}
	
	@Test
	public void contains_returnsTrueWhenObjectIsAlreadyPresent(){
		Hashtable<Object, Object> hashtable= new Hashtable<>();
		ExampleSet exampleSet = new ExampleSet();
		String jag = "jag";
		exampleSet.add(jag);
		boolean actualResult = exampleSet.contains(jag);
		assertEquals(actualResult, true);
	}
	
	@Test
	public void contains_returnFlaseWhenObjectIsNotPresent(){
		Hashtable<Object, Object> hashtable= new Hashtable<>();
		ExampleSet exampleSet = new ExampleSet();
		String jag = "jag";
		boolean actualResult = exampleSet.contains(jag);
		assertEquals(actualResult, false);
	}
	
}
