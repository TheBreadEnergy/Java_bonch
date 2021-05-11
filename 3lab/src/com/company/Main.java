package com.company;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static BigInteger factorialBig(int n) {
            BigInteger ret = BigInteger.ONE;
            for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
            return ret;
        }

    public static int factorial(int n) {
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }

    public static void easy() {
        int n = 0;
        String str;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Базовый уровень:");
            System.out.println("Введите n:");
            str = num.nextLine();

            try {
                n = Integer.parseInt(str);
                err = false;
            } catch (NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод числа:");
            }
        }
        System.out.println("n! = " + factorialBig(n));
        System.out.println("2^n = " + Math.pow(2,n));
        System.out.println("\n\n");
    }

    public static void medium() {
        int n = 0;
        double S = 0;
        String str;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Средний уровень:");
            System.out.println("Введите n:");
            str = num.nextLine();

            try {
                n = Integer.parseInt(str);
                err = false;
            } catch (NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод числа:");
            }
        }
        for (int k = 1; k<n; k++){
            S = S + ((Math.pow((k-4),3)) * (k+7))/Double.valueOf(factorial(k));
        }
        System.out.println("S = " + S);
    }

    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
    }
}
