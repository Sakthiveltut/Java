package com.leetcode.medium;

public class Q42_Trapping_Rain_Water {

	public static void main(String[] args) {
//		System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
		System.out.println(trap2(new int[] {3,0,2}));

	}
	
    public int trap1(int[] height) {
        int total = 0; // Initialize total water trapped
        int l = 0, r = height.length - 1; // Two pointers, left (l) and right (r)
        int lmax = 0, rmax = height[r]; // Initialize max heights for left and right
        
        while (l < r) {
            if (height[l] <= height[r]) {
                // If left height is less than or equal to right height
                if (height[l] < lmax) {
                    total += lmax - height[l]; // Water trapped on the left
                } else {
                    lmax = height[l]; // Update left max height
                }
                l++; // Move left pointer
            } else {
                // If right height is less than left height
                if (height[r] < rmax) {
                    total += rmax - height[r]; // Water trapped on the right
                } else {
                    rmax = height[r]; // Update right max height
                }
                r--; // Move right pointer
            }
        }
        return total; // Return total water trapped
    }
    
    public static int trap2(int[] height) { 
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int water = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
            }
        }

        return water;        
    }

}
