package Upcasting;

public class child extends Parent {
void k1() {
	System.out.println("C1");
}

void k2 () {
	System.out.println("C2");
}
void m2() {
	System.out.println("P4");
}
void m1(int a) {
	System.out.println("P3");
}
public static void main(String[] args) {
	
Parent ref = new child (); // child class refers parent class , implicit casting
	ref.m1(); // p
	ref.m2(); // p
	
		

	
	
	
	
	
	
	
	
}








}
