package Lesson3;


import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task2 {

    public static void main ( String[] args){
        MaxMinArfOfArr();
    }
    public static void MaxMinArfOfArr(){
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(1, 100);
            list.add(val);
        }
        System.out.printf("Сгенерированный список: %s\n", list);

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < minNum){
                minNum = num;
            }
            if (num > maxNum){
                maxNum = num;
            }
        }
        System.out.printf("Максимальное число: %s\nМинимальное число: %s\n",maxNum,minNum);

        int sum = 0;
        int arf = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        arf = sum / list.size();
        System.out.printf("Среднее арифмитеческое всех чисел равно: %s",arf);

    }
}
