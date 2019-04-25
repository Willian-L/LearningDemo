package com.william.java.Inherit;

public class Dog extends Animal {

    /*
    如果子类中没有显式调用父类的构造方法，而父类又没有无参的构造方法，则编译出错。
    如果父类是定义了有参的构造方法，那么子类必须 super.(父类的参数) 或者父类中添加一个无参的构造方法，否则出错。
    */
    public Dog(){
        super("yellow");
        System.out.println("生成子类的构造方法，变量color is " + super.getColor());
    }

//    super();    // 父类中含有有参构造方法，直接使用super();调用会报错，因为super();调用的是父类无参的构造方法
    public Dog(String color) {
        super(color);
        System.out.println("调用了父类的构造方法，color is " + color);
    }

    public void call(){
        // static final 修饰的变量可直接调用
        System.out.println("\n调用父类static final修饰的变量，AGE = " + AGE);
        // 父类中普通成员变量需要通过super.weight调用
        System.out.println("调用父类的普通成员变量，weight = " + super.weight);
    }

    public void method(){
        // 子类可直接调用父类的方法
        System.out.println("\n子类可直接调用父类的方法：");
        super.eat();
    }

    public void eat(){
        // 子类可重写调用父类的非final修饰的方法
        System.out.println("\n子类可重写父类的非final修饰的方法：");
        System.out.println("狗在吃东西");
    }
}
