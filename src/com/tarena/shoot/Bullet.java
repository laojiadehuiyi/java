package com.tarena.shoot;

import com.tarena.shoot.FlyingObject;

import java.util.Random;

/**
 * 子弹只是没有其他属性
 */

public class Bullet extends FlyingObject {
    private int speed = 3;//子弹的步数

    public Bullet(int x,int y){//子弹本身没有位置，随英雄机的位置而改变，采用传参数获取位置
        image = ShootGame.bullet;//引入土拍你
        width = image.getWidth();
        height = image.getHeight();
        this.x = x;
        this.y = y;

         
    }
}
