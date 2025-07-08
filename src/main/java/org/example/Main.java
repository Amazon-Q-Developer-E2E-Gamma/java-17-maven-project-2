package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // This Thread creation pattern can be upgraded to Virtual Threads in Java 21
        Thread thread = new Thread(() -> {
            System.out.println("Hello from old thread!");
        });
        thread.start();

        // This pattern matching can be enhanced in Java 21
        Object obj = "Hello world!";
        if (obj instanceof String str) {
            System.out.println(str.toLowerCase());
        }

        // This executor usage can be upgraded to use virtual threads in Java 21
        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(() -> System.out.println("Task running in thread pool"));
        executor.shutdown();

        // Record pattern that can be enhanced in Java 21
        record Person(String name, int age) {}
        Object person = new Person("John", 30);
        if (person instanceof Person p) {
            System.out.println("Name: " + p.name());
        }
    }

    // Deprecated method usage that should be updated
    @Deprecated
    public void oldMethod() {
        Thread.currentThread().stop(); // deprecated method
    }
}
