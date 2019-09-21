import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) 
	{
		double weight, height, BMI = 0;
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU:");
		System.out.println("Option 1: BMI = (703*weightInPounds)/(heightInInches^2)");
		System.out.println("Option 2: BMI = weightInKilograms/(heightInMeters^2)");
		System.out.println("Please enter '1' for Option 1 or '2' for Option 2");
		option = sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("\nYou have selected to enter weight in POUNDS and height in INCHES");
			System.out.println("Enter weight in POUNDS");
			weight = sc.nextDouble();
			System.out.println("Enter height in INCHES");
			height = sc.nextDouble();
			BMI = (703*weight)/(Math.pow(height, 2));
			break;
		case 2:
			System.out.println("\nYou have selected to enter weight in KILOGRAMS and height in METERS");
			System.out.println("Enter weight in KILOGRAMS");
			weight = sc.nextDouble();
			System.out.println("Enter height in METERS");
			height = sc.nextDouble();
			BMI = weight/(Math.pow(height, 2));
			break;
		default:
			System.out.println("Wrong Option!");
			System.exit(0);
			break;
		}
		
		System.out.printf("\nBody Mass Index (BMI) = %.2f\n",BMI);
		System.out.println("===============================");
		System.out.println("BMI CATEGORIES:");
		System.out.println("===============================");
		System.out.println("Underweight =< 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
			
		
		

	}

}
