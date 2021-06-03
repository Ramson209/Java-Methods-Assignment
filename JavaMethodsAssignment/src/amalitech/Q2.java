
package amalitech;

import java.util.Scanner;

public class Q2 {
	
	public static void Circle() {
		int radius;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the radius");
		
		radius=s.nextInt();
		
		System.out.println("Circumference is "+(2*3.14*radius)+"and area is "+(3.14*radius));
		s.close();
		
	}
	public static void main(String[]args) {
		Circle();
	}

}
