package org.example.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.example.Bird;
import org.example.collection.model.Employee;
import org.example.collection.model.PriceComparator;
import org.example.collection.model.Product;
import org.example.collection.model.SalaryComparator;

public class App {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(1);
		set.add(30);
		//printing entire set
		/*System.out.println(set);
		
		//Retrieving individual values
		Iterator<Integer> i=set.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
		
		//using enhanced for loop
		for(Integer s:set)
		{
			System.out.println(s);
		}
		
		set.forEach(MyClass::display);
		*/
		
		/*
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(-9);
		list.add(2);
		list.add(0);
		System.out.println(list);
		list.forEach(System.out::println);
		*/
		/*
		Map<Integer, String> map=new HashMap<Integer,String>();
	    map.put(1, "Sachin");
	    map.put(2, "John");
	    map.put(3, "Marry");
	    map.put(3, "Sourav");
	    System.out.println(map);
	    
	    Collection<String> collection= map.values();
	    System.out.println(collection);
	    collection.forEach(System.out::println);
	    
	    Set<Integer> set1= map.keySet();
	    System.out.println(set1);
	    set1.forEach(System.out::println);
	    
	    Set<Entry<Integer, String>> set2= map.entrySet();
	    System.out.println(set2);
	    set2.forEach(System.out::println);
	    */
		
		/*
		Set<Integer> s=new TreeSet<Integer>();
		s.add(10);
		s.add(1);
		s.add(19);
		s.add(-8);
		s.forEach(System.out::println);
		
		Comparator<Employee> comparator=new SalaryComparator();
		Set<Employee> employee=new TreeSet<Employee>(comparator);
		
		Set<Employee> employees=new TreeSet<Employee>();
		employees.add(new Employee(1,"John",10000));
		employees.add(new Employee(2,"Sourabh",30000));
		employees.add(new Employee(3,"Rahul",13000));
		employees.add(new Employee(4,"Vedang",20000));
		employees.forEach(System.out::println);
		*/
		
		Comparator<Product> comparator=new PriceComparator();
		Set<Product> product=new TreeSet<Product>(comparator);
		
		Set<Product> products=new TreeSet<Product>();
		products.add(new Product(12,"Oven",20000));
		products.add(new Product(13,"Fan",2500));
		products.add(new Product(14,"TV",25000));
		products.add(new Product(15,"Fridge",26000));
		products.add(new Product(16,"Washing Machine",23000));
		products.forEach(System.out::println);
	}
}
