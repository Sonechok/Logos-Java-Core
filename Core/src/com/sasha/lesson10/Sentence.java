package com.sasha.lesson10;

public class Sentence {
    private static String[] arrayOfWordsInSentence;
    public static void numberOfWordsInSentenceFinder(String sentence){
        sentence=sentence.trim();
        arrayOfWordsInSentence=sentence.split(" ");
        System.out.println(arrayOfWordsInSentence.length);
    }
}
