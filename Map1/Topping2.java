package bat.coding.java.Map1;

import java.util.HashMap;
import java.util.Map;

public class Topping2 {
    public static void main(String[] args) {
        Map<String,String> dict = new HashMap<>();
        dict.put("ice cream","cherry");
        dict.put("spinach","dirt");
        topping2(dict);
        for(Map.Entry<String,String> word : dict.entrySet()){
            System.out.println("Key : " + word.getKey()+ ", value : " + word.getValue());
        }
    }

    public static Map<String,String> topping2(Map<String,String> map){
        if(map.containsKey("ice cream") && map.get("ice cream") != null){
            map.put("yogurt",map.get("ice cream"));
        }
        if(map.get("spinach") != null){
            map.put("spinach","nuts");
        }
        return map;
    }
}

/**
 Given a map of food keys and their topping values, modify
 and return the map as follows: if the key "ice cream" has
 a value, set that as the value for the key "yogurt" also.
 If the key "spinach" has a value, change that value to "nuts".

 topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
 topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
 topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
 **/