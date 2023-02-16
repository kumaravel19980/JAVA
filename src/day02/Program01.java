package day02;//DATA TYPES
			// STATIC AND NON-STATIC ----> OBJECT CREATION

public class Program01 {
	byte a=-128;//-128 to 127/signed 8 bits
	short b= 32767;//-32768 to 32767/signed 16 bits
	int c=1234567;//-2147483648 to 2147483647/signed 32 bits
	long d=67890898l;//-9223372036854775808 to 9223372036854775807/signed 64 bits
	boolean x=true;//0 (false) or 1 (true)/unsigned 8 bits
	char y='1';//0 ('\u0000') to 65535 ('\uffff')/unsigned 16 bits
	float ab=0.1f; // in float data type 'f' should be given after the value /1.40239846e-45f to 3.40282347e+38f
	//32 bits
	double bc=0.1d;// 'd' is optional/	4.94065645841246544e-324 to 1.79769313486231570e+308
	//64 bits

	public static void main(String[] args) {
		
		Program01 x= new Program01();
		// OBJECT CREATION -----> CLASSNAME VARIABLE = NEW CLASSNAME();
		int a=10;
		System.out.println("hi");
		System.out.println(a);
		x.function();// here we should call the  non-static function to print the value
		

	}
	    public void function() {
		System.out.println("hello");
	}
	
	
}
