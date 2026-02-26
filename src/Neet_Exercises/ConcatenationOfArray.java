package Neet_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(",");
        int size = s.length;
        int[] res =  new int[size*2];

        for (int i = 0; i < size; i++) {
            res[i] = Integer.parseInt(s[i]) ;
            res[i+size] = Integer.parseInt(s[i]);
        }

        System.out.println(Arrays.toString(res));
    }

}
