/*Ques 12)Write a program to print all unique elements in array.
For Example
Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 All unique elements in the array are: 3, 20, 12, 10*/

public class UniqueElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 1, 5, 20, 2, 12, 10};

        System.out.print("All unique elements in the array are: ");

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
