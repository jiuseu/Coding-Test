import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> srr = new HashMap<String, Integer>();

        for(int i=0;i<a;i++){
            String s = br.readLine();

            if(s.length()<b) {
                continue;
            }

            if(srr.containsKey(s)){
                srr.put(s,srr.get(s)+1);
            }
            else {
                srr.put(s, 1);
            }
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(srr.entrySet());
        list.sort((o1,o2)->{
            int cmp = o2.getValue()-o1.getValue();
            if(cmp!=0) {
                return cmp;
            }
            else{
                int len = o2.getKey().length() - o1.getKey().length();
                if(len!=0) {
                    return len;
                }
                else{
                    //사전순
                    int tmp = o1.getKey().compareTo(o2.getKey());
                    return tmp;
                }
            }
        });

        for(Map.Entry<String,Integer> s:list){
            bw.append(s.getKey()).append("\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

}


