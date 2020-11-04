package com.company;

import java.util.Scanner;

public class Main<b> {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Min funktsioon. Sisesta 2 väärtust");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(min(a, b));
        System.out.println("Abs funktsioon. Sisesta 1 väärtus");
        int x = in.nextInt();
        System.out.println(abs(x));
        System.out.println("Neg funktsioon. Sisesta 1 väärtus");
        x = in.nextInt();
        System.out.println(neg(x));
        System.out.println("ClosestToZero funtsioon. Sisesta 3 väärtust");
        a = in.nextInt();
        b = in.nextInt();
        int c = in.nextInt();
        System.out.println(closestToZero(a, b, c));
        System.out.println("IsNumberEven funktsioon. Sisesta 1 cäärtus");
        a = in.nextInt();
        System.out.println(isNumberEven(a));
        System.out.println("LargestPositive funktsioon. Sisesta 3 väärtust");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println(largestPositive(a, b, c));
        System.out.println(closestTo(3, new int[]{2, -5, 2, 6, 8, 4}));
    }

    // leia 2 arvu miinimum väärtus
    // Näited:
    // min (3, 5) = 3
    // min (-3, 8) = -3
    private static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }


    // TODO: Leia arvu absoluutväärtus
    // Näited:
    // abs(3) = 3
    // abs(-5) = 5
    private static int abs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    // TODO: Luua funktsioon, mis tagastab vastava arvu alati negatiivsena
    // Näited:
    // neg(0) = 0
    // neg(-1) = -1
    // neg(8) = -8
    public static int neg(int x) {
        if (x >= 0) {
            return -x;
        } else {
            return x;
        }
    }

    // TODO: Luua funktsioon mis leiab sisend muutujates numbri mis on kõige lähemal 0-ile
    // Näited
    // (-5, -2, 0) -> 0
    // (2, 3, 4) -> 2
    public static int closestToZero(int a, int b, int c) {
        if (abs(a) <= abs(b) && abs(a) <= abs(c)) {
            return a;
        } else if (abs(b) <= abs(a) && abs(b) <= abs(c)) {
            return b;
        } else {
            return c;
        }
    }

    // TODO: Luua funktsioon, mis tagastab kas a on paaris arv
    // Näited
    // isNumberEven(4) = true
    // isNumberEven(1) = false
    public static boolean isNumberEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // TODO: Luua funktsioon, mis
    // Juhul kui a on paaris arv, siis jaga sisend 2
    // Juhul kui a on paaritu arv, siis korruta sisend 3 ja liida 1
    public int seq3n(int a) {
        if (isNumberEven(a)) {
            return a / 2;
        } else {
            return a * 3 + 1;
        }
    }

    // TODO tagasta maksimum väärtus
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta maksimum väärtus
    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // TODO tagasta suurim paaris arv
    // Kui kumbki arv ei ole paaris siis tagasta 0
    public static int largestPositive(int a, int b) {
        if (a % 2 == 0 && a >= b) {
            return a;
        } else if (b % 2 == 0 && b >= a) {
            return b;
        } else {
            return 0;
        }
    }

    // TODO tagasta suurim paaris arv
    // Kui kumbki arv ei ole paaris siis tagasta 0
    public static int largestPositive(int a, int b, int c) {
        if (a % 2 == 0 && a >= b && a >= c) {
            return a;
        } else if (b % 2 == 0 && b >= a && b >= c) {
            return b;
        } else if (c % 2 == 0 && c >= a && c >= b) {
            return c;
        } else {
            return 0;
        }
    }

    // int []
// 
    // TODO tagasta listist arv mis on kõige lähem numbrile nr
    public static int closestTo(int nr, int[] numbers) {
        int minDistance = Math.abs(nr - numbers[0]);
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(nr - numbers[i]) < minDistance) {
                System.out.println(numbers[i]);
                System.out.println(Math.abs(nr - numbers[i]));
                minIndex = i;
            }
        }
        return numbers[minIndex];
    }
}