package com.example.arrays;

import java.util.Scanner;

public class FindTheElement {

    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
    int  a = sc.nextInt();
    int arr[] = {50,20,60,80,96,36,87,58};
        boolean flag = true;
    for(int n : arr)
    {
        if(n==a)
        {
            System.out.println("The given element is find");
            flag = false;
        }
    }
    if(flag)
    {
        System.out.println("The given element is not found ");
    }
}
}
