package amalitech;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		x=s.nextInt();
		
		s.close();
		
		if(isEven(x))
		{
			System.out.println("Number is even");
		}
		
		else {
			System.out.println("Number is odd");
		}
		
	}
	
	public static  boolean isEven (int number)
	{
		if (number % 2 ==0)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
