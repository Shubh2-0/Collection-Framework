package List_Interface;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StacK {

public static void main(String[] args) {
	

	
	Stack<Integer> mystack = new Stack<>();
	
	
	mystack.push(null);
	mystack.push(2);
	mystack.push(6);
	mystack.push(10);
	mystack.push(3);
	mystack.push(7);
	mystack.push(90);
	mystack.push(2);
	mystack.push(null);
	mystack.push(0);
	mystack.push(5);
	mystack.push(1);
	
	System.out.println(mystack);

	
	
	/*
	  POINTS TO BE REMEMBER ABOUT Stack
	  
	
	  1.it extends (child of) VECTOR(class)
	  2.order of insertion is maintain
	  3.special type of traversing method we can say that tool that is ENUMERATION(Because of their parent have)
	  4.size is DYNAMIC
	  5.we can access value and elements by using indexes
	  6.store null value 
	  7.special method such as peek , pop , push
	  8.follow LIFO (LAST IN FIRST OUT)  and   FILO (FIRST IN LAST OUT)
	    
	    
	   



	THERE ARE TOTAL SEVEN METHOD FOR TRAVERSING IN STACK 
	1.using an iterator
	2.using a for loop
	3.using a for-each loop (ONLY SUPPORTED TYPE SAFE COLECTION)
	4.using a while loop
	5.using the ListIterator class
	6.using the forEach() method 
	7.using the Enumeration  */


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

	for(Integer el : mystack) {
		System.out.println(el);
	}


	System.out.println("----------------------Iterator----------------------");	

	/* 1.using an iterator

	for traversing through iterator first 
	we have gain the object of iterator 
	from collection interface
	and after store into any variable 
	we can only traversing in forward direction (left to right) */

	Iterator<Integer> itr1 = mystack.iterator();

	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}


	//  here hasNext is method which check that the element is null 
	//  or present


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
	//   we have to pass the size of STACK while creating the listIterator (in constructor)

	   ListIterator<Integer> itr2 = mystack.listIterator(mystack.size());
	   
	   
	   while(itr2.hasPrevious()) {
		   System.out.println(itr2.previous());
	   }
	   
	   
	//  hasPrevious is method of listIterator
	//  which start traversing from last index 
	//  to first 

	  
	  System.out.println("----------------------For-Each Method----------------------");    

	/*    6.using the forEach() method  (JAVA 8 FEATURE)
	  
	  here we use lambda Expression for traversing
	  we can give any name for e */   
	  
	   
	  mystack.forEach(e->{
	    
		   if(e==null) {
			   System.out.println("NULL");

		   }else {
			   if (e%2==0) {
					System.out.println(e+"  is Even" );
				}else {
					System.out.println(e+"  is Odd");
				}  
		   }
		   
		  
		   
		   
		   
	   });
	  
	  

	   System.out.println("----------------------Enumeration----------------------");    	 
		
	   Enumeration<Integer> nm = ((java.util.Vector<Integer>) mystack).elements();
	   
	   while(nm.hasMoreElements()) {
		   System.out.println(nm.nextElement());
	   }
	   


	   System.out.println("----------------------SPECIAL METHODS----------------------");  
	     
	
	  System.out.println("pop--->   "+    mystack.pop());
	  System.out.println("peek--->  "+   mystack.peek());
	
	  
	  
	
	
	
	
	
	
	
}	

	
	
	
	
	
	
	
	
	
	

}
