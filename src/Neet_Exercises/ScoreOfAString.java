package Neet_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreOfAString {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int res = 0;

        for (int i = 1; i < str.length(); i++) {
            res += Math.abs(str.charAt(i) - str.charAt(i - 1));
        }

        System.out.println(res);
    }
}
