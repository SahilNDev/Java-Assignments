public class OddEven {
	
	public int[] checkOdd(int[] numbers) {
		int i = 0;
		int[] oddNum = new int[numbers.length];
		for(int j: numbers){
			if(j%2 == 1) {
				oddNum[i] = j;
				i++;
			}
		}
		int[] result = new int[i];
		for(int j=0;j<i;j++) {
			result[j] = oddNum[j];
		}
		return result;
	}

	public int[] checkEven(int[] numbers) {
		int i = 0;
		int[] evenNum = new int[numbers.length];
		for(int j: numbers){
			if(j%2 == 0) {
				evenNum[i] = j;
				i++;
			}
		}
		int[] result = new int[i];
		for(int j=0;j<i;j++) {
			result[j] = evenNum[j];
		}
		return result;
	}
}

			