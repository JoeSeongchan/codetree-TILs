import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        if(n<5){
            System.out.println(n);
        } else{
            System.out.println(n*n);
        }
    }
}