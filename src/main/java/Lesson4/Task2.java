package Lesson4;

/*Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.*/

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        flipList();
    }

        public static void flipList() {

            Random random = new Random();
            List<Integer> randomLinkedList = new LinkedList<>();

            for (int i = 0; i < 10; i++) {
                randomLinkedList.add(random.nextInt(1, 100));
            }

            System.out.println("Сгенерированный LinkedList: " + randomLinkedList.toString());

            List<Integer> FlipLinkedList = new LinkedList<>();

            for (int i = randomLinkedList.size() - 1; i >= 0; i--) {
                FlipLinkedList.add(randomLinkedList.get(i));
            }

            System.out.println("Перевёрнутый LinkedList: " + FlipLinkedList.toString());
        }
}
