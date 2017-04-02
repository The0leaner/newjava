package com.nowcoder;

/**
 * Created by lenovo on 2017/4/2.
 */
public class Animal implements Talking {

    private int age;
    private String name;

    public Animal(String name , int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void ssy() {
        System.out.println(name +"Animal Saying");
    }
}
