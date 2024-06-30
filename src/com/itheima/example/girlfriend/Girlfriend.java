package com.itheima.example.girlfriend;

/*
 * @Auther:JarvanW
 * @Date:2023/7/17
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class Girlfriend {
    private String name;
    private int age;
    private String sex;
    private String hobby;


    public Girlfriend() {
    }

    public Girlfriend(String name, int age, String sex, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String toString() {
        return "Girlfriend{name = " + name + ", age = " + age + ", sex = " + sex + ", hobby = " + hobby + "}";
    }
}
