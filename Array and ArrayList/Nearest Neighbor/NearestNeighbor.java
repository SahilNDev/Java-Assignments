public class NearestNeighbor{
	static int[] result = new int[2];
	
	// FUnction to find the first index of the number having nearest neighbors.
	public int indexNN(double[] numbers){
		result[0] = 0;
		double minVal = 1000000;
		for(int i=0;i<numbers.length-1;i++) {
			// Checking if the difference between two neighbors is the least.
			if(Math.abs(numbers[i] - numbers[i+1])<minVal) {
				minVal = Math.abs(numbers[i] - numbers[i+1]);
				result[0] = i;
			}
		}
		return result[0];
	}
}