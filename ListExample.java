package com.ListJava;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public void getFruitsName() {
		
		  List<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");
	      list.add("Papaya");    
	      list.add("DragonFruit"); 
	      /*list.add(22);*/       //It will not execute, as its integer value.
	      
	      //Printing the list object   
	      System.out.println("Fruits are: "+list.toString());
	      System.out.println("Chosen Fruit is : "+list.get(2));
	      System.out.println("Removed Fruit is : "+list.remove(1));
	      System.out.println("Fruits are: "+list.toString());
	      System.out.println("Total fruit count is: "+list.size());
	      System.out.println("Fruit added: "+list.add("Pineapple"));
	      System.out.println("After addition Fruits are: "+list.toString());
	      System.out.println("Fruits HashCode is: "+list.hashCode());
	      System.out.println("Mango is Present in Array: "+list.contains("Mango"));
	      System.out.println("JackFruit is Present in Array: "+list.contains("JackFruit"));
	      
	      
	      
	      
	 }  
	}

