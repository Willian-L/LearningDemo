package com.william.java.Inherit;

public class InheritTest {

    public static void main(String[] args) {
        // 测试父类和子类构造方法生成顺序，调用子类构造方法前会先调用父类的构造方法
        Dog dog = new Dog();
        Dog dog1 = new Dog("black");

        // 测试子类调用父类的成员变量
        dog.call();

        // 测试子类直接调用父类的方法
        dog.method();

        // 测试子类重写父类的方法
        dog1.eat();
    }
}
