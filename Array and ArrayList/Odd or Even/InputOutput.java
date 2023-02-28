import java.util.Scanner;

public class InputOutput{
	static int[] result;
	
	// Function for inputing an array.
	public int[] inputArr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the array:");
		int n = sc.nextInt();
		result = new int[n];
		// Inputing elemets of an array.
		for(int i=0;i<n;i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	// Function for printing an array to the console.
	public void printArr(int[] numbers) {
		// Printing each element of the array tot he console.
		for(int i: numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}