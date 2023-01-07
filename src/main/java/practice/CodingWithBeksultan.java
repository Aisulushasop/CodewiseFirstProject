package practice;

import java.util.Scanner;

public class CodingWithBeksultan {
    public static void main(String[] args) {

       /*
 Given an "out" string length 4, such as "<<>>", and a word, return
 a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j)
  to extract the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"

        */
    }
    public String makeOutWord(String out, String word) {
    String left = out.substring(0,2);
    String right = out.substring(2);
    return left + word + right;



    }

/*
Given a string, return a new string made of
3 copies of the last 2 chars of the original string. The string length will be at least 2.

extraEnd("Hello") → "lololo"
 */



}