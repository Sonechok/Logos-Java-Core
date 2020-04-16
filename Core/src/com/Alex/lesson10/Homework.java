package com.Alex.lesson10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tmp=0;
        String word;
        String sentence;
        String text;
        String[] arrayOfWordsInSentence;
        String[] arrayOfSentencesInText;
        System.out.println("Task1\nEnter word to check is it a palindrome");
        word=scanner.nextLine();
        Palindrom.palindromFinder(word);
        System.out.println("Task2\nEnter word in ukrainian to replace all vowels with '-'");
        word=scanner.nextLine();
        Vowel.vowelReplace(word);
        System.out.println("Task3\nEnter sentence(divided with ' ') to get number of words");
        sentence=scanner.nextLine();
        Sentence.numberOfWordsInSentenceFinder(sentence);
        System.out.println("Task4\nEnter text(divided with '.') to get number of sentences");
        text=scanner.nextLine();
        arrayOfSentencesInText=text.split("\\.");
        System.out.println(arrayOfSentencesInText.length);
        System.out.println("Task5\nEnter sentence(divided with ' ') to to find the most popular word");
        sentence=scanner.nextLine();
        sentence=sentence.trim();
        arrayOfWordsInSentence=sentence.split(" ");
        String[] arrayOfWordsInSentenceCopy = Arrays.copyOf(arrayOfWordsInSentence, arrayOfWordsInSentence.length);
        int countOfRepetitiveWords[] = new int[arrayOfWordsInSentence.length];
        for (int i =0; i<arrayOfWordsInSentence.length; i++){
            countOfRepetitiveWords[i]=0;
        }
        for (int i =0; i<arrayOfWordsInSentence.length; i++) {
            tmp=i;
            for (int j =0; j<arrayOfWordsInSentence.length; j++) {
                if (arrayOfWordsInSentence[i].equalsIgnoreCase(arrayOfWordsInSentenceCopy[j])){
                    countOfRepetitiveWords[i]++;
                    arrayOfWordsInSentenceCopy[tmp]="@@";
                    tmp=j;
                }
            }
        }
        for (int i =0; i<countOfRepetitiveWords.length; i++) {
            int max=countOfRepetitiveWords[0];
            if (max>countOfRepetitiveWords[i]){
                max = countOfRepetitiveWords[i];
                tmp=i;
            }
        }
        System.out.println(arrayOfWordsInSentence[tmp]);
    }
}
