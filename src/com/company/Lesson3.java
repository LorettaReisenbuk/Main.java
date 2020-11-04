package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(fibonacci1(5));
        System.out.println(fibonacci2(5));
        //readFromFile();
        System.out.println(sum(5));
    }

    public static int sum(int x) {
        //TODO kasutades tsüklit arvutage
        int a = 0;
        for (int i = 1; i <= x; i++) {
            a = a + i;
        }
        return a;
    }


    // TODO
// Fibonacci arv on defineeritud kui
// fib(n) = fib(n-1) + fib(n-2)
// Näiteks: 0 1 1 2 3 5 8 13 ...
// leia nii mitmes arv fibonacci jadas
// lahenda iteratiivselt
    private static int fibonacci1(int nr) {
        int a = 0;
        for (int i = 1; i < nr; i++) {
            a = a + i;
        }
        return a;
    }


    // TODO
// leia nii mitmes arv fibonacci jadas 0, 1, 2, 3, 4, 5, 6, 7 // 0 1 1 2 3 5 8 13
// lahenda rekursiivselt
    private static int fibonacci2(int nr) {
        if (nr == 0) {
            return 0;
        } else if (nr == 1) {
            return 1;
        } else if (nr == 2) {
            return fibonacci2(1) + fibonacci2(1);
        } else if (nr == 3) {
            return fibonacci2(1) + fibonacci2(1);
        } else if (nr == 4) {
            return fibonacci2(1) + fibonacci2(2);
        }
    }

    // TODO Prindi välja faili iga teine täht
    public static void readFromFile() throws FileNotFoundException {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }

    // TODO tagasta sisestatud String s tagurpidi
// Näiteks
// Sisend = "Tere" / Väljund = "ereT"
    public String reverse(String s) {
        return "";
    }
}
