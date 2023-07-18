import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;
        HashMap<String,Integer> arr = new HashMap<String,Integer>();

        for(int i = 0; i < a+b; i++) {
            String s = br.readLine();
           if(arr.get(s)!=null){
               arr.put(s,1);
           }
           else{
               arr.put(s,0);
           }
        }

        ArrayList<String> list = new ArrayList<String>();
        for(String s:arr.keySet()){
            if(arr.get(s)==1){
                list.add(s);
                cnt++;
            }

        }
        Collections.sort(list);
        bw.write(String.valueOf(cnt)+"\n");
        for(String s:list){
            bw.write(String.valueOf(s)+"\n");
        }

        bw.flush();
        bw.close();

        }

    }


