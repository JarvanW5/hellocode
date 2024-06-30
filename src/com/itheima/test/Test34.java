package com.itheima.test;

/*
 * @Auther:JarvanW
 * @Date:2023/7/11
 * @Description:类和对象
 * @VERSON:1.7
 * @Requirement:
 */
public class Test34 {

    /*
    public class 类名{
    1、成员变量  （代表属性，一般是名词）
    2、成员方法  （代表行为，一般是动词）
    3、构造器
    4、代码块
    5、内部类

    Class Phone
    // 属性（成员变量）
    String brand;
    double price;

    // 行为（方法）
    public void call(){
    }
    public void playGame(){
    }

    封装：对象代表什么，就得封装对应的数据，并提供数据对应的行为、

    }
     */

    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    public Test34() {
    }

    public Test34(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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


    //快捷键：alt + insert

}

