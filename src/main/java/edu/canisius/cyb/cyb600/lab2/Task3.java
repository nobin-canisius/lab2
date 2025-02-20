package edu.canisius.cyb.cyb600.lab2;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public ArrayList<String> removeDuplicates(String inputText) {
        if (inputText == null || inputText.equals("")){
            return new ArrayList<>();
        }
        Map<Character, Integer> mp = new HashMap<>();
        for (int j = 0; j < inputText.length(); j++) {
            char ch = inputText.charAt(j);
            if (mp.containsKey(ch)) {
                int cnt = mp.get(ch);
                mp.put(ch, ++cnt);
            } else {
                mp.put(ch, 1);
            }
        }
        Set<Character> charct = mp.keySet();

        for (Character ch : charct) {
            int c = mp.get(ch);
            if (c > 1) {
                System.out.println(ch + " - " + c);
            }
        }
        System.out.println("-----------END OF TEST---------------");
        return charct.stream().map(Object::toString).collect(Collectors.toCollection(ArrayList::new));
    }

    public boolean areTheseAnagrams(String str1, String str2){
        if ((str1 == null || str2 == null) || str1.length() != str2.length()) {
            return false;
        }else{
            char[] anagram1 = str1.toCharArray();
            char[] anagram2 = str2.toCharArray();
            Arrays.sort(anagram1);
            Arrays.sort(anagram2);
            return Arrays.equals(anagram1, anagram2);

        }
    }
}
