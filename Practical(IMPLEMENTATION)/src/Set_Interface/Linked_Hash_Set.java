package Set_Interface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Linked_Hash_Set {


public static void main(String[] args) {
	
	
LinkedHashSet<Integer> link1 = new LinkedHashSet<>();


link1.add(1);
link1.add(6);
link1.add(90);
link1.add(2);
link1.add(5);
link1.add(0);
link1.add(70);
link1.add(7);
link1.add(9);
link1.add(14);
link1.add(61);
link1.add(3);
link1.add(null);

System.out.println(link1);


 /*
    POINTS TO BE REMEMBER ABOUT LINKEDHASHSET
    
    1.store only unique elements
    2.order of insertion is maintain
    3.size is DYNAMIC
    4.we can not access the elements by index (not index-basing collection)
    5.if we want to access elements of hashSet so first we have to converted into arrayList 
    6.we can traverse both type safe or unType safe of collections
    7.it extends (child of) HASHSET class  
    
    




THERE ARE TOTAL SIX METHOD FOR TRAVERSING IN LINKEDLIST
                
1.using a for-each loop (ONLY SUPPORTED TYPE SAFE COLECTION)
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

for(Integer el : link1) {
	System.out.println(el);
}



System.out.println("----------------------Iterator----------------------");	

/* 2.using an iterator

for traversing through iterator first 
we have gain the object of iterator 
from collection interface
and after store into any variable 
we can only traversing in forward direction (left to right) */
   
 Iterator<Integer> itr1 = link1.iterator();
   

//here hasNext is method which check that the element is null 
//or present
 
 
 while(itr1.hasNext()) {
	 System.out.println(itr1.next());
 }
 





System.out.println("----------------------For-Each Method----------------------");    

/*    3.using the forEach() method  (JAVA 8 FEATURE)

here we use lambda Expression for traversing
we can give any name for e */   

 
link1.forEach(el->{
	System.out.println(el);
});




 
System.out.println("----------------------For-Each Method(UNTYPE SAFE)----------------------");


//we can also create NON-TYPE SAFE linkedHashSet 
 
LinkedHashSet link2 = new LinkedHashSet<>();

link2.add("Shubham");
link2.add(11);
link2.add(6232133187l);
link2.add(59.7);
link2.add(true);
link2.add("Blue");

link2.forEach(el->{
	System.out.println(el);
});







	
	
	
	
	
}	
	
	
}
