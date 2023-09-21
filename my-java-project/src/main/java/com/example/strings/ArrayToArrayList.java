package com.example.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayToArrayList {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[])
    {
        String s[] = {"tarun", "varun","apple","laxing","armmra"};
        System.out.println("enter The number 1 or 2");
        int num = sc.nextInt();
        switch (num) {
            case 1:
            System.out.println("it is normal method ");
                    boolean flag = true;
                    String  find = sc.next();
                    for (String string : s) {
                        if(string.equals(find))
                        {
                            System.out.println("element found");
                        }
                    }
                    if(flag){
                        System.out.println("element not found");
                    }
                    sc.close();
                break;

             case 2:
                    ArrayList<String> list = new ArrayList<>();
                    for (String string : s) {
                        list.add(string);
                    }
                    Collections.reverse(list);
                    System.out.println(list);
                break;
            default:
                break;
        }
       
    }

    public static void array(String arr[])
    {

    }
}
