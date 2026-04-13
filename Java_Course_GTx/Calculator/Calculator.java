import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("List of operations: add subtract multiply divide alphabetize");
	System.out.println("Enter an operation:");
	String opDes = scan.nextLine().toLowerCase();	

	switch(opDes) {
	  case "add":
		int intAdd1;
		int intAdd2;

		System.out.println("Enter two integers:");
		if (scan.hasNextInt())
			intAdd1 = scan.nextInt();
		else {
			System.out.println("Invalid input entered. Terminating...");
			break;
		}
		if (scan.hasNextInt()) 
			intAdd2 = scan.nextInt();
		else {
			System.out.println("Invalid input entered. Terminating...");
			break;
		}

		System.out.printf("Answer: %d\n", (intAdd1 + intAdd2));		
		break;

	  case "subtract":
		int intSub1;
		int intSub2;

		System.out.println("Enter two integers:");
		if (scan.hasNextInt())
			intSub1 = scan.nextInt();
		else {
			System.out.println("Invalid input entered. Terminating...");
			break;
		}
		if (scan.hasNextInt()) 
			intSub2 = scan.nextInt();
		else {
			System.out.println("Invalid input entered. Terminating...");
			break;
		}
		System.out.printf("Answer: %d\n", (intSub1 - intSub2));		
		break;

	  case "multiply":
		double dMult1;
		double dMult2;
		System.out.println("Enter two doubles:");
		
		if (scan.hasNextDouble())
			dMult1 = scan.nextDouble();
		else {
			System.out.println("Invalid input entered. Terminating...");
			break;
		}
		if (scan.hasNextDouble()) 
			dMult2 = scan.nextDouble();
		else {
			System.out.println("Invalid input entered. Terminating...");
			break;
		}

		System.out.printf("Answer: %.2f\n", (dMult1 * dMult2));
		break; 

	  case "divide":
		double dDiv1;
		double dDiv2;

		System.out.println("Enter two doubles:");
		if (scan.hasNextDouble())
			dDiv1 = scan.nextDouble();
		else {
			System.out.println("Invalid input entered. Terminating...");
			break;
		}
		if (scan.hasNextDouble()) 
			dDiv2 = scan.nextDouble();
		else {
			System.out.println("Invalid input entered. Terminating...");
			break;
		}
				
		if (dDiv2 == 0) {
			System.out.println("Invalid input entered. Terminating...");
			break;
		}
		System.out.printf("Answer: %.2f\n", (dDiv1 / dDiv2));
		break;

	  case "alphabetize":
		System.out.println("Enter two words:");
		String s1 = scan.next();
		String s2 = scan.next();
		if (s1.toLowerCase().compareTo(s2.toLowerCase()) < 0)
		  System.out.printf("Answer: %s comes before %s alphabetically.\n", s1, s2);
		else if (s1.toLowerCase().compareTo(s2.toLowerCase()) > 0) 
		  System.out.printf("Answer: %s comes before %s alphabetically.\n", s2, s1);
		else
		  System.out.println("Answer: Chicken or Egg.");

		break;

	  default:
		System.out.println("Invalid input entered. Terminating...");

	}



	

  }
}