package List_Interface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linked_List {

public static void main(String[] args) {
	

	LinkedList<String> mylist = new LinkedList<>();
 
 
 mylist.add("Shubham");
 mylist.add("Dev");
 mylist.add("Boby");
 mylist.add("Aman");
 mylist.add("Chinmay");
 mylist.add("Ayush");
 mylist.add("Aatish");
 mylist.add(null);
 mylist.add("Aatish");
 mylist.add(null);
 mylist.set(5, "Devashish");
 
 
 
System.out.println(mylist);

System.out.println(mylist.get(4));



/*
  POINTS TO BE REMEMBER ABOUT LINKEDLIST
  
  0.CHILD OF LIST INTERFACE AND QUEUE INTERFACE(DEQUEUE INTERFACE)
  1.order of insertion is maintain
  2.store the element on doubly LinkedList data structure
  3.null value is allowed
  4.store duplicate element
  5.size is DYNAMIC
  6.Non-thread safe
  7.linkedList also implements(child of) DEQUE interface.
  
  




THERE ARE TOTAL SIX METHOD FOR TRAVERSING IN LINKEDLIST 
	1.using an iterator
	2.using a for loop 
	3.using a for-each loop (ONLY SUPPORTED TYPE SAFE COLECTION)
	4.using a while loop
	5.using the ListIterator class
	6.using the forEach() method
	7.we can traverse both type safe or unType safe of collections    
	*/


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


  
  for(String el : mylist) {
	  System.out.println(el);
  }

  
  System.out.println("----------------------Iterator----------------------");	
  
  /* 1.using an iterator
   
   for traversing through iterator first 
   we have gain the object of iterator 
   from collection interface
   and after store into any variable 
   we can only traversing in forward direction (left to right) */
   
    Iterator<String> itr1 = mylist.iterator();
    //  here hasNext is method which check that the element is null 
    //  or present    
    while(itr1.hasNext()) {
    	System.out.println(itr1.next());
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
  //   we have to pass the size of LINKEDLIST while creating the listIterator (in constructor)
   
       ListIterator<String> lit2 = mylist.listIterator(mylist.size());
       
//      hasPrevious is method of listIterator
//      which start traversing from last index 
//      to first 
    
        while(lit2.hasPrevious()) {
        	System.out.println(lit2.previous());
        }
   
      
      System.out.println("----------------------For-Each Method----------------------");    
    
  /*    6.using the forEach() method  (JAVA 8 FEATURE)
      
      here we use lambda Expression for traversing
      we can give any name for e */   
      
      mylist.forEach(e->{
    	 
     if (e!=null) {
     StringBuffer el = new StringBuffer(e);
     System.out.println(el+"       \t name length  is  "+el.length()+"      reverse order ---> "+el.reverse() );
	} else {
		System.out.println("Null value Found");
	}   	
    	 
    	 
    	 
      });
      
      
      LinkedList<Integer> myList3 = new LinkedList<>();
      
      myList3.add(4);
      myList3.add(30);
      myList3.add(8);
      myList3.add(2);
      myList3.add(3);
      myList3.add(6);
      myList3.add(10);
      myList3.add(20);
      myList3.add(1);
      myList3.add(8);
      myList3.add(2);
      myList3.add(6);
      
      
      
   
//      System.out.println(myList3);
  
     
      
      
      System.out.println("----------------------For-Each Method (NON-TYPE SAFE)----------------------");
      
      
      LinkedList list4 = new LinkedList<>();
      
      list4.add("MATH");
      list4.add(5.89);
      list4.add(8);
      list4.add(23238238239239l);
      list4.add(true);
      list4.add('B');
      
      
      list4.forEach(el->{
    	  System.out.println(el);
      });
      
  
  
  
  

	
	
	
	
	
	
	
}	
	
	

	
	
	
	
	
	
	
}
