package com.itheima.exam;

import javax.management.relation.Role;
import java.util.Random;

/*
 * @Auther:JarvanW
 * @Date:2023/7/11
 * @Description:游戏角色
 * @VERSON:1.7
 * @Requirement:
 */
public class User {
    private String name;
    private int blood;

    public User() {
    }

    public User(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }



    // 定义一个方法用于攻击别人
    // 思考：谁攻击谁？
    // Role r1 = new Role();
    // Role r2 = new Role();

    public void attack(User user) {
        //计算造成的伤害1~20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //还剩多少血
        int remainblood = user.getBlood() - hurt;
        if (remainblood < 0) {
            remainblood = 0;
        }
        user.setBlood(remainblood);

        //this表示方法的调用者
        System.out.println(this.getName() + "举起拳头，打了" + user.getName() + "一下，" +
                "造成了" + hurt + "点伤害，" + user.getName() + "还剩下" + remainblood + "点血");
    }
}
