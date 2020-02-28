package cse360assign2;

//Author: Marcus Stilwell
//Class ID: 396
//Assignment: Assignment 2 (Github)

import java.util.Arrays;

public class SimpleList {
	public int[] list = new int [10];
	public int count;
	
	//Constructor method initializes count to 0.
	
	public void SimpleList() {
		count = 0;
	}
	
	//Add method uses newList to create an array that is larger than list if the length
	//of list is less than 10. intIndex tracks the index of the element in the array that
	//is being changed
	
	//Version 1.1 of the add method added the function to increase the size of the list
	//by 50% if the array was full when the user tried to add a new element. The add
	//method was also adjusted to fit the dynamic array better.
	
	public void add(int addInput){
		if(count < list.length-1) {
			int[] newList = new int [list.length+1];
			newList[0] = addInput;
			for(int i = count; i > 0; i--) {
				list[i] = list[i - 1];
			}
			list=newList;
		}
		else{
			int[] newList = new int [(int) (list.length * 1.5)];
			newList[0] = addInput;
			for(int i = 0; i < list.length; i++) {
				newList[i+1] = list[i];
			}
		}
		count++;
	}
	
	//The remove method uses intIndex to track the length of the array. newIndex is used
	//to move the values in the array forward to fill in the empty value left behind when
	//the element removeInput is deleted.
	
	//Version 1.1 of the remove method left the original remove code in place, but added
	//a feature that reduces the size of the list array if it is at least 25% empty.
	
	public void remove(int removeInput) {
		if (count < list.length / 4 * 3) {
			int[] newList = new int [list.length * 4 / 3];
			for(int i = 0; i <newList.length;i++) {
				newList[i] = list[i];
			}
			list = newList;
		}
			for(int intIndex=0;intIndex<list.length-1;intIndex++) {
				if(list[intIndex] == removeInput) {
					for(int newIndex=intIndex;newIndex<list.length-1;newIndex++) {
						list[newIndex] = list[newIndex+1];
					}
				}
			}
			count--;
	}
	
	public int count() {
		return count;
	}
	
	//To string turns the values in list to a string. displayString is the where the
	//string is stored. intIndex is used to cycle through the array.
	
	public String toString() {
		String displayString = "";
		if(list.length != 0) {
			for(int intIndex : list) {
				String newInt = Integer.toString(intIndex);
				displayString += newInt;
				if(intIndex<list.length) {
					displayString += " ";
				}
			}
		}
		return displayString;
	}
	
	//The search method uses intIndex to cycle through list until searchInput is found.
	//If search input is not found, the method returns -1.
	
	public int search(int searchInput) {
		for(int intIndex=0;intIndex<count;intIndex++) {
			if(list[intIndex] == searchInput) {
				return intIndex;
			}
		}
		return -1;
	}
	
	
	//The following code is my way of coding in an IDE to make the requested methods, but
	//I am not sure where they are supposed to go


	public void append(int appendInt){
		if(count < list.length-1) {
			list[count + 1] = appendInt;
		}
		else {
			int[] newList = new int[(int) (list.length * 1.5)];
			for(int countIterator = 0; countIterator < count; countIterator++) {
				newList[countIterator] = list[countIterator];
			}
			list = newList;
			list[count] = appendInt;
			count++;
		}
	}
	
	//This function returns the first element in the array.
	public int first() {
		for(int indexOfArray: list) {
			if(list[indexOfArray] != 0) {
				return list[indexOfArray];
			}
		}
		return -1;
	}
	
	//Because an array index cannot be empty, I checked to see if the value at the
	//index was 0 because that is the default value.
	
	//numOfelements is an integer that keeps track of all of the non zero elements in 
	//the array.
	// iterator keeps track of the place in the array, and list is the simplelist 
	//created earlier in the program.
	public int size() {
		int numOfElements = 0;
		for(int iterator = 0; iterator < list.length; iterator++) {
			if(list[iterator] != 0) {
				numOfElements++;
			}
		}
		return numOfElements;
	}
}
















