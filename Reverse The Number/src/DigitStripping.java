import java.util.Scanner;
public class DigitStripping
	{
		public static void main(String[] args)
		{
		Scanner userStringInput = new Scanner(System.in);
		System.out.println("Hello user, what is your name?");
		String name = userStringInput.nextLine();
		 Scanner userIntInput = new Scanner(System.in);
		System.out.println("Give me a number!");
		int number = userIntInput.nextInt();
		int reversed = 0;
		while (number > 0)
			{
				int digit = number % 10;
				
				reversed = reversed * 10 + digit;
				
				number = number/10;
				
			}
		System.out.print(reversed);

		}
	}
