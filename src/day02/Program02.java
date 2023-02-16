package day02;

public class Program02 {
	byte a=-128;
	static short b= 32767;
	int c=1234567;
	long d=67890898l;
	boolean x=true;
	char y='1';
	float ab=0.1f;
	double bc=0.1d;
	//static method will allows only static users
	public static void main(String[] args) {
		Program02 abc = new Program02();			
		abc.fun();
		int main=10;
		System.out.println(main);
		
		System.out.println("Good Day..!");	
		
		System.out.println(b);
		
	}
	
	
	public void fun()
	{
		System.out.println("Besant Tech..!");
	}
}
