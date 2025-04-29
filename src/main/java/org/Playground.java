package org;

import java.util.HashMap;

public class Playground {





    public String lengthEncoding(String  a){
        HashMap <Character,Integer> stringA = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            stringA.put(ch,stringA.getOrDefault(ch,0)+1);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char ch =  a.charAt(i);
            if(stringA.get(ch)<2){
                stringBuilder.append('a');
            }else {
                stringBuilder.append(ch).append(stringA.get(ch));
            }

        }
        return stringBuilder.toString();
    }
}
