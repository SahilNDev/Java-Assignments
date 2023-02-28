import java.util.Scanner;

public class InputOutput{
	static int[] result;
	
	public int[] inputArr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the array:");
		int n = sc.nextInt();
		result = new int[n];
		for(int i=0;i<n;i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	public void printArr(int[] numbers) {
		for(int i: numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}