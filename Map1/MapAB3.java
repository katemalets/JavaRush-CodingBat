package bat.coding.java.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB3 {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        dict.put("a","aaa");
        dict.put("b","bbb");
        dict.put("c","ccc");
        mapAB3(dict);
        for (Map.Entry<String, String> word : dict.entrySet()) {
            System.out.println("Key : " + word.getKey() + ", value : " + word.getValue());
        }
    }

    public static Map<String,String> mapAB3(Map<String,String> map){
        if(map.get("a") == null){
            map.put("a",map.get("b"));
        }
        if(map.get("b") == null){
            map.put("b",map.get("a"));
        }
        return map;
    }
}
/**
 Modify and return the given map as follows: if exactly one of the keys "a" or "b"
 has a value in the map (but not both), set the other to have that same value in the map.

 mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
 mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
 mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 **/