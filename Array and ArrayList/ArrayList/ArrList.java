import java.util.ArrayList;

public class ArrList {
    // Funciton to convert an array to ArrayList
    public ArrayList<Integer> toArrList(int[] array) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for(int i: array) {
            arrlist.add(i);
        }
        return arrlist;
    }

    // Function to convert an ArrayList to array
    public int[] toArr(ArrayList<Integer> arrlist) {
        int[] array = new int[arrlist.size()];
        for(int i=0;i<arrlist.size();i++) {
            array[i] = arrlist.get(i);
        }
        return array;
    }
}
