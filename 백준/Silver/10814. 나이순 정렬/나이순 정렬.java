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
       Person[] p = new Person[a];

       for(int i=0; i<a; i++){
           StringTokenizer st = new StringTokenizer(br.readLine()," ");
           int num = Integer.parseInt(st.nextToken());
           String key = st.nextToken();
           p[i] = new Person(num,key);
       }

       Arrays.sort(p,new Comparator<Person>(){
           public int compare(Person p1,Person p2){
               return p1.age-p2.age;
            }
        });

       for(int i=0;i<p.length;i++){
           bw.write(p[i].age+" "+p[i].name+"\n");
       }
       bw.flush();
       bw.close();

        }
    public static class Person{
        int age;
        String name;

        public Person(int age,String name){
            this.age = age;
            this.name = name;
        }

        public String toString(){
            return age+" "+name+ "\n";
        }
    }


    }


