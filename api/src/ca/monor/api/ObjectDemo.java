package ca.monor.api;

/**
 * 多态 poly
 * public boolean equals(Object obj) { 只要在JAVA中不额外声明，所有的比较都是 value 比较
 * return (this == obj);
 * <p>
 * 对于我们的基本类型，直接比较 Value
 * 对于引用类型，system, custom, 如果不 OverRide， equals 将比较的是对象的地址
 */

public class ObjectDemo {


    public static void main(String[] args) {

        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println(object1.equals(object2));
    }
}
