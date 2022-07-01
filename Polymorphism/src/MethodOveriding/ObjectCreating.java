package MethodOveriding;

public class ObjectCreating {
	public static void main(String[] args) {
		
		ClassB d = new ClassB ();
		d.m1(); // classB
		d.m2(0); //B
		d.m3(0); //B
		d.m4(24); // B
		
		
		ClassA s = new ClassB (); //dynamic method dispatch
		s.m1(0);      //class A
		s.m2(30);    //classA
		s.m3(2.45);  //classA
		s.m1(0);     // class A //static method 
		
		ClassA f= new ClassA();
		f.m1(0);// class A
		f.m2(10); //classA
		
		
		
		
		
		
		
		
}
	

	
	
	
	
	
	
}
