package Exceptions;

import java.util.concurrent.TimeUnit;

public class Finally {
    public static void main(String[] args) {

        long start = System.nanoTime();

        try{
        long ende = System.nanoTime();
            System.out.println(TimeUnit.NANOSECONDS.toMillis(ende  -   start) + " ms");
        }

        finally {

        }
    }
}
