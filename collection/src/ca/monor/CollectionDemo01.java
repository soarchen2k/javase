package ca.monor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 1. 接口是不可以实例化的
 * 2. 接口（抽象父类）引用可以通过向上造型的方法去接收子类对象
 * 3. 如果想不通过子类或者实现类，我们可以通过匿名内部类的方式直接创建接口(抽象父类)对象
 * <p>
 * isEmpty : 容器内的元素是否存在
 * null : 容器是否存在
 */

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection collection = new ArrayList(); //如果不指定泛型的时候，容器中可以放任意类型
        collection.add(1); // 这里的 1 是 Integer 类型的，不是 Int，因为容器中只能存放对象
        collection.add("Dal");
        collection.add(true);
        collection.add(1);
        System.out.println(collection);
        boolean b = collection.remove("Da"); // 参数不是下标(index)，而是 value
        System.out.println(b);
//        CollectionDemo02.clear();
        System.out.println(collection);

        Collection<String> collection1 = new ArrayList(); // 通常使用时需要指定泛型，否则会出错
    }
}
