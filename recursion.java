import java.util.Arrays;

public class recursion {
    public static void main(String[] args) {
        int[] input= {1,2,3,4,5};
        trisum(input);

    }
    static void trisum(int[] arr){
        int num=0;
        int[] ans=new int[arr.length-1];
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                num=arr[i]+arr[i-1];
                ans[i-1]=num;
            }
            System.out.println(Arrays.toString(ans));

        }else{
            System.out.println(Arrays.toString(ans));
        }

        trisum(ans);
    }
}

