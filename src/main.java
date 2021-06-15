import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] nums={1, 0, 4, 0, 5, 0};
        for (int i=0; i<nums.length-1; i++){
            for (int j=0; j<nums.length-1; j++){
                if (nums[j]==0){
                    nums[j]=nums[j+1];
                    nums[j+1]=0;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }


}
