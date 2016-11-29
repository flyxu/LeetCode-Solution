package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class sort_349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set=new HashSet<>();
		Set<Integer> set2=new HashSet<>();

		for(int i=0;i<nums1.length;i++){
			set.add(nums1[i]);
		}
		for(int i=0;i<nums2.length;i++){
			if(set.contains(nums2[i])){
				set2.add(nums2[i]);
			}
		}
		int inter[]=new int[set2.size()];
		int i=0;
		for(Integer num:set2){
			inter[i]=num;
			i++;
		}
		return inter;
				
     	}
	public static void main(String [] args){
		int[] num1=new int[]{2,1,4,2};
		Arrays.sort(num1);
		for(int i:num1)
		System.out.println(i);
		
		}
}
