package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleListTest {

	@Test
	public void newAddTest() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		if(testList.count <= 10) {
			fail("Array is not adding extra space");
		}
		
	}
	
	@Test
	public void newRemoveTest() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.remove(1);
		testList.remove(1);
		testList.remove(1);
		testList.remove(1);
		if(testList.count > 7) {
			fail("Array is not getting smaller when there is empty space");
		}
	}
	
	@Test
	public void appendTest() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.append(2);
		if(testList.count <= 10) {
			fail("Array is not getting larger to append new element");
		}
	}
	
	@Test
	public void firstTest() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.remove(3);
		if(testList.first() != 2) {
			fail("First function not properly returning the first real value");
		}
	}
	
	@Test
	public void sizeTest1() {
		SimpleList testList = new SimpleList();
		if(testList.size() != 0) {
			fail("Size function not accounting for empty elements");
		}
	}
	
	@Test
	public void sizeTest2() {
		SimpleList testList = new SimpleList();
		if(testList.size() != 0) {
			fail("Size function not accounting for empty elements");
		}
	}

}
