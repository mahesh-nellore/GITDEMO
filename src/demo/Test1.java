package demo;

public class Test1 {
	
	static int add(int a, int b) {
		return a+b;
	}
	static int subtract(int a, int b) {
		return a-b;
	}
	static int multiply(int a, int b) {
		return a*b;
	}
	
	static boolean verifyEvenNumber(int number) {
		if(number%2==0)
			return true;
		return false;
		
	}
	static boolean verifyOddNumber(int number) {
		System.out.println("Verify Odd Number");
		System.out.println("Verify Odd Number====");
		if(number%2!=0)
			return true;
		return false;
		
	}
	
	

}
