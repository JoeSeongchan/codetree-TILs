import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer stk;
    static String nextToken(){
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
        int v = 1;
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                System.out.printf("%d ",v);
                v+=1;
                if(v>=10){
                    v=1;
                }
            }
            System.out.println();
        }
    }
}