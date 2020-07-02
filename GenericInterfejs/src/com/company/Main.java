package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here

        GenericInterfejso<G> bey = new GenericInterfejso<G>(new G());
        bey.doRunTest();
        GenericInterfejso<F> bez = new GenericInterfejso<F>(new F());
        bez.doRunTest();
    }
}
