package day03;

public class Program01 {

		//METHOD WRITING & METHOD OVER LOADING
		public static void main(String[] args) {
			/*int a=20;
			int b=30;
			System.out.println(a+b);*///instead of giving this we use method writing
			
			add(20,30);
			add(40,50);
			add(10,20,30);
			

		}
		public static void add(int a, int b) {
			System.out.println(a+b);
		}
		public static void add(int a, int b, int c) {
			System.out.println(a+b+c);
			
		}
	

}
