package org;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RelevantQuestions {
    public char returnNonRepeatChar(String str) {

        if (str.length() == 0)
            return '_';
        if (str.length() == 1)
            return str.charAt(0);

        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
//            if (linkedHashMap.containsKey(ch)) {
//                linkedHashMap.put(ch, linkedHashMap.get(ch) + 1);
//
//            } else {
//                linkedHashMap.put(ch, 1);
//            }
            linkedHashMap.put(ch, linkedHashMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : linkedHashMap.keySet()) {
            if (linkedHashMap.get(ch) == 1)
                return ch;
        }


        return '_';
    }

    public Boolean isAnagram(String a, String b) {

        if (a.length() != b.length())
            return false;
        Map<Character, Integer> strA = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            if (strA.containsKey(currentChar)) {
                strA.put(currentChar, strA.get(currentChar) + 1);

            } else {
                strA.put(currentChar, 1);
            }


        }

        for (int i = 0; i < b.length(); i++) {
            if (!strA.containsKey(b.charAt(i))) {
                return false;

            }
            if (strA.get(b.charAt(i)) == 0)
                return false;

            strA.put(b.charAt(i), strA.get(b.charAt(i)) - 1);
        }
        return true;
    }

    public String reverseWords(String str) {
        String[] strArr = str.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = strArr.length - 1; i >= 0; i--) {
            sb.append(strArr[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public String compressString(String str){
        int x =0,y=0;
        int repeatingChars =0;
        StringBuilder sb = new StringBuilder();
        while (y < str.length()){
            if(str.charAt(x) == str.charAt(y)){
                repeatingChars++;
                y++;

            }else{
                sb.append(str.charAt(x)).append(repeatingChars);
                repeatingChars =0;
                x = y;
            }

        }
        sb.append(str.charAt(x)).append(repeatingChars);
        return sb.toString();

    }

    public boolean isPalindrome(String str){
        if(str == null || str.length() <2)
            return true;

        int i=0,j=str.length()-1;
        String newStr = str.toLowerCase();
        while (i<j){
            char iChar = newStr.charAt(i);
            char jChar = newStr.charAt(j);
            if(!Character.isLetterOrDigit(iChar)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(jChar)){
                j--;
                continue;
            }
            if( iChar!= jChar)
                return false;
            i++;j--;
        }
        return true;
    }

    public String removeDuplicate(String str){
        if(str == null || str.isEmpty())
            return str;
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        String newStr = str.toLowerCase();
        for (int i = 0; i < newStr.length(); i++) {
            linkedHashMap.put(newStr.charAt(i),1);
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : linkedHashMap.keySet())
            sb.append(ch);
        return sb.toString();
     }

    public char firstNonRepeatingCharacter(String str){
        HashMap<Character ,Integer> charactersCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            charactersCount.put( ch,(charactersCount.getOrDefault(ch,0)+1));
        }
        for (int i = 0; i < str.length(); i++) {
            if(charactersCount.get( Character.toLowerCase(str.charAt(i))) == 1) return str.charAt(i);

        }
        return ' ';


    }

    public boolean areTwoStringsAnagram(String a , String b){

        a = a.replaceAll("\\s","");
        b = b.replaceAll("\\s","");
        if(a.length() != b.length())
            return false;
        HashMap <Character, Integer> stringA = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = Character.toLowerCase(a.charAt(i));
            stringA.put(ch ,stringA.getOrDefault(ch,0)+1);

        }

        for (int i = 0; i < b.length(); i++) {
            char ch = Character.toLowerCase(b.charAt(i));
            if(!stringA.containsKey(ch) || stringA.get(ch) ==0)
                return false;

            stringA.put(ch,stringA.get(ch)-1);
        }
        return true;

    }

}
