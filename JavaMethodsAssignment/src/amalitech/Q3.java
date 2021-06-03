
package amalitech;

public class Q3 {
	
	public static boolean isPrime(int x) {
		boolean prime =true;
		if(x>1) {
			for(int i=2;i<x;i++) {
				if(x%i==0) {
					prime=false;
					break;
				}
			}
		}
		
		else {
			prime=false;
		}
		return prime;
		
	}
	public static void main(String[]args) {
		System.out.println(isPrime(5));
		System.out.println(isPrime(10));
	}

}
