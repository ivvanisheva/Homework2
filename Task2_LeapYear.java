
public class Task2_LeapYear {

	public static void main(String[] args) {
		
		int a = 1900;
		
		System.out.println((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0));

	}

}
