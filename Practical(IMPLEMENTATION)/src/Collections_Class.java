import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Collections_Class {
	
public static void main(String[] args) {
	
/*
 this class is for collection classes
 in this class we have some method which we use in our 
 collection object 
 */
	
	
ArrayList<Integer> arr1 = new ArrayList<>();
arr1.add(1);
arr1.add(1);
arr1.add(1);
arr1.add(1);
arr1.add(11);
arr1.add(1);
arr1.add(3);
arr1.add(4);
arr1.add(3);
arr1.add(6);
arr1.add(7);
arr1.add(8);
arr1.add(0);




System.out.println(arr1);

System.out.println(Collections.min(arr1));
System.out.println(Collections.max(arr1));
System.out.println(Collections.frequency(arr1, 1));
	
	

Collections.sort(arr1);	
	
System.out.println("Sort (LOW TO HIGH)  -> "+arr1);

Collections.sort(arr1, Comparator.reverseOrder());

System.out.println("Sort (HIGH TO LOW)  -> "+arr1);


}	
	
	

}
