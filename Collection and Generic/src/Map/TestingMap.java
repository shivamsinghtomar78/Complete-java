package Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Prashant",34);
        map.put("Samchit",100);
        map.put("Ram",100);
        map.put("Sohan",0);
        System.out.println(map.size());
        System.out.println(map.get("Prashant"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Geeta"));

    }
}
