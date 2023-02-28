public class Main{
	static int[] array;
	static int[] odd;
	static int[] even;
	public static void main(String[] args){
		InputOutput io = new InputOutput();
		// Inputing the array.
		array = io.inputArr();
		
		OddEven checker = new OddEven();
		// Creating array of odd and even numbers.
		odd = checker.checkOdd(array);
		even = checker.checkEven(array);

		// Printing the both array to teh console.
		System.out.print("Odd Numbers are: ");
		io.printArr(odd);
		System.out.print("Even Numbers are: ");
		io.printArr(even);		
	}	
}