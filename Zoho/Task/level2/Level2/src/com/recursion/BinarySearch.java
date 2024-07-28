package com.recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,78,79,80,94,96,99,100};
		int target = 100;
		System.out.println(binarySearch(target,arr,0,arr.length-1));
	}

	private static int binarySearch(int target, int[] arr, int start, int end) {
		if(start>end) {
			return -1;
		}
		int mid = (start+end)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(target<arr[mid]) {
			return binarySearch(target, arr, start, mid-1);
		}
		return binarySearch(target, arr, mid+1, end);
	}

}
