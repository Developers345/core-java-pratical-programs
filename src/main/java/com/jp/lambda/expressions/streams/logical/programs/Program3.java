package com.jp.lambda.expressions.streams.logical.programs;


/*
Problem Statement
------------------
Given sentence contains several words,First extract all words
that begin with the letter 'A',regardless of whether they are
uppercase or lowercase. Then, Convert each words into lowercase form.
After that, reverse letters in each word. Once the words are reversed
arrange them in order from shortest to longest.
Finally, for each word, display the reversed version along with number
of characters it contains .

input :
String sentence = "Our Channel provided Amazing Automation content
for java and Selenium learningsand professionals"

output:
dna - 3
dna - 3
gnizama - 7
noitamotua - 10
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program3 {

    public static void main(String[] args) {
        String sentence = "Our Channel provided Amazing Automation content for java and Selenium learnings and professionals";

       List<String> reverseWordList =  Arrays.stream(sentence.split("\\s+"))
                .filter(w -> w.toLowerCase().startsWith("a"))
                .map(String::toLowerCase)
                .map(w-> new StringBuilder(w).reverse().toString())
                .sorted(Comparator.comparingInt(String::length))
               .collect(Collectors.toList());

        reverseWordList.forEach(word-> System.out.println(word+"" +"-"+word.length()));
    }
}
