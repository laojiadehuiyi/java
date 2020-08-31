package string;

/**
 * @ClassName: Description:
 * @author:Administrator
 * @Date:2020/8/31
 * @Version: v1.1.0
 * @Param
 */

/**
 * 用于演示说明 ==   与equals
 */
public class TestEquals {
    public static void main(String[] args) {
        AutoProductgettersAndSetters a1 = new AutoProductgettersAndSetters(10,20);
        AutoProductgettersAndSetters a2 = new AutoProductgettersAndSetters(10,20);

        System.out.println(a1==a2);//false
        System.out.println(a1.equals(a2));//false
        /**
         * 按理 == 是判断两个对象的内存地址，false是合理的；
         * 但是.equals是判断两个对象像不像，按理应该是 同一个对象新建的应该是 true才对的；
         * 注意：默认的 equals的方法就是调用的object类定义的方法；
         *
         * 我们可以通过三下shift或者 CTRL+n 选择Classes 选项卡，设置Project and Libraries;
         * 输出要输出的 类名；
         * object对象默认定义如下，
         * public boolean equals(Object obj) {
         *         return (this == obj);
         *     }
         *
         *     那么结果可想而知a1.equals 就是   a1==a2;当然为false;
         *
         *     因此我们在使用时需要重写 equals； 返回true;
         *     public boolean equals(Object obj){
         *         if (this.getClass()==obj.getClass()){
         *             return true;
         *         }
         *
         *         return false;
         *     }
         */


    }


}
