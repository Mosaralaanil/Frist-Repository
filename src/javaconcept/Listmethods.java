package javaconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Listmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();  
          
	//	1> add()
		list.add("Anil");
		list.add("ramu");
		list.add("raju");
		list.add("Arun");
		list.add("ravi");
		System.out.println(list);
	// add all()
		System.out.println(list.addAll(list));
	// 2> Contains()---> is to verify the element to be present inside the list
		System.out.println(list.contains("ramu"));
	// 3> get()----> is used to getting the particular using index
		System.out.println(list.get(3));
	// 4> remove()----> is used to remove the particular using index
		list.remove(3);
	   System.out.println(list);
	// 5> Add(index,obj)----->used to insert the specified element at the given index in the current list 
	    list.add(0, "Sony");
	    System.out.println(list);
	   // Add(index,obj)-----> is the to add the value at the index
	    list.set(3, "sai");
	// 6> indexof()-----> it will give the index of object/element
	    System.out.println(list.indexOf(50) );
	// size()-----> the size of list
	    System.out.println(list.size());
	// 7> iterator method
	    Iterator itr = list.iterator();
	    while(itr.hasNext()) // hashnext()----> it will verify the obj is process at not on list and iterate
	    {
	    	System.out.println(itr.next()); //next()-----> it will give value of the obj
	    }
	// clear() -----> the used to remove all of the elements from the List
	    list.clear();
	    System.out.println(list);
	// isEmpty-----> it will give the list is empty
	    System.out.println(list.isEmpty());
	    
	// set methdos    
	    
	    Set set = new TreeSet();
	    set.add(10);
	    set.add(20);
	    set.add(30);
	    set.add(40);
	    set.add(50);
	    set.add(60);
	    System.out.println(set);
	    // addAll(collection)	
	    System.out.println(set.addAll(set));
	   // Contains()
	    System.out.println(20);
	  // remove()
        set.remove(50);
      // remove all()
        set.removeAll(set);
      //  retainAll()
        set.retainAll(set);
      // size()  
        System.out.println(set.size());
      // clear()
        set.clear();
        System.out.println(set);
      // is empty()
        System.out.println(set.isEmpty());
        
        
      
	} 

}
