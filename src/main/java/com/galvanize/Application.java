package com.galvanize;

import java.util.Scanner;
import java.lang.Math;

public class Application {
    public static void main(String[] args){
        System.out.println("Hello World!");
        if(args[0].isEmpty() == false){
            caeserCipher(args);
        }
    }

    public static void caeserCipher(String[] args){
        Scanner sc = new Scanner(System.in);
        int rand = (int) (Math.random() * 20) + 1;
        System.out.println("Enter text to cipher: ");
        //String s = sc.nextLine();
        Encrypt cipher = new Encrypt(args[0], rand);
        String ci = cipher.encryption();
        System.out.println(ci);
    }

}
