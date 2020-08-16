package com.dong.java.anonymous;

import com.dong.java.protocol.AbstractInnerClass;
import com.dong.java.protocol.InnerClassInf;

/**
 * 匿名内部类练习
 * @author wenqi
 */
public class AnonymousClass {

    public static void main(String[] args) {
        AnonymousClass anonymousClass = new AnonymousClass();
        anonymousClass.getInstance("I am inner class impl!").show();
        anonymousClass.getInstanceWithVar("I am inner class impl").show();
        InnerStaticClass.show("I am static inner class");
    }

    /**
     * 匿名内部类基类为接口
     * 使用外部定义的参数，则参数需要定义为final
     * @param msg msg
     * @return 匿名内部类
     */
    private InnerClassInf getInstance(final String msg) {
        return new InnerClassInf() {
            public void show() {
                System.out.println("Inner class function, " + msg);
            }
        };
    }

    /**
     * 匿名内部类基类为抽象类
     * 参数被传递给匿名类的基类的构造器，并不会在匿名内部类被直接使用，没有被定义为final
     * @param msg msd
     * @return 匿名内部类
     */
    private AbstractInnerClass getInstanceWithVar(String msg) {
        return new AbstractInnerClass(msg) {
            @Override
            public void show() {
                System.out.println("Inner class function with var, " + msg);
            }
        };
    }

    /**
     * static匿名内部类，即嵌套类
     * 不需要与外围类对象之间有联系，且可以有static数据、字段
     */
    protected static class InnerStaticClass {
        static void show(String msg) {
            System.out.println("Static inner class function, " + msg);
        }
    }
}
