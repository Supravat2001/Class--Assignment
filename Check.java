package BasicPrograms;

import java.util.Scanner;

public class Check {
	public void FindMax(int x, int y, int z) //creating method to check which number is greatest 
	{
		if(x>y) //t
		{
		  if (x>z) //t
		  { 
			  System.out.println("x :is greater");
		  }
		  else 
		  {
			  System.out.println("z : is greater");
		  }
		}//external if
		else {
		if(y>z)
		{
			System.out.println("y : is greater");
		}
		else 
		{
			System.out.println("z : is greater");
		}
		
		}
	}
		
		public static void main(String [] args) {
			int a,b,c; // declearing variables
			System.out.println("Grade check "); //creating object for scanner 
			Scanner sc=new Scanner(System.in);//creating object of scanner
		//taking input from user 
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			Check ch=new Check();
		    ch.FindMax(a , b,c); //calling method to check greatest number
		
	}
	

}

