package List_Interface;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array_List {


public static void main(String[] args) {
	
	ArrayList<Integer> arr = new ArrayList<>();	
	
//	ADDING ELEMENT IN ARRAYLIST
	arr.add(null);
	int num = 1;
	while(num < 11) {
		arr.add(num);
		num++;
	}
	
	System.out.println(arr);

	
	
	
	
/*
 POINTS TO BE REMEMBER ABOUT ARRAYLIST :-
 
  0.CHILD OF LIST INTERFACE
  1.index basing storing 
  2.order of insertion is maintain
  3.access element by their name , index
  4.we NULL value in arrayList
  5.we can use reference variable of their interface
  6.size is DYNAMIC
  7.Non-thread safe
   
   
   
   
 THERE ARE TOTAL SIX METHOD FOR TRAVERSING IN ARRAYLIST 
	1.using an iterator
	2.using a for loop
	3.using a for-each loop (ONLY SUPPORTED TYPE SAFE COLECTION)
	4.using a while loop
	5.using the ListIterator class
	6.using the forEach() method */
	
	System.out.println("----------------------For-Each Loop----------------------");
	
/*	3.using a for-each loop
	
	here we use wrapper class because 
	collection are only store objects
	and wrapper class is the representation 
	of primitives data type like int , char and so on
	
	when we add primitive data type
	in collections they automatically 
	converted into their respective Wrapper class
	and this process is called AUTO BOXING
	
	and we access or use the element 
	that are converted into their 
	respective Wrapper class they 
	automatically converted into
	their original data type that is
	primitive data type and this process
	is called AUTO UNBOXING */
	
	
	
	for(Integer el : arr) {
		System.out.println(el);
	}
	
	
	
	List<String> names = new ArrayList<>();
	
	names.add("Shubham");
	names.add("Dev");
	names.add("Boby");
	names.add("Guarav");
	names.add("Aman");
	names.add("Chinmay");
	names.add("Parth");
	names.add("Atul");
	names.add("Brijesh");
	names.add("Akash");
	names.set(0, "parul");
//	names.add(null);  
//	names.get(num);

	System.out.println("----------------------For-Each Loop----------------------");
	
  	
 for(String el : names) {

 StringBuffer s = new StringBuffer(el);
 
 System.out.println(s+"\t"+"   name Size is  "+s.length()+"      reverse ->     "+s.reverse());
	 
	 
 }
	
 System.out.println("----------------------Iterator----------------------");	
 
/* 1.using an iterator
 
 for traversing through iterator first 
 we have gain the object of iterator 
 from collection interface
 and after store into any variable 
 we can only traversing in forward direction (left to right) */
 
  Iterator<String>  it = names.iterator();
  
  
//  here hasnext is method which check that the element is null 
//  or present
  while(it.hasNext()) {
	  String g = it.next();
	  System.out.println(g);
  }
 
System.out.println("----------------------ListIterator(Backward Direction)----------------------");	
 
/*	5.using the ListIterator class
  
  by using ListIterator we can traverse in both direction 
  from left to right(forward) 
  from right to left(backward) 
  parent interface of ListIterator is iterator
  */
  
//   here listIterator is method 
//   which gain the listIterator Object
//   and after we have to use size method
//   we have to pass the size of arraylist while creating the listIterator (in constructor)
 
    ListIterator<String> it2  = names.listIterator(names.size());
     
//    hasPrevious is method of listIterator
//    which start traversing from last index 
//    to first 
    while(it2.hasPrevious()) {
    	System.out.println(it2.previous());
    }
 
    
    System.out.println("----------------------For-Each Method----------------------");    
  
/*    6.using the forEach() method  (JAVA 8 FEATURE)
    
    here we use lambda Expression for traversing
    we can give any name for e */   
    
   names.forEach(e->{
	   System.out.println(e);
   });
   
   
   
   List<Integer> arr2 = new ArrayList<>();
   
   arr2.add(34);
   arr2.add(4);
   arr2.add(354);
   arr2.add(44);
   arr2.add(40);
   arr2.add(4);
   arr2.add(3);
   
//   System.out.println(arr2);
   
   
   
   
    
	
	
	
	
	
	
	
	
	
}	

	



	
	
	
	
	
	

}
