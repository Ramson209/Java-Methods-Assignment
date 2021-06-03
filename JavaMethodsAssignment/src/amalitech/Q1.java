package amalitech;

import java.util.Scanner;

public class Q1 {

	public static void sum() {
		// TODO Auto-generated method stub
      int x;
      int y;
       Scanner s =new Scanner(System.in);
       System.out.println("Enter a number");
       x=s.nextInt();
       
       System.out.println("Enter the another number");
       y=s.nextInt();
       System.out.println("Sum is "+(x+y));
       
       s.close();
       
	}
	
	
	public static void main (String []args) {
		sum();
		
	
	}
       
}
