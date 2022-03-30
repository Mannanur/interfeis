package com.company;

public class Main {

    public static void main(String[] args) {

        Swimable shark = new Shark();
        Swimable shark1 = new Shark();
        Swimable shark2 = new Shark();
        Swimable shark3 = new Shark();
        Swimable shark4 = new Shark();
        Swimable duck = new Duck();
        Swimable duck1 = new Duck();
        Swimable duck2 = new Duck();
        Swimable duck3 = new Duck();
        Swimable duck4 = new Duck();
        Swimable turtle = new Turtle();
        Swimable turtle1 = new Turtle();
        Swimable turtle2 = new Turtle();
        Swimable turtle3 = new Turtle();
        Swimable turtle4 = new Turtle();
        Swimable[] okeanarium= new Swimable[]{shark,shark1,shark2,shark3,shark4,
                                                duck,duck1,duck2,duck3,duck4,
                                                turtle,turtle1,turtle2,turtle3,turtle4};
        shark.Swim();
        turtle.Swim();
        duck.Swim();
    }
}
