import java.util.Scanner;

public class Task6_SecondsInBiggerIntervals {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Seconds:");
		
		int s = Integer.parseInt(scanner.nextLine());
		long sec = s % 60;
	    long minutes = s % 3600 / 60;
	    long hours = s % 86400 / 3600;
	    long days = s / 86400;

	    System.out.println(s + " Seconds = " + days + " Days " + hours + " Hours " + minutes + " Minutes " + sec + " Seconds " );

       
	}

}
