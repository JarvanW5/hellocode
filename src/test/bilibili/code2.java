package test.bilibili;

/**
 * @Author:JarvanW
 * @Date:2024/4/20
 * @Description:
 * @Version:1.8
 * @Requirement:
 */
public class code2 {
    public static String rever(String s,int k){
        char[] result = s.toCharArray();
        int n = result.length;
        for (int i = 0; i < n-k; i++) {
            reverSub(result,i,i+k-1);

        }
        return new String(result);
    }

    public static void reverSub(char[] arr,int start,int end){
        while(start < end){
            char tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int n =5;
        int k =3;
        String s = "hello";
        String result = rever(s,k);
        System.out.println(result);
    }


}
