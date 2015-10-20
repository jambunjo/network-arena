package common;

import javafx.scene.image.Image;
import java.util.*;

public class Job {
    private int hp;
    private int attack;
    private int defense;
    private String job;
    private Image image;
    private String action1;
    private String action2;
    private String action3;

    public Job(String job){
        if(job == "Melee")
            setMelee();
            
        if(job == "Magic")
            setMagic();
            
        if(job == "Range")
            setRange();
    }

    public Job(String job, int hp, int attack, int defense, String action1, String action2, String action3, String image){
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.job = job;
        this.action1 = action1;
        this.action2 = action2;
        this.action3 = action3;
        this.image = new Image("/ui/images/"+ image + ".png", 50, 75, false, false);;
    }

    private void setMelee(){
        Random rnd = new Random();
    	rnd.setSeed(System.currentTimeMillis());
        this.hp = rnd.nextInt(50) + 400;
        this.attack = rnd.nextInt(20) + 100;
        this.defense = rnd.nextInt(10) + 60;
        this.job = "Melee";
        this.action1 = "Attack";
        this.action2 = "Defend";
        this.action3 = "Whirlwind";
        this.image = new Image("/ui/images/melee.png", 50, 75, false, false);
    }

    private void setMagic(){
        Random rnd = new Random();
    	rnd.setSeed(System.currentTimeMillis());
        this.hp = rnd.nextInt(50) + 300;
        this.attack = rnd.nextInt(20) + 140;
        this.defense = rnd.nextInt(10) + 50;
        this.job = "Magic";
        this.action1 = "Attack";
        this.action2 = "Guard";
        this.action3 = "Firestorm";
        this.image = new Image("/ui/images/magic.png", 50, 75, false, false);
    }

    private void setRange(){
        Random rnd = new Random();
    	rnd.setSeed(System.currentTimeMillis());
        this.hp = rnd.nextInt(50) + 350;
        this.attack = rnd.nextInt(20) + 90;
        this.defense = rnd.nextInt(10) + 80;
        this.job = "Range";
        this.action1 = "Attack";
        this.action2 = "Hide";
        this.action3 = "Multishot";
        this.image = new Image("/ui/images/range.png", 50, 75, false, false);
    }

    public int getHp()
        return hp;

    public int getDefense()
        return defense;

    public int getAttack()
        return attack;

    public String getJob()
        return job;

    public String getAction1()
        return action1;

    public String getAction2()
        return action2;

    public String getAction3()
        return action3;

    public Image getImage()
        return image;
}
