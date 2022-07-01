package MethodOverloading;

public class Phone {
int i =24;
	void  unlock(String s ) {
		System.out.println("PIN");
		return;
		
	}
	void unlock  (  String a , int k) {

	}
	
	void unlock (int s, String b) {
		
	}
	public static void main(String[] args) {
		Phone g= new Phone();
		System.out.println(24);
		System.out.println("Fingurprint");
		System.out.println("Password");
		System.out.println("PIN");
		
	}
}
