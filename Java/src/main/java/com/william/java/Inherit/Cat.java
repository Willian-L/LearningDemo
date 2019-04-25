package com.william.java.Inherit;

import java.util.Objects;

public class Cat {

    public int weight = 100;

    // 使用toString方法可以输出该类所创建的对象的属性值
    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }

    // 如果想要判断两个对象的数据是否相同，就要重写equals方法，快捷键Alt+Insert快速生成
    @Override
    public boolean equals(Object o) {
        // 判断两个引用的值（地址）是否相同，相同返回true
        if (this == o) return true;
        // 如果另一个对象是空值，则放回false |或者| 两个引用的类对象是否相同，不相同则返回false
        if (o == null || getClass() != o.getClass()) return false;
        // 类对象如果相同，则强制转换对象的类型，只有类型相同才能比较
        Cat cat = (Cat) o;
        // 比较两个对象的属性值
        return weight == cat.weight;
    }

    /*
    同时生成的还有一个hashCode方法，是用来查找的
    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
    */
}
