package com.gcc.playground;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class MainPlayground {

    public static void main(String[] args) {

        System.out.println(" testing ");

        String not_found = getProcessResultAsString("not found");

        String result = getProcessResultAsString("simple");

        System.out.println(not_found);
        System.out.println(result);

        System.out.println(parser.andThen(square).apply("10"));

        Compositor comp = new Compositor();

        Double aDouble = comp.calculateFinalCost(30, 2D);
        System.out.println(aDouble);
    }

    private static String getProcessResultAsString(String key) {
        Map<String, String> map = HashService.getMap();

        return StrategyFactory.getStrategy(key)
                .map(s -> s.process(map))
                .map(Supplier::get).toString();
    }

    private static Function<String, Integer> parser = Integer::parseInt;
    private static Function<Integer, Integer> square = e -> e * e;
}
