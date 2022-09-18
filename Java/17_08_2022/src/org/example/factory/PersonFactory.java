package org.example.factory;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.example.model.Person;

public class PersonFactory {
	
	private Scanner scanner=new Scanner(System.in);
	
	public Person createPerson()throws InputMismatchException, InvalidNameException, InvalidAgeException
	{
		System.out.println("Id: ");
		int id=scanner.nextInt();
		System.out.println("Name: ");
		String name=scanner.next();
		if(name.length()<5)
		{
			throw new InvalidNameException ("Name must contain atleast 5 characters");
		}
		System.out.println("Age: ");
		int age=scanner.nextInt();
		if(age<18)
		{
			throw new InvalidAgeException ("age must be atleast 18");
		}
		return new Person(id, name, age);
		
	}
}
