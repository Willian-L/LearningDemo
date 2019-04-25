package com.william.java.Inherit;

/*
Animal没有指定继承那个类，系统默认认为它是继承Object类
 */
public class Animal {
    // 定义一个final变量（即常量），static final会使其成为全局常量
    static final int AGE = 5;
    // 定义一个inherit变量
    public int weight = 100;
    // 定义一个公有的String类型变量，没有手动初始化
    public String name;
    // 定义一个私有的变量
    // 该属性不会进行隐式初始化，需要手动初始化或者在构造方法中初始化
    private final String color;

    // 定义一个公有的方法
    public void eat(){
        System.out.println("吃东西");
    }

    // 定义一个final方法
    public final void sleep(){
        System.out.println("睡觉");
    }

    // 定义一个有参的构造方法
    public Animal(String color){
        this.color = color;
        System.out.println("\n生成父类的构造方法，参数color is " + color);
    }

    public String getColor() {
        return color;
    }
}
