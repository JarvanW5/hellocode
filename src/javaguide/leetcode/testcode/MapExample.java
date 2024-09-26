package javaguide.leetcode.testcode;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample {
    public static void main(String[] args) {


        // hashmap 中 key和value 是可以为null的
        HashMap<String, Object> map = new HashMap();
        map.put(null, null);
        if (map.containsKey(null)) {
            System.out.println("存在 null");
        } else {
            System.out.println("不存在 null");
        }


        // concurrenthashmap 中的key和value是不可以为null的
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(null, "javacn.site");
        System.out.println(concurrentHashMap.get(null));

    }

}
