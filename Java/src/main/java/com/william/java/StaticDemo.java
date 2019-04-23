package com.william.java;

class InstanceCounter{
    private static int numInstances = 0;    //声明一个私有的静态int类型变量，初始化为0
    /*
    定义一个受限制的静态方法，可以被同一个包内的其他类访问，为其他类提供一个获取成员变量的方法
     */
    protected static int getCount() {
        return numInstances;
    }
    /*
    静态内部类，定义一个独立于对象的静态方法，使用类变量进行操作
     */
    private static void addInstance() {
        numInstances++;
    }
    /*
    构造方法，定义一个对象，指定操作
     */
    InstanceCounter() {
        InstanceCounter.addInstance();
    }
}

public class StaticDemo {
    public static void main(String[] arguments) {
        System.out.println("Starting with " + InstanceCounter.getCount() + " instances");   //获取类变量的值
        for (int i = 0; i < 500; ++i){
            new InstanceCounter();  //实例化对象，调用构造方法初始化对象
        }
        System.out.println("Created " + InstanceCounter.getCount() + " instances");
    }
}
