package lesson1.Homework1;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] arr = { 3,2,2,1,2,3,1,3 };
        moving(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moving(int[] arr)
    {
        int k = 0;
        for (int i: arr)
        {
            if (i != 3) {
                arr[k++] = i;
            }
        }
        for (int i = k; i < arr.length; i++) {
            arr[i] = 3;
        }
    }

}
