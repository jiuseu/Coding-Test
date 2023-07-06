import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.text.*;
import java.time.*;
import java.math.*;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	//Scanner scan = new Scanner(System.in);
    //StringTokenizer st = new StringTokenizer(br.readLine());
    int [] x = new int [3];
    int [] y = new int [3];
    
    for(int i=0;i<3;i++) {
    StringTokenizer st = new StringTokenizer(br.readLine());
    x[i] = Integer.parseInt(st.nextToken());
    y[i] = Integer.parseInt(st.nextToken());
    }
    
    int a= 0;
    int b= 0;
    
    for(int i=0;i<3;i++) {
    	int ac = 0;
    	int bc = 0;
    	for(int j=0;j<3;j++) {
        	if(x[i]==x[j] && i!=j) {
        	ac++;
        	}
        	if(y[i]==y[j] && i!=j) {
        	bc++;
        	}
        }
    	if(ac==0) {
    		a= x[i];
    	}
        if(bc==0) {
    		b= y[i];
    	}
    }
    bw.write(String.valueOf(a+" "+b));
    bw.flush();
    bw.close();  
  }
  
}