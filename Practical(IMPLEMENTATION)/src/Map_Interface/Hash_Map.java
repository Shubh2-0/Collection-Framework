package Map_Interface;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class Hash_Map {

private static final BiConsumer<? super Integer, ? super String> Integer = null;

public static void main(String[] args) {
	

HashMap<Integer, String> map1 = new HashMap<>();


map1.put(1, "Shubham");
map1.put(2, "Aman");
map1.put(3, "Chinmay");
map1.put(4, "Harshit");


System.out.println(map1);


/*
    POINTS TO BE REMEMBER ABOUT HASHMAp
    
    0.EXTENDS FROM ABSTRACTMAP(CLASS) , ABSTRACTMAP IMPLEMENTS (CHILD OF) MAP 
    1.order of insertion is not maintain
    2.STORE ONE DATA(OBJECT) IN THE FORM OF KEY VALUE PAIR
    3.keys are unique 
    4.value can be duplicate or same
    5.if any key are already exist in hashMap then UPDATE with new one  
    
    
THERE ARE THREE METHODS FOR TRAVERSING IN HASHMAP 
1.using a for-each loop  (ONLY SUPPORTED TYPE SAFE COLECTION) by using of Map.Enrty method
2.using the forEach() method  
*/


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
is called AUTO UNBOXING 
here we also use MAP.ENTRY 
because they converted the element into set
*/
for(Map.Entry<Integer, String> el : map1.entrySet()) {
	System.out.println(el.getKey()+"  ---->   "+el.getValue());
}



  
  System.out.println("----------------------For-Each Method----------------------");    

/*    2.using the forEach() method  (JAVA 8 FEATURE)
  
  here we use lambda Expression for traversing
  we can give any name for e1,e2
  (e1,e2) is one pair (object) for hashmap
  e1 for key
  e2 for value  
  */   
  
  
map1.forEach((e1,e2)->{
	System.out.println(e1+" -> "+e2);
});
  


System.out.println("----------------------SOME METHOD OF HASHMAP----------------------");


System.out.println("Contains Method ->  " + map1.containsKey(1));
System.out.println("Get Method ->  " + map1.get(2));
System.out.println("IsEmpty Method ->  "+map1.isEmpty());
System.out.println("Put Mathod ->  "+map1.put(5, "Jayant")  );
System.out.println("Contains Value Method ->  "+ map1.containsValue("Shubham"));
System.out.println("Contains Key Method ->  "+ map1.containsKey(1));
System.out.println("Remove Method ->  " + map1.remove(3));
//map1.clear();
//map1.keySet();

   
   
   





	
	
}
	
	
	
	
	
}
