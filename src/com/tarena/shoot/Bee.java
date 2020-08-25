package com.tarena.shoot;

import java.util.Random;

public class Bee extends FlyingObject implements Award{
    /**
     * 接口实现要重写接口的所有方法
     * @return int
     */
    private int xspeed = 1;//x移动步数   private 仅限本类可用
    private int yspeed = 2;//y移动步数
    private int awardType;//奖励类型（1或0）

    public Bee(){

        image = ShootGame.bee;
        width = image.getWidth();
        height = image.getHeight();
        Random rand = new Random();
        x = rand.nextInt(ShootGame.WIDTH-this.width);
        y = -this.height;
        awardType = rand.nextInt(2);
    }


    public int getType(){
        return awardType;
    }
}
