import java.io.*;
import java.util.*;

class AdditionDemo
{
	public static void main(String args[])
	{
		System.out.println("Enter the First Number:\n");
		Scanner sc1 = new Scanner(System.in);
		int a=Integer.parseInt(sc1.nextLine());
		System.out.println("Enter the First Number:\n");
		Scanner sc2 = new Scanner(System.in);
		int b=Integer.parseInt(sc2.nextLine());
		int c;
		
		System.out.println("c ="+(a+b));
	}
}