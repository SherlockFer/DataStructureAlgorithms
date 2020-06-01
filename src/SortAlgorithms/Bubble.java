
public class Bubble {

    public static void main(String[] args) {
        //Initialize an array of int
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        //Initialize and int declaring the las position of the array
        int latPositionsArray = intArray.length - 1;
        //Declare a for loop from right to left of the String
        //To know how many times to iterate in the array
        for (;latPositionsArray > 0;latPositionsArray--) {
            //Declare a for loop to reach every element in the array
            for (int i = 0; i < latPositionsArray; i++) {
                //take the first number of the array and compare with the next (all array)
                if (intArray[i] > intArray[i + 1]) {
                    //if a array is greater tham the next, it have to switch position
                    swap(intArray, i, i + 1);
                }
            }
        }

        //to print the array after sorting
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(" " + intArray[i]);
        }

    }

    //class to swap two number in an array
    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }
        //create a temporal number, it holds the number 1
        int temp = array[i];
        //swap the numner
        array[i] = array[j];
        //set the second number with the temp value
        array[j] = temp;

    }
}
