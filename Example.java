package com.company;

class Bird {
    void eyes() {
        System.out.println("Eyes");
    }
    void wings() {
        System.out.println("Wings");
    }
}

class Pigeon extends Bird {
    void fly() {
        System.out.println("Pigeon is flying");
    }
}

public class Example {
    public static void main(String[] args ) {
        // super class reference sub-class object is possible.
        Bird b = new Pigeon();


        // sub-class reference super-class object is not possible.
        Pigeon p = (Pigeon) new Bird();


        // but sub-class reference super-class object type cast to sub-class is possible.
        //Pigeon p = (Pigeon) new Bird();

        // sub-class reference to sub-class is possible.
        Pigeon pi = new Pigeon();
        pi.fly();
    }
}
