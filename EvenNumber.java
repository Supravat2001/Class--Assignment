package BasicPrograms;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args)
	{
		//Declaring variables
		int i,x;
		Scanner sc=new Scanner(System.in); //creating object for scanner class
		System.out.println(" enter limit you want to see even number ");
       x=sc.nextInt(); //taking input form user 
		
		for (i=1; i<=x; i++){ // to print even number upto limit 
		
		
		if(i%2==0) //checking even or not 
		{
			System.out.println(i);
		}
	}

}}
