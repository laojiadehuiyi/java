package string;

/**
 * 根据名称可知我们是测试 自动根据私有变量生成 getParam and setParam
 * 生成方法：定义 private 变量的类，在类变量的下方
 * eclipse右键 source -> getters and ^
 * idea直接在类中敲 get 直接会出现 get+私有变量的名称；
 *
 */
public class AutoProductgettersAndSetters {
    public static void main(String[] args) {
        AutoProductgettersAndSetters objecta = new AutoProductgettersAndSetters(10,30);
        /**
         * 在此我们注意java所有的类都是继承Object，因此我们没有定义toString方法，也是会输出下例；
         *object.toString()   输出结果为 string.AutoProductgettersAndSetters@1b6d3586
         *  输出格式：报名.+函数名+对象的内存地址;
         *在实际过程中 这个输出结果没有实质作用；
         *
         * 当重写toString()方法后，输出为指定的方法内容；
         * 输出结果为 x=10，y=30
         */
//        System.out.println(objecta.getX());
//        System.out.println(objecta.toString());

    }

    private int x;
    private int y;
    AutoProductgettersAndSetters(int x,int y){
        this.x = x;
        this.y = y;

    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        return "x=" + this.x + "，y=" + this.y;
    }
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        if (obj instanceof AutoProductgettersAndSetters){
           AutoProductgettersAndSetters a =  (AutoProductgettersAndSetters) obj;//这里有一次对象强制转换
           return a.getX() == this.getX() && a.getY() == this.getY();
        }
        /**
         * 以上三项是重写equals的建议常用方法
         *
         * 同时我们在对obj对象判断时，我们要判断它的属性值是否一致；
         */
        if (this.getClass()==obj.getClass()){
            return true;
        }

        return false;
    }
}
