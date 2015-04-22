package solutions;

import java.util.*;

public class RotateArray {

	public static void rotate(int[] nums, int k){
		
		//checking inputs
		for(int i=0; i<nums.length;i++){
			System.out.print(nums[i]+",");
			System.out.println(" ");
		}
		System.out.println("k="+k);
		
		if(k%nums.length==0) return;
		k=k%nums.length;
		
		int splitPoint;
		if(k>=nums.length) splitPoint=nums.length-1;
		else splitPoint = nums.length - k;
		
		System.out.println("splitpoint="+splitPoint);
		
		LinkedList<Integer> temp=new LinkedList<Integer>();
		
		//Add sub-array before splitPoint into the temp list
		for(int numIndex = 0; numIndex<=splitPoint; numIndex++){
			System.out.println("adding temp");;
			temp.add(nums[numIndex]);	
		}
		
		int pointer = 0;
		//Copy the second part of the nums[] to the beginning of the array
		for(int numIndex = splitPoint; numIndex<nums.length; numIndex++){
			System.out.println("Copying the second part. numIndex="+numIndex);
			nums[pointer]=nums[numIndex];
			pointer++;
		}
		
		//copy the rest of the nums[] from temp
		while(temp.size()!=0 && pointer<nums.length){
			System.out.println("temp.size="+temp.size());
			System.out.println("Pointer="+pointer);
			nums[pointer]=temp.removeFirst();
			pointer++;
		}
		for(int i = 0; i< nums.length;i++){
		System.out.println("="+nums[i]);
		}
	}
	
}
