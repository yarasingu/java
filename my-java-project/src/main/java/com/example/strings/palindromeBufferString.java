package com.example.strings;

public class palindromeBufferString {

    public static void main(String args[])
    {
         String s = "tarun";
        StringBuffer sb = new StringBuffer(s);
        String s1 = sb.reverse().toString();
        if(s.equals(s1))
        {
            System.out.println("The given string is plaindrome");
        }
        else
        {
            System.out.println("The given String is not a plaindrome");
        }
    }   
}
