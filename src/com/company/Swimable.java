package com.company;

public interface Swimable{
    default void Swim(){
        System.out.println("swiming");
    }

}
