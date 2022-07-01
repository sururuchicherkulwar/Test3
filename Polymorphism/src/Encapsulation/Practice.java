package Encapsulation;

public class Practice {
private  int a; // variable
	
	void setA(int a) { // to set value of int 
	this.a= a;
	}
public	int getB() { // to get value of int 
		return a;
	}

public static void main(String[] args) {
	Practice s = new Practice();
     s.setA(4);
	
	System.out.println(s.getB());
	
}





}
	
		
	

