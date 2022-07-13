package Castingpractice;

public class Explicit {   // large data type store into small data type.
public static void main(String[] args) {
	int i = 10;                     // 4 byte-int
	byte b = (byte) i ;            // 1 bytes-byte
	System.out.println(i);
	
	float f= 100;                // 4 byte-float
	short s = (short) f;             //  2 byte-short
	System.out.println(f);
	
    long l= 2000;                  // 8 byte-long
    int a = (int) l;               //4 byte- int
    System.out.println(l);
    
    double d = 70;               // 8 byte-double
	 int a1 = (int) d;
	System.out.println(d);
	

	
	
	

	
	
	
	
	
	
	
	
	
}
}
