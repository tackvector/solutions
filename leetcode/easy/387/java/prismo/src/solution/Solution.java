package prismo.src.solution;

import java.util.ArrayList;

public class Solution {

    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        ArrayList<Character> chars = new ArrayList<Character>();

        for (char c : arr) {
            System.out.println(c);
            chars.add(c); 
            System.out.println(chars);
        }

        return 0;
    }
}
