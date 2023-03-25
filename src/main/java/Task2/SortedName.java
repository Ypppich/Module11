package Task2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedName {
    public static List<String> sortingNamesAlphabetically(List<String> names) {
        List<String> result = names.stream() //Створюємо список який буде приймати значення з потоку, який в свою чергу створенний з списку names.
                .map(String::toUpperCase) //До верхнього регістру.
                .sorted(Collections.reverseOrder()) //Сортуємо за алфавітом у зворотньому порядку.
                .collect(Collectors.toList()); //Виводимо з потоку елементи та зберігаємо їх у списку result.
        return result;
    }
}


class SortedNameTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petro");
        names.add("Andriy");
        names.add("Anna");
        names.add("Diana");
        System.out.println(new SortedName().sortingNamesAlphabetically(names));
    }
}