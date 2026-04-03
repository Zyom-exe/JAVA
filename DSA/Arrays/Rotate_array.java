package Arrays;
import java.util.*;
public class Rotate_array {
    /*public void rotate(int[] nums, int k) {
        List<Integer> list= new ArrayList<Integer>();
        for(int i=k+1;i<nums.length;i++) {
            list.add(nums[i]);
        }
        for(int i=0;i<k+1;i++) {
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++) {
            nums[i] = list.get(i);
        }
    }
*/
    public void rotate2(int[] nums, int k){
        //int[]a=new int[nums.length];
        k=k%nums.length;
        while(k!=0) {

            int temp=nums[nums.length-1];
            /*for(int i=0;i<nums.length-1;i++) {
                a[i+1]=nums[i];
            }
            a[0]=temp;
            for(int i=0;i< nums.length;i++) {
                nums[i]=a[i];
            }*/
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;

            k--;
        }
    }
    public static void main(String[] args) {
        Rotate_array obj=new Rotate_array();
        int[]a={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));
        obj.rotate2(a,2);
        System.out.println(Arrays.toString(a));
    }
}
