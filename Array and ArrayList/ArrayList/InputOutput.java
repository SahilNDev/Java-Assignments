import java.util.ArrayList;
import java.util.Scanner;

public class InputOutput {
    Scanner sc = new Scanner(System.in);
    // Function to input an array from the use
    public int[] inputArr() {
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++) {
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    // Function to the an array to the console
    public void printArr(int[] array) {
        System.out.print("The Array is: ");
        for(int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Function to input an ArrayList from the user
    public ArrayList<Integer> inputArrList() {
        System.out.println("Enter the size of the array list: ");
        int n = sc.nextInt();
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            arrlist.add(sc.nextInt());
        }
        return arrlist;
    }

    // Function to print an ArrayList to the console
    public void printArrList(ArrayList<Integer> arrlist) {
        System.out.println("The Array List is: " + arrlist);
    }
}
