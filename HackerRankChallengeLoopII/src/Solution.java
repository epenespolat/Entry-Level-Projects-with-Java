import java.util.*;
import java.io.*;
import java.lang.Math;

public class Solution {

        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                sb.setLength(0);
                for(int j=0; j<n; ++j) {
                    sb.append((int) (a + b*(Math.pow(2, j+1) - 1))).append(" ");
                }
                System.out.println(sb.toString());
            }
            in.close();
        }
    }

