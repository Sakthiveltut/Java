package com.leetcode.easy;

import java.util.PriorityQueue;

class KthLargest {
    final PriorityQueue<Integer> q;
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<>();
        for(int n: nums) add(n);
    }
    
    public int add(int val) {
        q.offer(val);
        if (q.size() > k) {
            q.poll();
        }
        return q.peek();
    }
    
    public static void main(String[] args) {
	    KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
	    
	    System.out.println(kthLargest.q);
	    
	    System.out.println(kthLargest.add(3)); // Output: 4 (current k-th largest is 4)
	    System.out.println(kthLargest.add(5)); // Output: 5 (current k-th largest is 5)
	    System.out.println(kthLargest.add(10)); // Output: 5 (current k-th largest is 5)
	    System.out.println(kthLargest.add(9)); // Output: 8 (current k-th largest is 8)
	    System.out.println(kthLargest.add(4)); // Output: 8 (current k-th largest is 8)
    }

}
