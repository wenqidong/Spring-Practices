package com.dong.java.protocol;

public interface InnerClassInf {

    /**
     * 打印输出
     */
    void show();

    /**
     * 任何放在接口中的方法自动地是public和static
     * 因此此处是一个嵌套类
     *
     * 用法：1、某些被该接口所有不同实现所共用的代码
     *      2、用该类来写测试类，产品打包前可以简单的删除InnerClassInf$InnerClassInfTester.class
     */
    class InnerClassInfTester implements InnerClassInf{

        public static void main(String[] args) {
            new InnerClassInfTester().show();
        }

        public void show() {
            System.out.println("This is a test!");
        }
    }

}
