package leetcode;

import java.util.Arrays;

public class sort_4 {
    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	double median=0;
        int[] num=new int[nums1.length+nums2.length];
        int k=0;
        for (int i=0;i<nums1.length;i++)
        {
        		num[k]=nums1[i];
        		k++;
        	
        }
        for(int j=0;j<nums2.length;j++){
        	num[k]=nums2[j];
        	k++;
        }
        Arrays.sort(num);
        if(num.length%2==0){
        	median=(double)(num[num.length/2-1]+num[num.length/2])/2;
        }
        else{
        	median=(double)num[num.length/2];
        }
        return median;
    }
    public static void main(String[] args){
    	int[] nums1 = {1, 2};
    	int[]  nums2={3,4,5};
    	double median=findMedianSortedArrays(nums1, nums2);
    	System.out.println(median);
    }

}
