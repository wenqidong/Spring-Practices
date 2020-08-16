package com.dong.java.string;

public class StringPractice {

    private static final Integer MAX_LOOP_NUMBER = 10000;

    public static void main(String[] args) {
        StringPractice stringPractice = new StringPractice();
        stringPractice.StringCat();
        stringPractice.StringBuildAppend();
    }

    private void StringCat() {
        String result1 = "";
        long startPoint = System.currentTimeMillis();
        for (int i = 0; i < MAX_LOOP_NUMBER; i++) {
            result1 += String.valueOf(i);
        }
        long endPoint = System.currentTimeMillis();
        System.out.println("String Object Contact Spend \t\t" + (endPoint - startPoint));
    }

    private void StringBuildAppend() {
        StringBuilder sb = new StringBuilder();
        long startPoint1 = System.currentTimeMillis();
        for (int i = 0; i < MAX_LOOP_NUMBER; i++) {
            sb.append(i);
        }
        long endPoint1 = System.currentTimeMillis();
        System.out.println("StringBuilder Object Contact Spend \t" + (endPoint1 - startPoint1));
    }
}
