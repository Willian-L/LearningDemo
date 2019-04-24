package com.william.java.AbClass;

// 创建一个类Rectangle继承抽象类
public class Rectangle extends GraphicCalculation {

    // 计算矩形面积
    @Override
    public void area(double a, double b , double r) {
        double area = a * b;
        System.out.println("长宽分别为 " + a + " 和 " + b +" 的矩形的面积为：" + area);
    }

    // 计算矩形周长
    @Override
    public void perimeter(double a, double b , double r) {
        double perimeter = 2 * (a + b);
        System.out.println("长宽分别为 " + a + " 和 " + b +" 的矩形的周长为：" + perimeter);
    }
}