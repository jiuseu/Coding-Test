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
    
    int a = Integer.parseInt(br.readLine());
    Stack<Integer>sk = new Stack<Integer>();
    
   for(int i=0;i<a;i++) {
	 String s = br.readLine();
	 
	 if(s.contains("push")) {
		 String [] arr = s.split(" ");
		 int b= Integer.parseInt(arr[1]);
		 sk.push(b);
	 }
	 else if(s.contains("pop")) {
		 if(sk.isEmpty()) {
			 bw.write(String.valueOf(-1)+"\n");	 
		 }
		 else {
			 bw.write(String.valueOf(sk.pop())+"\n");	 
		 }
	}
	else if(s.contains("size")) {
		bw.write(String.valueOf(sk.size())+"\n");
	}
	else if(s.contains("empty")) {
		if(sk.isEmpty()) {
			bw.write(String.valueOf(1)+"\n");	
		}
		else {
			bw.write(String.valueOf(0)+"\n");
		}
		
	}
	else if(s.contains("top")) {
		if(sk.isEmpty()) {
		bw.write(String.valueOf(-1)+"\n");
		}
		else {
			bw.write(String.valueOf(sk.peek())+"\n");	
		}
	}
   }
   bw.flush();
}
}