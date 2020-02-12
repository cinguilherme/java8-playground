package com.gcc.playground;

import java.util.HashMap;
import java.util.function.Supplier;

public class MainPlayground {

    public static void main(String[] args) {

        System.out.println(" testing ");

        String not_found = getProcessResult("not found");

        String result = getProcessResult("simple");

        System.out.println(not_found);
        System.out.println(result);

    }

    private static String getProcessResult(String key) {
        return StrategyFactory.getStrategy(key)
                .map(s -> {
                    HashMap<String, String> map = new HashMap<>();
                    map.put("one", "1");
                    return s.process(map);
                })
                .map(Supplier::get).toString();
    }

}
