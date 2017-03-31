/**@scanner package**/
import java.util.Scanner;
/**@create a class**/
public class FindHighestNumber {

	public static Scanner obj;

	public static void main(String[] args) {
		/**@Declaration**/
		int a, b, c;
		obj = new Scanner(System.in);
		System.out.println("Enter three number");
		
		/**@ASSIGNNING VALUE**/
		a = obj.nextInt();
		b = obj.nextInt();
		c = obj.nextInt();
		
		/**@CONDITION TO CHECK GREATEST NUMBER**/
		System.out.println("greatest no is ");
		
		/**@USE OF AND OPERATOR**/
		if (a > b && b > c)	
			
			/**@Print output of a**/
			System.out.println(a);	
		
		/**@else condition**/
		else if (b > c && b > a)
			
			/**@Print output of a**/
			System.out.println(b);		
		else
			System.out.println(c);
	}

}