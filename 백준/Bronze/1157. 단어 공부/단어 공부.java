import java.io.*;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr = new int[26];
		String a = br.readLine();
		
		for(int i=0;i<a.length();i++) {
			
			if(65<=a.charAt(i) && a.charAt(i) <=90) {
				arr[a.charAt(i) -65]++;
			}
			
			else {
				arr[a.charAt(i) -97]++;
			}
			
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i =0;i<26;i++) {
			if(arr[i]>max) {
				max =arr[i];
				ch = (char) (i+65);
			}
			else if(arr[i]==max) {
				ch='?';
			}
			
		}
				
		
		
		System.out.print(ch); 
		
		
	}
 
}