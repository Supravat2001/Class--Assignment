package arrayexamples;

import java.util.Scanner;

public class MergeArray2 {

	public static void main(String[] args) 
	{
		//runtime initialization
		int size ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of first array :");
		size = sc.nextInt();
		int a[]= new int[size];//first array
		System.out.println("Enter " +size+ " " + "Elements in an array" );
		for(int i=0; i<size; i++)
		{
		a[i]=sc.nextInt();
		}
		int size2 ;
		System.out.println("Enter size of second array : ");
		size2=sc.nextInt();
		int b[]= new int [size2];//second array
		System.out.println("Enter " +size2+ " " + "Elements in second array");
		for(int i=0; i<size2; i++)
		{
		b[i]=sc.nextInt();
		}
		int c[]= new int[a.length+b.length];//The new array after merging two array
		int count =0;//count is used to denote position
		//traversing array
		System.out.println("Array1 & Aarray2 Merge: ");
		for(int i=0;i<a.length;i++)		
		{
		c[i]=a[i];
		count++;
		}//end of for loop of a
		for(int i=0;i<b.length;i++)
		{
		c[count++]=b[i];
		}//end of for loop of b
		for(int i=0;i<c.length;i++)
		{
		System.out.println(c[i]+ "");
		}//end of for loop of c
		}//END OF MAIN CLASS

		}//End of class merge

