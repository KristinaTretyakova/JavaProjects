package Lesson5;

/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Task1 {
    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 895045695, bookPhone);
        addNumber("Ivanov", 895043965, bookPhone);
        addNumber("Petrov", 896420157, bookPhone);
        addNumber("Sidorov", 895647748, bookPhone);
        addNumber("Ivanov", 895123562, bookPhone);
        addNumber("Petrov", 895117878, bookPhone);
        printPhoneBook(bookPhone);
    }
    public static void addNumber (String key,int value, Map<String, ArrayList < Integer >> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void printPhoneBook (Map < String, ArrayList < Integer >> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
