package MethodOverloading;

public class ClassA {
	
	
void m1() {            //first
	}
void m1( int a ){      //second
	}
void m1( String b){    // third
	
}
public static void main(String[] args) {
	
	ClassA c = new ClassA();
       c.m1();
	System.out.println(30);
	System.out.println("Pradnya");
	
}	




}
