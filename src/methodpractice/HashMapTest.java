package methodpractice;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "val");
        System.out.println(map.toString());
        String value = map.get("key");
        System.out.println("value: " + value);
        boolean TorF = map.containsKey("key");
        System.out.println("t or f: " + TorF);
        map.remove("key");
        System.out.println("key: " + map.toString());
    }
}
