package com.itheima.example.students;

/*
 * @Auther:JarvanW
 * @Date:2023/7/19
 * @Description:
 * @VERSON:1.7
 * @Requirement:
 */
public class StudentsTest {
    public static void main(String[] args) {
        //1.定义一个数组
        Students[] studentsArr = new Students[3];
        //2.创建学生对象并添加到数组中
        Students students1 = new Students(1, "zhangsan", 23);
        Students students2 = new Students(2, "lisi", 23);
        Students students3 = new Students(3, "wangwu", 23);

        studentsArr[0] = students1;
        studentsArr[1] = students2;
        studentsArr[2] = students3;


        Students students4 = new Students(4, "zhaoliu", 23);

        boolean flag = contains(studentsArr, students4.getId());
        if (flag == true) {
            System.out.println("已经存在");

        } else {
            System.out.println("不存在");
            //判断是否还能存
            int count = getCount(studentsArr);
            if (count == studentsArr.length) {
                // 已经存满
                // 创建一个新数组，长度 = 老数组的长度 + 1
                // 然后把老数组的元素，拷贝到新数组当中
                Students[] newArr = createNewArr(studentsArr);
                newArr[count] = students4;
                printArr(newArr);
            } else {
                // 没有存满
                // [stu1，stu2，null]
                // getCount获取到的是2，表示数组当中已经有了几个元素
                studentsArr[count] = students4;
                printArr(studentsArr);
            }

        }

        int index = getIndex(studentsArr,2);
        if (index >= 0){
            studentsArr[index] = null;
            printArr(studentsArr);

        }else {
            System.out.println("当前id不存在,删除失败");
        }

        int index2 = getIndex(studentsArr,3);
        if (index2 >= 0 ){
            Students students = studentsArr[index];

            int newAge = students.getAge() + 1;
            students.setAge(newAge);

        }else{
            System.out.println("当前id不存在，修改失败");
        }
    }


    // 打印
    public static void printArr(Students[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Students stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getId());
            }

        }

    }

    // 创建一个新的数组，长度 = 老数组的长度 + 1
    // 然后把老数组的元素，拷贝到新数组当中
    public static Students[] createNewArr(Students[] arr) {
        Students[] newArr = new Students[arr.length + 1];
        // 循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;

    }

    //数组中已经存了几个元素
    public static int getCount(Students[] studentsArr) {
        int count = 0;
        for (int i = 0; i < studentsArr.length; i++) {
            if (studentsArr[i] != null) {
                count++;
            }
        }
        return count;
    }


    //唯一性判断
    public static boolean contains(Students[] studentsArr, int id) {
        for (int i = 0; i < studentsArr.length; i++) {
            Students arr = studentsArr[i];
            if (arr != null) {
                int sid = arr.getId();
                if (sid == id) {
                    return true;
                }
            }

        }
        return false;

    }

    // 找到id在数组中的索引
    public static int getIndex(Students[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Students students = arr[i];
            if (students != null) {
                int sid = students.getId();
                if (id == sid){
                    return i;
                }
            }
        }
        return -1;


    }

}
