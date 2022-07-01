package Interface;

public interface Int1 {
int a = 10; // we use only public final and static variables here in interface

void m1 ();  // only we write abstract method with public access specifier

default void m2() { // if we want to write method body then use default keyword
System.out.println(1);	
}

static void m3(){ // if we want to write method body then use static keyword 
System.out.println(56);	

}
default void m7() {
	
}
static void s1() {
	System.out.println("Static");
}



}
  
	  
  

	
	

	
	
	
	
	

