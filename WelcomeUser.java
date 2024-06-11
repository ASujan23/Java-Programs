/* Write a java program that displays welcome to follow by user name. Accept user name from
the user.*/

import java.io.*;
import java.util.*;

class WelcomeUser
{
	public static void main(String args[])
	{
		System.out.println("Enter the User Name:\n");
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Welcome "+name+" to our AITAM College");
	}
}