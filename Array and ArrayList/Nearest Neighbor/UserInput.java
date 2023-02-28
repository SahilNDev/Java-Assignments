import java.util.Scanner;

public class UserInput {
	// Function to input an array
	public double[] inputArr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int n = sc.nextInt();
		double[] array = new double[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextDouble();
		}
		return array;
	}
}