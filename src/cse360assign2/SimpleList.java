package cse360assign2;

//Author: Marcus Stilwell
//Class ID: 396
//Assignment: Assignment 2 (Github)

import java.util.Arrays;

public class SimpleList {
	public int[] list;
	public int count;
	
	//Constructor method initializes count to 0.
	
	public void SimpleList() {
		count = 0;
	}
	
	//Add method uses newList to create an array that is larger than list if the length
	//of list is less than 10. intIndex tracks the index of the element in the array that
	//is being changed
	
	public void add(int addInput){
		if(list == null){
			list = new int[1];
			list[0] = addInput;
		}
		else if(list.length <= 9) {
			int[] newList = new int [list.length+1];
			newList[0] = addInput;
			for(int i=0;i<list.length;i++) {
				newList[i+1] = list[i];
			}
			list=newList;
		}
		else{
			for(int intIndex=list.length-1;intIndex>1;intIndex--) {
				list[intIndex] = list[intIndex]-1;
				list[0] = addInput;
			}
		}
		count++;
	}
	
	//The remove method uses intIndex to track the length of the array. newIndex is used
	//to move the values in the array forward to fill in the empty value left behind when
	//the element removeInput is deleted.
	
	public void remove(int removeInput) {
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
	
}
