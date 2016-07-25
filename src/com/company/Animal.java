package com.company;

/**
 * Created by weidi on 2016/7/25.
 */
public class Animal implements talking{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int age;

   public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void say(){
        System.out.println("This is Animal");
    }
}
