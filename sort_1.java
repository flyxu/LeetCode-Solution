
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class sort_1 {
    public static  int[] twoSum(int[] nums, int target) {
    	List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
        	for(int j=i+1;j<nums.length;j++){
              	if(nums[i]+nums[j]==target){
        		list.add(i);
        		list.add(j);
        		}
        	}
        }
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
        	result[i]=list.get(i);
        }
        return result;

    }
    public static int[] twosum2(int [] nums,int target){
    	HashMap<Integer, Integer> hashmap=new HashMap<Integer,Integer>();
    	int result[]=new int[2];
    	for(int i=0;i<nums.length;i++){
    		if(!hashmap.containsKey(nums[i])){
    			hashmap.put(target-nums[i], i);
    		}
    		else{
    			int a=i;
    			int b=hashmap.get(nums[i]);
    			result[0]=b;
    			result[1]=a;
    			return result;
    		}
    	}
    	return result;

    }
    public static void main(String args[]){
    	int a[]={2, 7, 11, 15};
    	int target=9;
    	int[] result=twosum2(a, target);
    	for(int b:result){
    	 System.out.println(b);
    	}
    }

}
