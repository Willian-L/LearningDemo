package com.william.java.AbClass;

/*
测试抽象类
 */
public class AbTest {
    public static void main(String[] args) {

        // 使用抽象类的父引用指向子类对象
        // 计算矩形的面积和周长
        GraphicCalculation rectangle = new Rectangle();
        rectangle.area(3, 4, 0);
        rectangle.perimeter(3, 4, 0);

        // 计算圆形的面积和周长
        GraphicCalculation round = new Round();
        round.area(0, 0, 5);
        round.perimeter(0, 0, 5);
    }
}
