package com.tiaedu.demo;

public class Notepad {

    public Notepad() {
        System.out.println("Constructor of Notepad without parameters..."+this.toString());

    }
    public void init(){
        System.out.println("Init-method of Notepad....");
    }
    public void destroy(){
        System.out.println("Destroy method of Notepad....");
    }

}
