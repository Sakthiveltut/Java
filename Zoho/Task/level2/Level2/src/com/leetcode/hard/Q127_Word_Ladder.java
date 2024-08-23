package com.leetcode.hard;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Q127_Word_Ladder {

	public static void main(String[] args) {
		System.out.println(ladderLength("hit", "cog", new ArrayList<>(List.of("hot","dot","dog","lot","log","cog"))));
		/*System.out.println(ladderLength("hit", "cog", new ArrayList<>(List.of("hot","dot","dog","lot","log"))));
		System.out.println(ladderLength("hot", "dog", new ArrayList<>(List.of("hot","dog"))));
		System.out.println(ladderLength("hot", "dog", new ArrayList<>(List.of("hot","dog","dot"))));
		System.out.println(ladderLength("hot", "dot", new ArrayList<>(List.of("hot","dog","dot"))));*/
	}
	
    public static int ladderLength1(String beginWord, String endWord, List<String> wordList) { //Failed
    	if(!wordList.contains(endWord)) return 0;
    	if(endWord.length()==1) return 2;
    	if(wordList.contains(beginWord)) wordList.remove(beginWord);
    	int count=0;
    	ArrayList<String> list = new ArrayList<>();
    	for(int i=0;i<wordList.size();i++) {
    		int matches = 0, previousWord = 0;
    		for(int j=0;j<beginWord.length();j++) {
    			if(beginWord.charAt(j)==wordList.get(i).charAt(j)) matches++;
				if(wordList.get(i).charAt(j)==endWord.charAt(j)) previousWord++;
    		}
    		if(previousWord==beginWord.length()-1) {	
    			list.add(wordList.get(i));
    			count++;
    			break;
    		}
    		if(beginWord.length()-1==matches) { 
    			beginWord = wordList.get(i);
    			list.add(wordList.get(i));
    			count++;
    		}
    	}
    	System.out.println("count "+count);
    	System.out.println(list);
    	if(count==0) return 0;
    	//else if(count<2) return count+1;
    	else return count+2;
    }
    
	public static int ladderLength2(String beginWord, String endWord, List<String> wordList) {
	    Set<String> wordSet = new HashSet<>(wordList);
	    if (!wordSet.contains(endWord))
	      return 0;

	    int ans = 0;
	    Queue<String> q = new ArrayDeque<>(Arrays.asList(beginWord));

	    while (!q.isEmpty()) {
	      ++ans;
	      for (int sz = q.size(); sz > 0; --sz) {
	        StringBuilder sb = new StringBuilder(q.poll());
	        for (int i = 0; i < sb.length(); ++i) {
	          final char cache = sb.charAt(i);
	          for (char c = 'a'; c <= 'z'; ++c) {
	            sb.setCharAt(i, c);
	            final String word = sb.toString();
	            if (word.equals(endWord))
	              return ans + 1;
	            if (wordSet.contains(word)) {
	              q.offer(word);
	              wordSet.remove(word);
	            }
	          }
	          sb.setCharAt(i, cache);
	        }
	      }
	    }

	    return 0;
	 }
	
	
    public static int ladderLength5(String bg, String end, List<String> word) {
        HashSet<String> hp = new HashSet<>();
        
        for(var a : word) hp.add(a);
      
        Queue<String> q = new LinkedList<>();
        q.add(bg);
        int ans = 0;
        while(q.size()!=0){
            int n = q.size();
            ans++;
            for(int k=0; k<n; k++){
                String s = q.remove();
                System.out.println(s);
                if(s.equals(end)) return ans;
                for(int i=0; i<s.length(); i++){
                    for(char j='a'; j<='z'; j++){
                        
                        String curr = s.substring(0,i)+j+s.substring(i+1);
                        if(hp.contains(curr)){
                            
                            q.add(curr);
                            hp.remove(curr);
                        }
                    }
                }
            }
        }
        return 0;
    }
    
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        
        Set<String> visited = new HashSet<>();
        
        int changes = 1;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                String word = queue.poll();
                if(word.equals(endWord)) return changes;
                
                for(int j = 0; j < word.length(); j++){
                    for(int k = 'a'; k <= 'z'; k++){
                        char arr[] = word.toCharArray();
                        arr[j] = (char) k;
                        
                        String str = new String(arr);
                        //System.out.println(str);
                        if(set.contains(str) && !visited.contains(str)){
                            queue.add(str);
                            visited.add(str);
                            System.out.println("str "+str);
                        }
                    }
                }
            }
            ++changes;
        }
        return 0;
    }
	
}
