package com.tarena.shoot;

import java.awt.image.BufferedImage;


/**
 * 英雄级
 */
public class Hero extends FlyingObject{
    private int life;//命
    private int doubleFire;//火力值
    private BufferedImage[] images;//图片数组
    private int index;

    public Hero(){
        image = ShootGame.hero0;//引入图片
        width = image.getWidth();
        height = image.getHeight();
        x = 300;//定义启动页飞机的x位置
        y = 400;//定义启动页飞机的y位置
        this.life = 3;
        this.doubleFire = 0;//默认单倍火力
        images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1};//新建图片数组对象
        this.index = 0;
    }

}
