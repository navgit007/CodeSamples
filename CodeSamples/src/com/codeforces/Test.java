package com.codeforces;

import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bc=(a,b)->System.out.println(a+b);
		bc.accept(2, 3);
		
		new Thread(()->System.out.println("Thread Started")).start();
	}

}
