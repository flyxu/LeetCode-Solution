package leetcode;

public class sort_283 {
	public static void moveZeroes(int[] nums) {
		int j=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]!=0){
        		nums[j]=nums[i];
        		j++;
        	}
         }
        for(int k=j;k<nums.length;k++){
        	nums[k]=0;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{0,1,2};
		moveZeroes(a);
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}

}
