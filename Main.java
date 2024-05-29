import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a string :");
		
		char[] letters = scanner.nextLine().toCharArray();
		System.out.println("Reverse a string :");
		
		for(int i = letters.length -1 ; i>=0;i--)
		{
			System.out.println(letters[i]);		
	}
	
}
}