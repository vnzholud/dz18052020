package dz24052020;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        String[] arr = new String[15];



        arr[0] = "Вася1";
        arr[1] = "Вася2";
        arr[2] = "Вася3";
        arr[3] = "Вася3";
        arr[4] = "Вася1";
        arr[5] = "Вася1";
        arr[6] = "Вася1";
        arr[7] = "Вася1";
        arr[8] = "Вася1";
        arr[9] = "Вася1";
        arr[10] = "Вася1";
        arr[11] = "Вася1";
        arr[12] = "Вася1";
        arr[13] = "Вася1";
        arr[14] = "Вася1";


        stringList = Arrays.asList(arr);

        System.out.println(Arrays.toString(arr));

        HashMap<String, Integer> stringListUnic = new HashMap<>();

        for (String word: arr) {

            stringListUnic.put(word,stringListUnic.getOrDefault(word,0)+1);
        }

        System.out.println(stringListUnic);



        Telefon Book = new Telefon();

        Book.add("Вася", 2341323L);
        Book.add("Вася", 2341323L);
        Book.add("Петя", 2341333L);
        Book.add("Миша", 4561323L);

    }

}