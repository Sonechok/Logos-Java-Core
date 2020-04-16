package com.Alex.lesson10;

public class Vowel {
    private static char[] vowelUKR = {'а', 'е', 'и', 'і', 'о', 'у', 'я', 'ю', 'є', 'ї'};
    public static void vowelReplace(String word){
        for(int i = 0; i<vowelUKR.length;i++){
            word=word.replace(vowelUKR[i], '-');
        }
        System.out.println(word);
    }
}
