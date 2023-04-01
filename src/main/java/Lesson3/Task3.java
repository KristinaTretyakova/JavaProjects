package Lesson3;

import java.util.*;

// Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.
public class Task3 {
    public static void main(String[] args) {
        listPlanet();
    }
    public static void listPlanet() {
        List<String> planetsNames = List.
                of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto");
        Random random = new Random();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            list.add(planetsNames.get(random.nextInt(9)));
        }
        System.out.println(list);                     //Сгенерированный список
        list.sort(Comparator.naturalOrder());
        System.out.println(list);                     //Упорядоченный список
        Set<String> set = new LinkedHashSet<>(list);  //Преобразование в множество
        List<String> list2 = new ArrayList<>(set);    //Преобразование множества в список
        System.out.println(list2);                //Список без дубликатов (Они отсеялись при преобразовании в множество)
    }                                             //Может и был другой способ, но я не додумалась:D
}
