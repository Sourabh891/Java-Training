package org.example;

import java.util.InputMismatchException;

import java.util.Scanner;

import org.example.factory.InvalidNameException;

import org.example.factory.InvalidAgeException;
import org.example.factory.PersonFactory;
import org.example.model.Person;

public class App {

	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args)  {
		/*try
		{
			 Person person=null;
	         System.out.print("enter id: ");
	         int id=scanner.nextInt();
	         System.out.println("enter name: ");
	         String name=scanner.next();
	         person.setPersonId(id);
	         person.setPersonName(name);
	            
		} catch (NullPointerException| InputMismatchException |ArrayIndexOutOfBoundsException e) {
            System.err.println("exception occured..");
            //e.printStackTrace();
        }
        */
		
		PersonFactory factory=new PersonFactory();
		
		try {
			
			factory.createPerson();
		
		}catch (InputMismatchException|InvalidAgeException|InvalidNameException e)
		{
			
			System.err.println(e.getMessage());
			
		}

	}

}
