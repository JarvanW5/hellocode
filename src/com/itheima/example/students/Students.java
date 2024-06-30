package com.itheima.example.students;

/*
 * @Auther:JarvanW
 * @Date:2023/7/19
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class Students {
    private int id;
    private String name;
    private int age;


    public Students() {
    }

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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

    public String toString() {
        return "Students{id = " + id + ", name = " + name + ", age = " + age + "}";
    }
}
