package Neet_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] str = in.readLine().split(",");
        Set<Integer> set = new HashSet<>();
        for (String s : str){
            if (set.contains(Integer.parseInt(s)))
                System.out.println("true");
            else
                set.add(Integer.parseInt(s));
        }

        if (str.length == set.size()) System.out.println("false");
    }
}
