public class Main{
	static int[] array;
	static int[] odd;
	static int[] even;
	public static void main(String[] args){
		InputOutput io = new InputOutput();
		array = io.inputArr();
		OddEven checker = new OddEven();
		odd = checker.checkOdd(array);
		even = checker.checkEven(array);
		System.out.print("Odd Numbers are: ");
		io.printArr(odd);
		System.out.print("Even Numbers are: ");
		io.printArr(even);		
	}	
}