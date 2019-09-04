package com.luoExpress.generic;

public class MyGenericClass {
    public <E> void show(E e) {
        System.out.println(e.getClass());
    }

    public <T> T show2(T t) {
        return t;
    }

    public static void main(String[] args) {
        MyGenericClass mm = new MyGenericClass();

        mm.show("aaa");
        mm.show(12);
        mm.show(12.346);
        System.out.println(mm.show2("1"));
    }
}
