package bat.coding.java.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB2 {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        dict.put("a","aaa");
        dict.put("b","aaa");
        dict.put("c","ccc");
        mapAB2(dict);
        for (Map.Entry<String, String> word : dict.entrySet()) {
            System.out.println("Key : " + word.getKey() + ", value : " + word.getValue());
        }
    }

    public static Map<String,String> mapAB2(Map<String,String> map){
        if(map.containsKey("a") && map.containsKey("b") && (map.get("a") == map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}
/**
 Modify and return the given map as follows: if the keys "a" and "b"
 are both in the map and have equal values, remove them both.

 mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
 mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
 mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
 **/