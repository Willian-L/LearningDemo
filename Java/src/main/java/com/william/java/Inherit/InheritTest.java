package com.william.java.Inherit;

public class InheritTest {

    public static void main(String[] args) {
        // 测试父类和子类构造方法生成顺序，调用子类构造方法前会先调用父类的构造方法
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("black");

        // 测试子类调用父类的成员变量
        dog1.call();

        // 测试子类直接调用父类的方法
        dog1.method();

        // 测试子类重写父类的方法
        dog2.eat();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        // 输出对象在内存中的地址，每new一次会开辟一个新的内存地址，每次的并不相同
        System.out.println("\ndog1对象在内存中的地址：" + dog1
                + "\ndog2对象在内存中的地址：" + dog2);
        // 因此dog1.equals(dog2)为false，equals()方法比较的是对象的引用是否指向同一个地址，而 引用对象==引用对象 与前者的作用效果是一样的
        System.out.println("dog1和dog2的内存地址是否相等："+ dog1.equals(dog2));
        System.out.println("dog1和dog2的内存地址是否相等："+ (dog1 == dog2));

        // 如果类中含有toString方法，以下输出就会是对象的属性值
        System.out.println("\ncat1对象在内存中的属性值：" + cat1
                + "\ncat2对象在内存中的属性值：" + cat2);
        // 重写equals()方法后可以比较两个对象的属性值是否相等
        System.out.println("cat1和cat2的属性值是否相等："+ cat1.equals(cat2));
    }
}
