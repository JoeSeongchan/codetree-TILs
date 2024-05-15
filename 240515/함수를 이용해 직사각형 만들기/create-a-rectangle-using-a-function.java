import java.util.*;
import java.io.*; 

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer stk;

    public static String nextToken(){
        try{
            if(stk==null || !stk.hasMoreTokens()){
                stk = new StringTokenizer(br.readLine());
            }
            return stk.nextToken();
        } catch(Exception e){
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(nextToken());
        int m = Integer.parseInt(nextToken());
        for(int i=0;i<n;i++){
            for(int k=0;k<m;k++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}