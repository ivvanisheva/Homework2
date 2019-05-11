import java.util.Scanner;

public class Task5_SwapVariables {

	public static void main(String[] args) {
		  int x, y, z;
		   Scanner scanner = new Scanner(System.in);

		   System.out.println("Input the first number: ");
		   x = scanner.nextInt();
		   System.out.println("Input the second number: ");
		   y = scanner.nextInt();

		   z = x;
		   x = y;
		   y = z;

		   System.out.println("Swapped values are:" + x + " " + y);
		   
		   scanner.close();
	}
		
}
