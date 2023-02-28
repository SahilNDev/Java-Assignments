public class OddEven {
	
	// This is the function for creating an array of the odd numbers in the given array.
	public int[] checkOdd(int[] numbers) {
		int i = 0;
		int[] oddNum = new int[numbers.length];
		// Checking which all are odd numbers.
		for(int j: numbers){
			if(j%2 == 1) {
				oddNum[i] = j;
				i++;
			}
		}
		int[] result = new int[i];
		// Creating an array of the odd nubmers.
		for(int j=0;j<i;j++) {
			result[j] = oddNum[j];
		}
		return result;
	}

	// This is the function for creating an array of the even numbers in the given array.
	public int[] checkEven(int[] numbers) {
		int i = 0;
		int[] evenNum = new int[numbers.length];
		// Checking which all are even numbers.
		for(int j: numbers){
			if(j%2 == 0) {
				evenNum[i] = j;
				i++;
			}
		}
		int[] result = new int[i];
		// Creating an array of the even numbers.
		for(int j=0;j<i;j++) {
			result[j] = evenNum[j];
		}
		return result;
	}
}

			