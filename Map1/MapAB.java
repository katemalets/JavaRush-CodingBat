package bat.coding.java.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapAB {
    public static void main(String[] args) {
        Map<String ,String > dict = new HashMap<>();
        dict.put("a","Hi,");
        dict.put("b","Java");
        mapAB(dict);
        for(Map.Entry<String,String> word : dict.entrySet()){
            System.out.println("Key : " + word.getKey()+ ", value : " + word.getValue());
        }
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("a" + "b" ,map.get("a") + map.get("b"));
        }
        return map;
    }
}

/**
 * Modify and return the given map as follows: for this
 * problem the map may or may not contain the "a" and "b" keys.
 * If both keys are present, append their 2 string values
 * together and store the result under the key "ab".
 *
 * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
 * mapAB({"a": "Hi"}) → {"a": "Hi"}
 * mapAB({"b": "There"}) → {"b": "There"}
 */

