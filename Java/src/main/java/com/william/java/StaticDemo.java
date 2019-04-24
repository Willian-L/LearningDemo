package com.william.java;

class InstanceCounter {
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

class MethodsAndVariables {
    String name = "Andy";
    /*
    静态变量
    */
    static String hobby = "dancing";

    /*
    静态方法
    */
    public static void doing() {
        System.out.println("调用了静态方法");

        /*
        在静态方法调用非静态变量
        */
        //直接调用静态变量
        System.out.println("my hobby is " + hobby);

        //直接调用非静态变量，报异常
//        System.out.println("hello，" + name );

        //创建类的对象
        MethodsAndVariables hisName = new MethodsAndVariables();

        //通过对象来实现在静态方法中调用非静态变量
        System.out.println("hello，" + hisName.name);
    }

    /*
    在普通成员方法中，则可以直接访问同类的非静态变量和静态变量
     */
    public void show() {
        System.out.println("调用了非静态方法");
        //直接调用静态变量
        System.out.println("my hobby is " + hobby);

        //直接调用非静态变量
        System.out.println("hello，" + name + "\n");
    }
}

class CodeBlock {
    /*
    静态代码块测试
     */
    //声明非静态变量num1 , num2;
    int num1, num2;

    //声明静态变量num3
    static int num3;

    //构造方法
    public CodeBlock() {
        num1 = 99;
        System.out.println("通过构造方法为变量num1赋值");
    }

    //初始化块
    {
        num2 = 88;
        System.out.println("通过初始化块为变量num2赋值");
    }

    //静态初始化块
    static {
        num3 = 77;
        System.out.println("通过静态初始化块为变量num3赋值");
    }
}

public class StaticDemo {

    public static void main(String[] arguments) {
        System.out.println("static + 构造方法：");
        System.out.println("Starting with " + InstanceCounter.getCount() + " instances");   //获取类变量的值
        for (int i = 0; i < 500; ++i) {
            new InstanceCounter();  //实例化对象，调用构造方法初始化对象
        }
        System.out.println("Created " + InstanceCounter.getCount() + " instances\n");

        System.out.println("静态方法 + 静态变量测试：");
        /*
        通过类名、对象名两种方法使用静态变量
         */
        //直接通过类名使用静态变量，无需创建类的对象
        System.out.println("通过类名访问hobby：" + MethodsAndVariables.hobby);

        //创建类的对象
        MethodsAndVariables myHobby = new MethodsAndVariables();

        //使用对象名来访问静态变量
        System.out.println("通过对象名访问hobby：" + myHobby.hobby);

        //使用对象的形式修改静态变量的值
        myHobby.hobby = "singing";

        //再次使用类名访问静态变量，测试值是否被修改
        System.out.println("通过类名访问hobby：" + MethodsAndVariables.hobby + "\n");

        /*
        通过类名、对象名两种方法使用静态方法
         */
        //直接使用类名调用静态方法
        MethodsAndVariables.doing();

        //通过对象名调用
        MethodsAndVariables people = new MethodsAndVariables();
        people.doing();

        /*
        静态方法中不能直接调用非静态方法，需要通过对象来访问非静态方法。
         */
        MethodsAndVariables common = new MethodsAndVariables();
        common.show();

        System.out.println("静态初始化块测试：");
        //第一次创建类的对象
        CodeBlock codeBlock = new CodeBlock();
        System.out.println("num1:" + codeBlock.num1);
        System.out.println("num2:" + codeBlock.num2);
        System.out.println("num3:" + CodeBlock.num3);

        //第二次创建类的对象
        CodeBlock codeBlock1 = new CodeBlock();
    }
}
