import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InputOutput io = new InputOutput();
        ArrList al = new ArrList();

        //Inputing Array from User
        int[] numbers = io.inputArr();
        // Converting to ArrayList
        ArrayList <Integer> list1 = al.toArrList(numbers);
        // Printing the arraylist
        io.printArrList(list1);

        // Inputing ArrayLsit form User
        ArrayList <Integer> list2 = io.inputArrList();
        // Converting to Array
        int[] array = al.toArr(list2);
        // Printing the array
        io.printArr(array); 
    }
}