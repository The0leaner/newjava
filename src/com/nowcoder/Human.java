package com.nowcoder;

/**
 * Created by lenovo on 2017/4/2.
 */
public class Human extends Animal {
    private String country;

    /**
     * 继承的演示，可以用super引用父类构造函数的参数
     * @param name
     * @param age
     * @param country
     */
    public Human(String name, int age , String country){
        super(name , age);
        this.country = country;
    }

    /**
     * 多态//对方法的再次实现
     */
    @Override
    public void ssy() {
        //super.ssy();
        System.out.println("This is human from" + country);
    }
}
