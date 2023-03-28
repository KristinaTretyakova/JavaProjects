package lesson1.Homework1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        FindMinAndMax(10);
    }

    private static void FindMinAndMax(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);

        }
        Integer maxNum = Integer.MIN_VALUE;
        Integer minNum = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < minNum){
                minNum = num;
            }
            if (num > maxNum){
                maxNum = num;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("Максимальное значение в массиве %s,%nМинимальное значение в массиве %s",maxNum,minNum);
    }

}
