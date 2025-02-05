package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1424_Diagonal_Traverse_II {

    public static void main(String[] args) {
    	List<List<Integer>> nums1 = List.of(
                List.of(1, 2, 3), 
                List.of(4, 5, 6), 
                List.of(7, 8, 9)  
            );
    	
    	List<List<Integer>> nums = List.of(
                List.of(1, 2, 3, 4, 5), 
                List.of(6,7,8,9,10), 
                List.of(11,12,13,14,15),  
                List.of(16,17,18,19,20)  
            );
    	
    	System.out.println(Arrays.toString(findDiagonalOrder4(nums)));
    	
    }
    
    public static int[] findDiagonalOrder(List<List<Integer>> nums) {
        Queue<Pair1<Integer, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair1<>(0, 0));
        List<Integer> ans = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            Pair1<Integer, Integer> p = queue.poll();
            int row = p.getKey();
            int col = p.getValue();
            ans.add(nums.get(row).get(col));
            
            if (col == 0 && row + 1 < nums.size()) {
                queue.offer(new Pair1<>(row + 1, col));
            }
            
            if (col + 1 < nums.get(row).size()) {
                queue.offer(new Pair1<>(row, col + 1));
            }
        }
        
        int[] result = new int[ans.size()];
        int i = 0;
        for (int num : ans) {
            result[i++] = num;
        }
        
        return result;
    }
    
    public int[] findDiagonalOrder1(List<List<Integer>> nums) {
        int count = 0;

        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> row = nums.get(i);

            for (int j = 0; j < row.size(); j++) {
                int idx = i + j;

                if (lists.size() < idx + 1) {
                    lists.add(new ArrayList<>());
                }
                lists.get(idx).add(row.get(j));
                
                count ++;
            }
        }

        int[] res = new int[count];
        int idx = 0;
        for (List<Integer> list : lists) {
            for (int i = list.size() - 1; i >= 0; i--) {
                res[idx++] = list.get(i); 
            }
        }
        return res;
    }
    
    public int[] findDiagonalOrder2(List<List<Integer>> nums) {
        List<Integer> resList = new ArrayList<>();
        LinkedList<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] p = q.poll();
            resList.add(nums.get(p[0]).get(p[1]));

            if (p[1] == 0 && p[0] + 1 < nums.size()) {
                q.offer(new int[]{p[0] + 1, 0});
            }

            if (p[1] + 1 < nums.get(p[0]).size()) {
                q.offer(new int[]{p[0], p[1] + 1});
            }
        }

        // Convert List<Integer> to int[]
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }

        return res;         
    }
    
    
    
    
    public static int[] findDiagonalOrder4(List<List<Integer>> nums) {
    	List<Integer> resultList = new ArrayList<>();
        LinkedList<int[]> positionList = new LinkedList<>();
        positionList.offer(new int[]{0,0});

        while(!positionList.isEmpty()){
            int[] currentPosition = positionList.poll();
            resultList.add(nums.get(currentPosition[0]).get(currentPosition[1]));
            
            if(currentPosition[1]+1<nums.get(currentPosition[0]).size()){
            	positionList.add(new int[] {currentPosition[0],currentPosition[1]+1});
            }

            if(currentPosition[1]==0 && currentPosition[0]+1<nums.size()){            	
            	positionList.add(new int[]{currentPosition[0]+1,currentPosition[1]});
            }
    
        }

//        System.out.println(resultList);
        
        int[] resultArray = resultList.stream().mapToInt(Integer::intValue).toArray();

        return resultArray;
    }
    
}


  class Pair1<K, V> { private K key; private V value;
  
  public Pair1(K key, V value) { this.key = key; this.value = value; }
  
  public K getKey() { return key; }
  
  public V getValue() { return value; } }
 
