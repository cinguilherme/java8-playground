package com.gcc.playground;

import java.util.HashMap;
import java.util.Map;

public class HashService {

    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("one", "1");
        return map;
    }


}
