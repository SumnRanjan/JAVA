package HashMap;

import java.util.*;

public class HashMp {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kunal" , 88);
        map.put("suman" , 84);
        map.put("suniana" ,98);

        System.out.println(map.get("suman")); 
        // System.out.println(map.getOrDefault("kar", 85));


    }
}
