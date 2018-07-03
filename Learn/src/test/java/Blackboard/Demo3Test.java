package Blackboard;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Demo3Test {
	
	@Test
	public void PrintNumbersPyramid()
	{	
	int n =5;
	int k = ((2*n)-2); 
  
     for ( int i=0; i<n; i++)
     {
         for (int j=0; j<k; j++)
         {
             System.out.print(" ");
         }
        k = k - 1;

         for (int j=0; j<=i; j++ )
         {
             System.out.print("* ");
         }
         System.out.println();
     }
  }
	@Test
	public void PrintNumbersInOrder()
	{
	int i, j, num;
	int n=5; 
	 for (i=0; i<n; i++)
    {
             num=1;
        for(j=0; j<=i; j++)
        {
            System.out.print(num+ " ");
            num++;
        }
        System.out.println();
    }
	}
	@Test
	public void PrintNumbers180Degress()
		{	
		int n =5;
		int k = ((2*n)-2); 
	  
	     for ( int i=0; i<n; i++)
	     {
	         for (int j=0; j<k; j++)
	         {
	             System.out.print(" ");
	         }
	        k = k - 2;

	         for (int j=0; j<=i; j++ )
	         {
	             System.out.print("* ");
	         }
	         System.out.println();
	     }
	  }
	@Test
	public void PrintNumbersSingleLoop()
	{
		StringBuilder sb = new StringBuilder();
		String sep = "";
		int num =1;
		for (int i=0; i< 5; i++) 
		{
			System.out.println( " " + (sb.append(sep).append(num++)) );
			sep = " ";
		}
		System.out.println("Single Loop");
	}
}	