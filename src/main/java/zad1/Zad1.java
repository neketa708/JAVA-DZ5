package zad1;

import java.util.HashMap;
import java.util.Map;

public class Zad1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Россия", 0);
        int result = 0;
        String str = "Россия идет вперед всей планеты. Планета — это не Росс.";
        String[] par = str.split(" ");
        for (String val : par) {
            if (map.containsKey(val)) {
                map.put(val, map.get(val)+1);
            }
        }
        System.out.println(map.keySet()+ " - "+map.values());
    }
}
