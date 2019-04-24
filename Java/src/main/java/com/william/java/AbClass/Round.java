package com.william.java.AbClass;

// 引入圆周率所在的包
import java.lang.Math;

// 创建一个类CellPhone继承抽象类
public class Round extends GraphicCalculation {

    @Override
    public void area(double a, double b , double r) {
        double area = r * r * Math.PI;
        System.out.println("半径为 " + r +" 的圆形的周长为：" + area);
    }

    @Override
    public void perimeter(double a, double b , double r) {
        double perimeter = 2 * r * Math.PI;
        System.out.println("半径为 " + r +" 的圆形的周长为：" + perimeter);
    }
}