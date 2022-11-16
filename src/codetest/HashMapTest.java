package codetest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        List<Map<Integer, Integer>> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        list.add(map);
        map = new HashMap<>();
        map.put(1, 3);
        list.add(map);
        System.out.println(list);
    }
}
