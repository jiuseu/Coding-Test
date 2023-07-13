import java.util.*;
import java.util.stream.Stream;
import java.io.*;
import java.text.*;
import java.time.*;
import java.math.*;

public class Main{
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	//StringTokenizer st = new StringTokenizer(br.readLine());
        //Scanner sc =new Scanner(System.in);
    	//StringBuilder sb=new StringBuilder();     
    int a = Integer.parseInt(br.readLine());
    int [][] arr = new int [a][2];
    
    for(int i=0;i<a;i++) {
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	arr[i][0]=Integer.parseInt(st.nextToken());
    	arr[i][1]=Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(arr, new Comparator<int []>() {
    	public int compare(int [] a1, int [] a2) { 
    		if(a1[0]==a2[0]) {
    			return a1[1]-a2[1];
    		}
    		else {
    			return a1[0]-a2[0];
    		}
    	}
    });
    
    for(int i=0;i<a;i++) {
    	
    		bw.write(arr[i][0]+" "+arr[i][1]+"\n");
    	}
    	
    
    
	bw.flush();
	bw.close();
	br.close();
	}
  }