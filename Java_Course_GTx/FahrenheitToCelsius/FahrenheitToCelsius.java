import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a Fahrenheit value: ");
	int fahrenheit = input.nextInt();
	input.nextLine(); //cleans up newline at end of user input
	System.out.print("Enter a day of week: ");
	String day = input.next();
	System.out.print("Ent pref Celsius label (Celsius, Centigrade, or C): ");
	String cText = input.next();
	double celsius = (5.0/9) * (fahrenheit -32);
	System.out.printf("%s Fahr: %d\n", day, fahrenheit);
	System.out.printf("%s %-4s: %,.1f \n", day, cText, celsius);		


	}
}