package com.tarena.shoot;

import java.util.Random;

public class Airplane extends FlyingObject implements Enemy{
    private int speed = 2;//走的步数
    //接口 -重写接口的所有方法

    public Airplane(){
        image = ShootGame.airplane;
        width = image.getWidth();
        height = image.getHeight();
        y = -height;
        Random rand = new Random();
        x = rand.nextInt(ShootGame.WIDTH-width);

    }
    public int getScore(){
        return 5;
    }
}
