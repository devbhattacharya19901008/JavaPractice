package Basics;
import java.io.*;
import java.util.*;


public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int A = Integer.parseInt(line[0]);
        int B = Integer.parseInt(line[1]);
        int C = Integer.parseInt(line[2]);

        int out_ = calculateScore(A, C, B);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static int calculateScore(int A, int C, int B){
        Double score = 0.0;
        int temp_A = 0 ,temp_B = 0,temp_C =0 ;
        while (temp_A % 2 == 0 && temp_B % 2 ==0 && temp_C % 2 == 0){
            if(!score.isInfinite()){
                temp_A = (A +B) /2;
                temp_B= (B+C) /2;
                temp_C= (C+A) /2;
                score = score+1;
                A = temp_A;
                B= temp_B;
                C = temp_C;
            }else {
                return -1;
            }
        }
        return  score.intValue();
    }
}
