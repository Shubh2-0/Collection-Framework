package List_Interface;

import java.lang.reflect.Method;
/* here we import java.util package because 
   all the classes that we 
   are going to are in this package */
import java.util.*;

import javax.lang.model.util.Elements;

public class Main {

	
public static void main(String[] args) {
	

/*
  we can create collection by two ways method (procedure)
 
  1. TYPE SAFE : same type of elements (objects) are SS
                 added to the collection. only one type of 
                 objects we can store in type safe collections'
                 FOR EXAMPLE : if we store INTEGER type of 
                 objects so here we only store that kind
                 of objects whose type is integer.
  
  
  
  2. UN TYPE SAFE (NON-TYPE SAFE) : different types of elements we can 
                                    store in un_type safe collection.
  

 */
	
	

//	TYPE_SAFE_COLLECTION :-
	
//	<> (Diamond Operator)

	List<String> name = new ArrayList<>();
	
//	ADD is Method in which we can add (insert) data in ArrayList
	name.add("Shubham");
	name.add("Rohan");
	name.add("Varun");
	name.add("Dev");
 //	name.add(7); WRONG 
 //LINE NUMBER 48 ERROR MESSAGE ->The method add(int, String) in the type 
 //	ArrayList<String> is not applicable for the arguments (int)
	
	System.out.println(name);
//  OUTPUT :	[Shubham, Rohan, Varun, Dev]
    
//	DUPLICATE ELEMENTS ARE ALLOWED 
	name.add("Dev");
	name.add("Shubham");
	name.add("Jayant");
    
//	after inserting duplicate 
//	OUTPUT : [Shubham, Rohan, Varun, Dev, Dev, Shubham, Jayant]
	
	
//	INDEX BASE IMPLEMENTATION OR COLLECTION (WE CAN ACCESS THE ELEMENT BY INDEX)
	String n = name.get(0);
//	System.err.println(n); 
	
//	remove element by index
	name.remove(0);
	
//	remove element by object name itself 
	name.remove("Dev");
	
//	to know the size of the arraylist
   int size = name.size(); 
	
	System.out.println(name);
	
//	for each loop for traverce the arraylist
	for(String el : name) {
		System.out.println(el);
	}
	
	
	
	
//	if WeakHashMap storeHashMap different type Elements
//	inElements type Safe collection so they throw
//	COMPILE TIME ERROR
	
//	UN_TYPE_SAFE_COLLECTION :-
	
	LinkedList list = new LinkedList<>();
	
//	here we add multiple type of data which have different-different 
//	data types 
	Scanner sc = new Scanner(System.in);
	list.add(1);
	list.add("Subham");
	list.add(true);
	list.add(4.56);
	
//	if we store long value in arraylist so we 
//	have to append L or l in the last of the number 
	list.add(6232133187l);
	list.add("hello");
	list.add('g');
	list.add(3.53233434);
//	list.add(sc);
	list.add(false);
	
//	LinkedList is also allowed duplicate elements
	list.add('g');
	list.add("hello");
	
	
//	same as arraylist we can remove elements in
//	LinkedList
	list.remove(0);
	list.remove("Subham");
	list.remove(true);
	
//	contains method check whether the passing 
//	object is available or not 
	
//	they basically call the equals method for checking
	System.out.println(list.contains(0)); 
			
//	here same as arraylist we can access the 
//	element in linkedlist
//	with the help of index
   System.out.println(list.get(3));
	
   
//   check whether the collection is empty or not
   System.out.println(list.isEmpty());
	
	System.out.println(list);
//	OUTPUT : [1, Subham, true, 4.56, 6232133187, hello, g, 3.53233434, false, g, hello]
	
//	list.clear();
//     list.set(0, "Shubham");
//     list.set(0, "ja");
//    System.out.println(list.iterator()); J
	
//	Differenece Between ADD and SET Method ?
//     
//	basically set method remove the current element and replace 
//	that with passing object but in other hand add method 
//	add the element on the passing index and shift that index element 
//	to the next index
	
	
	
			
	
	
     list.add(0, "Shubham");
    System.out.println(list);
	
    
    
    
    Vector<String> v = new Vector<>();
        v.addAll(list);
	
    System.out.println(v);
    
    
    
    LinkedList<Integer> n1 = new LinkedList<>();
    
    int h = 5;
    while(h>0) {
    	n1.add(h);
    	h--;
    }
//	
//    System.out.println(n1);
//    for(Integer el : n1) {
//    	System.out.println(el);
//    }
	
	
   Stack<Integer> stack = new Stack<>();
   
   stack.push(23);
   stack.push(45);
   stack.push(67);
   stack.push(89);
   
   System.out.println(stack.peek());
   
   
   Set<Integer> myset = new HashSet<>();
   
   int h1 = 5;
//  while(h1!=0) {
//	
//	 myset.add(h1);
//	 h1--;
//	  
//  }
  
   int j = 10;
   while(j!=5) {
	   myset.add(j);
	   j--;
   }
   myset.add(0);
   myset.add(-90);
   myset.add(1);
   myset.add(4);
   
  myset.add(2);
   
  
//  System.out.println(myset);
  
  Set<Integer> tr = new TreeSet<>();
  tr.addAll(myset);
  
  System.out.println(tr);
  
  for(Integer el : tr) {
	  System.out.println(el);
  }
  
  
  
  
    
   
    
	
	
	
	
	
	
}	
	
	
	
}
