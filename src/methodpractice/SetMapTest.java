package methodpractice;

import java.util.*;

public class SetMapTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("set");
        System.out.println(set.toString());
        boolean TF = set.contains("set");
        System.out.println(TF);
        set.remove("set");
        boolean isEmpty = set.isEmpty();
        System.out.println("is empty:" + isEmpty);
    }
}
