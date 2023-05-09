package com.java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p = (value) -> {
           return value%2==0;
        };

        System.out.println(p.negate().test(45));
    }
}
