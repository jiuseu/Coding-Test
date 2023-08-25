import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
    
    int cnt = 5;
    List<Integer> list = new ArrayList<Integer>();
     Arrays.sort(num_list);

       for(int i=0; i<num_list.length; i++) {
           if(cnt != 0){
               cnt-=1;
           }
           else{
             list.add(num_list[i]);
           }
       }

       int [] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}