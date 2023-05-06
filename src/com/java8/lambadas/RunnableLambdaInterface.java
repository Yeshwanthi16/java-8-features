package com.java8.lambadas;

public class RunnableLambdaInterface {
    public static void main(String[] args) {

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Interface example 1");
            }
        };

        new Thread(run).start();

        Runnable run1 = () -> {
            System.out.println("Interface example 2");
        };

        new Thread(run1).start();

        new Thread(() -> System.out.println("Interface example 3")).start();
    }
}
