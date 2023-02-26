package Set_Interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Hash_Set {
	
	

public static void main(String[] args) {

	

HashSet<Integer> myset = new HashSet<>();

myset.add(11);
myset.add(3);
myset.add(40);
myset.add(2);
myset.add(7);
myset.add(5);
myset.add(9);
myset.add(10);
myset.add(76);
myset.add(null);

System.out.println(myset);


/*
    POINTS TO BE REMEMBER ABOUT HASHSET	
    
    0.CHILD OF SET INTERFACE
    1.store only unique elements
    2.order of insertion is not maintain
    3.size is DYNAMIC
    4.store the elements in random order
    5.we can not access the elements by index (not index-basing collection)
    6.if we want to access elements of hashSet so first we have to converted into arrayList 
    7.we can traverse both type safe or unType safe of collections  
    8.we can store NULL also
    
    
THERE ARE TOTAL THREE METHOD FOR TRAVERSING IN HASHSET 
1.using a for-each loop  (ONLY SUPPORTED TYPE SAFE COLECTION)
2.using an iterator
3.using the forEach() method    */


System.out.println("----------------------For-Each Loop----------------------");

/*	1.using a for-each loop

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


for(Integer el : myset) {
	System.out.println(el);
}




System.out.println("----------------------Iterator----------------------");	

/* 2.using an iterator

for traversing through iterator first 
we have gain the object of iterator 
from collection interface
and after store into any variable 
we can only traversing in forward direction (left to right) */

 Iterator<Integer> itr1 = myset.iterator();
 

//here hasNext is method which check that the element is null 
//or present
 
 while(itr1.hasNext()) {
	 System.out.println(itr1.next());
 }
 
 

  
  System.out.println("----------------------For-Each Method----------------------");    

/*    3.using the forEach() method  (JAVA 8 FEATURE)
  
  here we use lambda Expression for traversing
  we can give any name for e */   
  
   myset.forEach(e->{
	   System.out.println(e);
   });  
   
   
   
   System.out.println("----------------------For-Each Method----------------------");  
   
   HashSet myset2 = new HashSet<>();
   
   ArrayList<Integer>ar1 = new ArrayList<>();
   ar1.add(1);
   ar1.add(5);
   
   myset2.add(1);
   myset2.add("Shubham");
   myset2.add(62321331987l);
   myset2.add(5.8);
   myset2.add(true);
   myset2.add(39.54f);
   myset2.add(ar1);
   myset2.add("End");
   
  
   
   
   myset2.forEach(e->{
	  System.out.println(e);
   });
   
   
   
   
  
  
  








	
	
	
}	
	


}
