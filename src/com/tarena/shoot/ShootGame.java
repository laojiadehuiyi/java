package com.tarena.shoot;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
/**
 * 主程序
 */
public class ShootGame extends JPanel{
    /**
     * 定义窗口
     * @param WIDTH
     * @param HEIGHT
     *
     */
    public static final int WIDTH = 480;
    public static final int HEIGHT = 720;
    public static BufferedImage background;
    public static BufferedImage start;
    public static BufferedImage pause;
    public static BufferedImage gameover;
    public static BufferedImage airplane;
    public static BufferedImage bee;
    public static BufferedImage bullet;
    public static BufferedImage hero0;
    public static BufferedImage hero1;
    private Hero hero = new Hero();
    private FlyingObject[] flyingObject = {};
    private Bullet[] bullets = {};
    ShootGame(){
         hero = new Hero();
         flyingObject = new FlyingObject[2];
         flyingObject[0] = new Airplane();
         flyingObject[1] = new Bee();
         Bullet[] bullets = new Bullet[1];
         bullets[0] = new Bullet(100,200);
    }

    static {
        //初始化静态资源（图片）
        try {
            background = ImageIO.read(ShootGame.class.getResource("background.png"));
            start = ImageIO.read(ShootGame.class.getResource("start.png"));
            pause = ImageIO.read(ShootGame.class.getResource("pause.png"));
            gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));
            airplane = ImageIO.read(ShootGame.class.getResource("airplane.png"));
            bee = ImageIO.read(ShootGame.class.getResource("bee.png"));
            bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
            hero0 = ImageIO.read(ShootGame.class.getResource("hero0.png"));
            hero1 = ImageIO.read(ShootGame.class.getResource("bero1.png"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Fly");//新建一个窗口及标题
//        ShootGame shootGame = new ShootGame();//ShootGame 继承了 JPanel面包，因此在此新建对象就是在给窗口增加面板
//        frame.add(shootGame);//将对象放在窗口中
//        frame.setSize(WIDTH,HEIGHT);//设置窗口的大小
//        frame.setAlwaysOnTop(true);//对象向上对齐
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出时干啥
//        frame.setLocationRelativeTo(null);//
//        frame.setVisible(true);//设置可用    继承panel会有默认paint方法
//        //以上是画面板
//
//    }

    public void paint(Graphics g){
        g.drawImage(background,0,0,null);
        paintHero(g);
//        paintBullt(g);
    }



    public void paintHero(Graphics g){//画英雄级
        g.drawImage(hero.image,hero.x,hero.y,null);
    }

    public void paintBullt(Graphics g){
        for (int i=0;i<bullets.length;i++){
            g.drawImage(bullets[i].image,bullets[i].x,bullets[i].y,null);
        }
    }

}
