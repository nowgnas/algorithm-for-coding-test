# Java 클래스 익히기

IDE를 사용하지 못하는 코테에서 각 클래스의 메서드를 외우기 위한 문서

## HashMap

```java
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
```

```shell
{key=val}
value: val
t or f: true
key: {}
```

## SetMap

```java
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

```

```shell
[set]
true
is empty:true
```

## ArrayList
```java
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.remove("hello");
        list.contains("hello");
    }
}

```

## ArrayDeque
```java
public class ArrayDequeTest {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("hello");
        queue.remove();
        queue.peek();
        queue.offer("hello");
        queue.poll();

    }
}

```