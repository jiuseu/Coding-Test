import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(br.readLine());
        HashMap<String,String> srr = new HashMap<String,String>();
        HashSet<String> ans = new HashSet<>();

        for(int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
           String s1 = st.nextToken();
           String s2 = st.nextToken();
           srr.put(s1,s2);
           if(srr.get(s1).equals("enter")){
               ans.add(s1);
           }
           if(srr.get(s1).equals("leave")){
               ans.remove(s1);
           }
        }

        ArrayList<String> arr = new ArrayList<String>(ans);
        Collections.sort(arr,Collections.reverseOrder());

        for(String s:arr){
            bw.write(s+"\n");
        }
        bw.flush();
        bw.close();

        }

    }


