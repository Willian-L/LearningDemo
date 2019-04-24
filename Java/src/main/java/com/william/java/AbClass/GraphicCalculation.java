package com.william.java.AbClass;

/*
抽象类
 */
// 创建一个抽象类
public abstract class GraphicCalculation {

    // 创建抽象方法约束GraphicCalculation只可以计算图形的面积和周长，分别传入三个参数
    public abstract void area(double a, double b, double r);

    public abstract void perimeter(double a, double b, double r);
}

