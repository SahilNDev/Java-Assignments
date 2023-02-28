public class Main {
	static double[] array;
	public static void main(String[] args) {
		// Inputing an array from user
		UserInput input = new UserInput();
		array = input.inputArr();

		// Getting the first index of nearest neigbor.
		NearestNeighbor nn = new NearestNeighbor();
		int result = nn.indexNN(array);

		// Printing it to the console.
		System.out.println("Index of the Nearest Neighbors is: " + result);
	}
}