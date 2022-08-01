package com.company;

import java.util.Scanner;

public class Main {

    //function that returns a reversed String
    public static String reverseString(String string){

        char [] arr = string.toCharArray();

        String reversedString = "";

        for(int i = arr.length-1 ; i >= 0 ; i--){
            reversedString += arr[i];
        }

        return reversedString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String string = sc.nextLine();

        System.out.println(reverseString(string));

    }
}
