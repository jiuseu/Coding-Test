import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.lang.reflect.Array;
import java.text.*;
import java.time.*;
import java.math.*;

class Main {
  
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	//Scanner sc = new Scanner(System.in);
    //StringTokenizer st = new StringTokenizer(br.readLine()," ");
    //StringBuilder sb = new StringBuilder();
    
    String s = br.readLine();
    Stack<Character>sk = new Stack<Character>();
    
    	for(int i=0;i<s.length();i++) {
    		char ch = s.charAt(i);
    		if(s.length()%2==0) {
    			if(i<(s.length()/2)) {
            		sk.push(ch);
            	}
            	else if(sk.peek()==ch) {
            		sk.pop();
            	}	
    		}
    		if(s.length()%2!=0) {
    			int l =((s.length()+1)/2);
    			if(i<(l-1)) {
            		sk.push(ch);
            	}
            	else if(i==(l-1)) {
            		continue;
            	}
            	else if(sk.peek()==ch) {
            		sk.pop();
            	}
    		}
        	
        }
    
   if(sk.isEmpty()) {
	   bw.write(String.valueOf(1));  
   }
   else {
	   bw.write(String.valueOf(0));  
	   
   }
    
     
   bw.flush();
}
}