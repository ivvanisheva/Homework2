import java.util.Calendar;
import java.util.Scanner;

public class Task7_PersonCharacteristics {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String name = scanner.nextLine();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your last name:");
        String lastname = scan.nextLine();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthyear:");
		int y = sc.nextInt();
		int z = Calendar.getInstance().get(Calendar.YEAR) - y;
		
		Scanner scann = new Scanner(System.in);
		System.out.println("Enter your weight:");
		byte w = scann.nextByte();
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter your height in cm:");
		short t = sca.nextShort();
		
		Scanner j = new Scanner(System.in);
		System.out.println("Enter your job:");
		String job = j.next();
		
		System.out.println (name + " " + lastname + " is " + z +  " years old. " + "His/Her weight is " + w + " and he/she is " + t + "cm tall. " + "He/She is a/an " + job + "." );
		
		scanner.close();
		sc.close();
		scan.close();
		scann.close();
		sca.close();
		j.close();
				
	}

}
