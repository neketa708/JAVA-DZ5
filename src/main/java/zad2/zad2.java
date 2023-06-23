package zad2;

import java.util.*;
import java.util.stream.Collectors;

public class zad2 {
    public static void main(String[] args) {
        Pepl peopl1 = new Pepl("Иван" , "Иванов");
        Pepl peopl2 = new Pepl("Светлана" , "Петрова");
        Pepl peopl3 = new Pepl("Кристина" , "Белова");
        Pepl peopl4 = new Pepl("Анна" , "Мусина");
        Pepl peopl5 = new Pepl("Анна" , "Крутова");
        Pepl peopl6 = new Pepl("Иван" , "Юрин");
        Pepl peopl7 = new Pepl("Петр" , "Лыков");
        Pepl peopl8 = new Pepl("Павел" , "Чернов");
        Pepl peopl9 = new Pepl("Петр" , "Чернышов");
        Pepl peopl10 = new Pepl("Мария" , "Федорова");
        Pepl peopl11 = new Pepl("Иван" , "Иванов");
        List<Pepl> peplList = new ArrayList<>();
        peplList.add(peopl1);
        peplList.add(peopl2);
        peplList.add(peopl3);
        peplList.add(peopl4);
        peplList.add(peopl5);
        peplList.add(peopl6);
        peplList.add(peopl7);
        peplList.add(peopl8);
        peplList.add(peopl9);
        peplList.add(peopl10);
        peplList.add(peopl11);
        Map< String, Integer > map = new HashMap<>();
        for (int i = 0; i < peplList.size(); i++) {
            if (!map.containsKey(peplList.get(i).getName())){
                map.put(peplList.get(i).getName(), 1);
            } else {
                map.put(peplList.get(i).getName(), map.get(peplList.get(i).getName())+1);
            }
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
