package com.adsoft.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findSecondRepetingOccurrence {

    public static void main(String[] args) {

        Integer[] array = {1, 3, 4, 2, 3, 4, 4,1, 5};
        LinkedHashMap<Integer, Long> collect = Stream.of(array).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
       // collect.entrySet().stream().filter(e -> e.getKey() > 1).map(a->a.getKey()).skip(1).findFirst().get();
        Integer i = collect.keySet().stream().filter(aLong -> aLong > 1).skip(1).findFirst().get();
        System.out.println(i);
    }
}
