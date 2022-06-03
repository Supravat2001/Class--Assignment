package BasicPrograms;

import java.util.Scanner;

public class Pettern2 {
	public static void main(String[] args ) {

	int  x,i,j; //declearing variables
	System.out.println(" Enter limit upto do you want to print");
	Scanner sc=new Scanner(System.in); //creating object class for scanner class 
	x=sc.nextInt(); //taking limit upto pettern will print
	//pritning pettern
	for(i=1;i<=x;i++) {
		
	for(j=i;j>=1;j--) {
		
		System.out.print("*");
	}
	System.out.println("");
		
		
	}
	
	

}}