import java.util.Arrays;

/**
 * Created by Mythri on 11/3/16.
 */
public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;

        int k = m + n -1;

        while(i >= 0 && j >=0){
            if(nums1[i] > nums2[j] ){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while( i >= 0){
            nums1[k--] = nums1[i--];
        }
        while( j >= 0){
            nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int nums1[] = {1,3,4,5,6,0};
        int nums2[] = {2};
        int m = 5;
        int n = 1;
        MergeSortedArrays obj = new MergeSortedArrays();
        obj.merge(nums1,m,nums2,n);
    }
}
