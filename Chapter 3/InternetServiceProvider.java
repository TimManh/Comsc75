//Cyril Garcia
//Computer Science 075
//Asignment #3
/*
	Demonstrating the use of if-else and switch statements and concatenating strings and Ints.
*/

import java.util.Scanner;

public class InternetServiceProvider {

	public static void main(String[] args) {

		String packageType;
		int hoursUsed;
		double monthlyBill;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("select a package A B or C: ");
		String packegeLetter = keyboard.nextLine();
		packageType = packegeLetter.toUpperCase();

		if (packageType.equals("A") || packageType.equals("B") || packageType.equals("C")) {

		System.out.print("Hours of use: ");
		hoursUsed = keyboard.nextInt();

		switch(packageType) {

			case "A":

			if (hoursUsed <= 10) {
				monthlyBill = 9.95;
				System.out.println("Monthly bill: $" + monthlyBill);
			} else {
				int extraCharge = (hoursUsed - 10) * 2;
				monthlyBill = 9.95 + extraCharge;
				System.out.println("Monthly bill: $" + monthlyBill);
			}

			break;

			case "B":

			if (hoursUsed <= 20) {
				monthlyBill =13.95;
				System.out.println("Monthly bill: $" + monthlyBill);
			} else {
				int extraCharge = (hoursUsed - 20) * 1;
				monthlyBill = 13.95 + extraCharge;
				System.out.println("Monthly bill: $" + monthlyBill);
			}
			break;

			case "C":
				monthlyBill = 19.95;
				System.out.println("Monthly bill: $" + monthlyBill);
			break;

			default:

			break;

}

} else {
System.out.println("Invalid input");

}

	}
}


/*
select a package A B or C: b
Hours of use: 35
Monthly bill: $28.95
Press any key to continue . . .
*/