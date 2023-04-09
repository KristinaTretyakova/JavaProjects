package Lesson5;

/*Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.*/

import java.util.*;
public class Task2 {
    public static void main(String[] args) {

        String[] Names = new String[]{
                "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"
        };
        List<String> listNames = getName(Names);
        Map<String, Integer> mapNames = getMap(listNames);
        System.out.println("Повторяющиеся имена: ");
        duplicatNames(mapNames);
        System.out.println("Отсортированный по популярности список имен от большего к меньшему: ");
        sortedNames(mapNames);
    }
    private static List<String> getName(String[] list) {
        List<String> listNames = new ArrayList<>();
        for (String item : list) {
            String[] listItems = item.split(" ");
            listNames.add(listItems[0]);
        }
        return listNames;
    }
    private static void sortedNames(Map<String, Integer> map) {
        Map<String, Integer> sortMap = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (Map.Entry<String, Integer> item : list) {
            sortMap.put(item.getKey(), item.getValue());
        }
        for (var item : sortMap.entrySet()) {
            System.out.printf("%s\n", item.getKey());
        }
    }
    private static void duplicatNames(Map<String, Integer> map) {
        for (var item : map.entrySet()) {
            if (item.getValue() > 1) {
                System.out.printf("%s: %d \n", item.getKey(), item.getValue());
            }
        }
    }
    private static Map<String, Integer> getMap(List<String> list) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            String element = list.get(i);
            for (String item : list) {
                if (element.equals(item)) {
                    count++;
                }
            }
            if (!stringIntegerMap.containsKey(element)) {
                stringIntegerMap.put(element, count);
            }
        }
        return stringIntegerMap;
    }
}
