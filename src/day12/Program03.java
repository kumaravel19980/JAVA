package day12;

public class Program03 {
	// Pattern printing : squaring numbers
			/* output :
			 * 1
			 * 2 4
			 * 3 9 3
			 * 4 16 4 16
			 * 5 25 5 25 5
			 */
	// Odd or Even method :

		public static void main(String[] args) {
			for (int a=1;a<=5;a++)
			{

				for(int b=1;b<=a;b++)
				{
					if(b%2==1)
					{

						System.out.print(a+" ");
					}
					else
					{

						System.out.print(a*a+" ");

					}

				}
				System.out.println();
			}
		}

}
