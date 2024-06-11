/* Write a java program that prompts the user for an integer and then prints out all the prime
numbers up to that integer.*/

import java.lang.*;
import java.util.*;

class PrimeNumbers
{
	public static void main(String args[])
	{
		int n,c,i,j,count=0;
		System.out.println("Enter the number to print PrimeNumbers upto that number:");
		Scanner sc = new Scanner(System.in);
		n=Integer.parseInt(sc.next());
		System.out.println("\n prime numbers are:");
		for(i=1;i<=n;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				c++;
			}
			if(c==2)
			{
				System.out.println(" "+i);
				count++;
			}
		}
		System.out.println("The total number of prime numbers are: "+count);
	}
}