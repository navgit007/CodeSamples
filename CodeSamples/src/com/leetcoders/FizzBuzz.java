package com.leetcoders;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzbuzz(15);
    }

     // O(n)
    private static void fizzbuzz(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i % 3 == 0 ? i % 5 == 0 ? "FizzBuzz" : "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i));
        }
    }

}
