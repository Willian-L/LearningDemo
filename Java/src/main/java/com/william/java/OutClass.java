package com.william.java;

// 外部类OutClass
public class OutClass {

    // 外部类的私有属性
    private int a = 88;
    // 与内部类相同的成员变量
    private int b = 123;
    // 内部类Inner，类Inner在类OutClass的内部
    public class Inner {
        // 内部类的成员属性
        int b = 200;
        // 内部类的方法
        public void show() {
            System.out.println("测试访问成员属性：");
            System.out.println("访问外部类中的a：" + a);
            System.out.println("访问内部类中的b：" + b);
            System.out.println("访问外部类中的b：" + OutClass.this.b);
        }
    }

    /*
    静态内部类
     */
    // 外部类的静态变量
    static int c = 1;
    // 静态内部类
    public static class SInner {
        int c = 2;
        public void show(){
            System.out.println("\n测试静态内部类：");
            System.out.println("访问外部类中的c：" + OutClass.c);
            System.out.println("访问内部类中的c：" + c);
        }
    }

    /*
    方法内部类
     */
    // 外部类的方法
    public void show(){
        // 外部类方法中的常量
        final int d = 10;
        //方法内部类
        class MInner {
            int e = 20;
            public void print(){
                System.out.println("\n测试方法内部类：");
                System.out.println("访问外部类方法中的常量d：" + d);
                System.out.println("访问内部类中的变量e：" + e);
            }
        }
        // 创建方法内部类的对象
        MInner mInner = new MInner();
        // 调用内部类的方法
        mInner.print();
    }


    public static void main(String[] args) {

        // 创建外部类对象
        OutClass out = new OutClass();
        // 创建内部类对象
        Inner in = out.new Inner();
        // 调用内部类对象的方法
        in.show();

        // 直接创建静态内部类的对象
        SInner sInner = new SInner();
        // 调用静态内部类中的方法
        sInner.show();
        //调用内部类的变量
        System.out.println("其他类访问内部类中的c：" + sInner.c);

        //调用外部类的方法
        out.show();
    }
}
