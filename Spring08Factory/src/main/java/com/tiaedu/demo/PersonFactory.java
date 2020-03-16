package com.tiaedu.demo;

public class PersonFactory {

    //static factory method
    public static Person createPerson1(){
        System.out.println("static factory method to create Person...");
        return new Person();
    }

    public Person createPerson2(){
        System.out.println("non-static factory method to create Person...");
        return new Person();
    }

}
