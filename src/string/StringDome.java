package string;

/**
 * 这是一个StringBuilder Dome 类
 * 目的：了解上面声明类的用法
 * JAVA中字符串类用String类表示，但是String类有一个最大的问题，就是字符串常量一旦声明不可改变
 * 但是改变的是内存地址的指向，  所以string类不适合用于频繁修改字符串操作上，所以要用StringBuilder或
 * StringBuffer类来定义，
 * StringBuilder与StringBuffer区别在于线程安全，StringBuilder是一个新函数，线程相对不安全；
 * java中每个类都是一个对象object，
 */
public class StringDome {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("a");
        for (int i = 0; i < 10; i++) {
            str = str.append("a");
        }
        String strb = str.toString();
        System.out.println(strb);
    }
    /**
     * 简述String 的工作机制
     * 创建字符串   str = "a";
     * str          ->指针1          内存            "a"
     * str          ->指针2          新的内存区域     "aa"
     * ……
     * 以此类推  那么内存得不到释放，容易程序造成内容溢出；
     *
     *
     *
     * stringBuilder 的工作机制
     * str          ->指针1          内存            "a"
     * str          ->指针1          更新原指针内存区域 变为     "aa"
     * ……
     * 无论怎么变只有1个字符串
     */
}
