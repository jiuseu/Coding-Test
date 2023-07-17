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

        for(int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
           String s1 = st.nextToken();
           String s2 = st.nextToken();

           if(srr.get(s1)==null){
               srr.put(s1,s2);
           }
           else{
               srr.replace(s1,s2);
           }
        }

        List<String> list = new ArrayList<>(srr.keySet());
        Collections.sort(list,Collections.reverseOrder());

        for (String s:list) {
            if(srr.get(s).equals("enter")){
                bw.write(s+"\n");
            }
        }


        bw.flush();
        bw.close();

        }

    }


