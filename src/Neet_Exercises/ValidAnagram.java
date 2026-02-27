package Neet_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    static void main(String[] args) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String a = in.readLine();
      String b = in.readLine();

      System.out.println(validAnagram(a,b));
    }


    private static boolean validAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        for (int i = 0; i < a.length(); i++){
            mapA.put(a.charAt(i), mapA.getOrDefault(a.charAt(i),0) + 1);
            mapB.put(b.charAt(i), mapB.getOrDefault(b.charAt(i),0) + 1);
        }
        return mapA.equals(mapB);

    }
}


