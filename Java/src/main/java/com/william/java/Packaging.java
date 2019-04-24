package com.william.java;

/*
构造方法和封装的练习
 */


class TelephoneOne {
    float screen;
    float cpu;
    float mem;

    //创建无参构造方法
    public TelephoneOne() {
        System.out.println("执行了无参的构造方法");
    }

    //创建有参构造方法
    public TelephoneOne(float screen, float cpu, float mem) {
        //对输入的参数添加限制
        if (screen < 3.5f) {
            this.screen = 3.5f;
            System.out.println("您输入的数据不正确，设置了一个最小的默认值 " + "screen = " + this.screen);
        } else {
            this.screen = screen;
        }
        this.cpu = cpu;
        this.mem = mem;
        System.out.println("执行了有参的构造方法");
        System.out.println("screen = " + this.screen + "cpu = " + this.cpu + "mem = " + this.mem);
    }
}

class TelephoneTwo {
    /*
    设置三个私有的成员变量
     */
    private float screen;
    private float cpu;
    private float mem;

    public void cpuFrom() {
        System.out.println("From Intel");
    }

    //创建getter方法获取成员变量的值
    public float getScreen() {
        return screen;
    }

    //创建setter方法修改成员变量的值，并添加限制
    public void setScreen(float screen) {
        this.screen = screen;
        if (screen < 3.5f) {
            this.screen = 3.5f;
            System.out.println("您输入的数据不正确，设置了一个最小的默认值 " + "screen = " + this.screen);
        } else {
            this.screen = screen;
        }
    }

    public float getCpu() {
        return cpu;
    }

    //创建setter方法修改成员变量的值，并调用成员方法
    public void setCpu(float cpu) {
        this.cpu = cpu;
        this.cpuFrom();
    }

    public float getMem() {
        return mem;
    }

    public void setMem(float mem) {
        this.mem = mem;
    }
}

public class Packaging {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
        构造方法
         */
        System.out.println("构造方法：");
        //通过无参的构造方法创建对象
        TelephoneOne phone1 = new TelephoneOne();
        //通过有参的构造方法创建对象，并给对象中的实例变量赋初值
        TelephoneOne phone2 = new TelephoneOne(1.5f, 1.4f, 2.0f);

        /*
        封装
         */
        System.out.println("\n封装：");
        TelephoneTwo telephone = new TelephoneTwo();
        telephone.setScreen(2.0f);
        telephone.setCpu(6.0f);
        telephone.setMem(7.0f);
        System.out.println("screen = " + telephone.getScreen() + "cpu = " + telephone.getCpu() + "mem = " + telephone.getMem());
    }
}
