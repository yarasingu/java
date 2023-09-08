package com.example.strings;

public class ReverseString {

    public static void main(String args[])
    {
        String str = "Tarun";
        String reverse = "";
        for(int i=str.length()-1; i>-1 ;i--)
        {
            reverse = reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
    
}
