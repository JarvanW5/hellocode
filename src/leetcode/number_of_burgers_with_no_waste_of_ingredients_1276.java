package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:JarvanW
 * @Date:2023/12/26
 * @Description:不浪费原料的汉堡制作方案
 * @Version:1.8
 * @Requirement:
 */
public class number_of_burgers_with_no_waste_of_ingredients_1276 {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if (tomatoSlices % 2 != 0 || tomatoSlices < cheeseSlices * 2 || cheeseSlices * 4 < tomatoSlices) {
            return new ArrayList<>();
        }else{
            List<Integer> ans = new ArrayList<>();
            ans.add(tomatoSlices / 2 - cheeseSlices);
            ans.add(cheeseSlices * 2 - tomatoSlices / 2);
            return ans;
        }

    }

    public static void main(String[] args) {
        number_of_burgers_with_no_waste_of_ingredients_1276 plan = new number_of_burgers_with_no_waste_of_ingredients_1276();
        int tomatoSlices = 16; // 假设番茄片数
        int cheeseSlices = 7; // 假设奶酪片数
        List<Integer> solution = plan.numOfBurgers(tomatoSlices, cheeseSlices);

        if (solution.isEmpty()) {
            System.out.println("无法使剩下的番茄片和奶酪片的数量为0。");
        } else {
            System.out.println("巨无霸汉堡数量: " + solution.get(0) + ", 小皇堡数量: " + solution.get(1));
        }
    }

}
