package Lesson3;

import java.util.ArrayList;
import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class Task1 {

    public static void main ( String[] args){

        deleteInteger();
    }
    public static void deleteInteger(){
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12)); //   Задан самостоятельно
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) % 2 == 0){
                list.remove(i);               // Что-то готового в языке для этой задачи не нашла:(
            }
        }
        System.out.println(list);
    }
}
