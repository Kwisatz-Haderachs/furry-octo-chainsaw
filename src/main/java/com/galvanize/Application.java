package com.galvanize;

import java.util.Scanner;
import java.lang.Math;

public class Application {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }

    public void ceaser_cipher(){
        Scanner sc = new Scanner(System.in);
        int rand = (int) (Math.random() * 20) + 1;
        System.out.println("Enter text to cipher: ");
        String s = sc.nextLine();
        Encrypt cipher = new Encrypt(s, rand);
        String ci = cipher.encryption();
        System.out.println(ci);
    }

}
