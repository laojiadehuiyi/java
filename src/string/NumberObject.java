package string;

/**
 * @ClassName: Description:如果我们需要数据数字对象的时候  我们可以用new Integer(), 需要数字的时候可以直接用
 * int i;  根据实例的需要我们选择  需要对象还是数字；
 * @author:Administrator
 * @Date:2020/9/14
 * @Version: v1.1.0
 * @Param
 */


public class NumberObject {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(128);
        Integer i2 = Integer.valueOf(128);
        System.out.println(i1==i2);
        //输出结果为 false  这是因为Integer.valueOf的值范围是在 -128 -127对象会重用；超出此范围会创建新的对象；
        Integer i3 = Integer.valueOf(-128);
        Integer i4 = Integer.valueOf(-128);
        System.out.println(i3==i4);
        //输出结果为 true; 在此我们在创建Integer对象时 数字范围在上注释范围内，建议使用Integer.valueOf，超出范围 使用new Integer();
        //在此我们需要注意的是，所输出的值是否超出范围  / 调用方法所取的位数；

        /***
         * 我们jdk对数字类型的对象都进行了包装类的封装；
         * 在此我们 记住两个数组类型的包装类的常量分别是MAX_VALUE\MIN_VALUE;
         * 使用方法如下代码所示
         */

        double i5 = Double.MAX_VALUE;
        double i6 = Double.MIN_VALUE;
        System.out.println(i5);
        System.out.println(i6);
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        System.out.println(i7);
        System.out.println(i8);

    }
}
