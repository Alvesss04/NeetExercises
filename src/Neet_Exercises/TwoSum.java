package Neet_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(in.readLine());
        String[] num = in.readLine().split(" ");

        Map<Integer, Boolean> verifiedNum = new HashMap<>();

        for (String s : num) {
            int currentNum = Integer.parseInt(s);
            int looknum = target - currentNum;

            if (verifiedNum.containsKey(looknum)) System.out.println(currentNum + " + " + looknum + " = " + target);

            verifiedNum.put(currentNum, true);

        }

    }

}
