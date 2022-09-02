

import java.util.HashMap;

public class hashmaps {

    static HashMap<String,Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        hm.put("hi", 1);
        System.out.println(hm);
        System.out.println(hm.get("hi"));
        System.out.println(hm.containsKey("hi"));
        System.out.println(hm.containsValue(1));
        hm.remove("hi");
        System.out.println(hm);
    }


}
