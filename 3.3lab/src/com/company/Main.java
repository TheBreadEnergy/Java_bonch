package com.company;

import java.util.Scanner;

public class Main {

    public static int factorial(int n) {
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }

    public static void main(String[] args) {
        int n = 0;
        double x = 0;
        double S = 0;
        boolean err = true;
        String str,str1;
        Scanner num = new Scanner(System.in);
        System.out.println("Вариант №23");
        while (err) {
            System.out.println("Введите n");
            str = num.nextLine();
            System.out.println("Введите x");
            str1 = num.nextLine();

            try {
                n = Integer.parseInt(str);
                x = Double.parseDouble(str1);
                if(n < 1 ){
                    System.out.println("Число должно быть больше 1!");
                }else
                    err = false;
            } catch (NumberFormatException e) {
                System.out.println("Формат числа неверный! Пример изменён! Повторите ввод числа:");
            }
        }

        for (int i = 1; i<=n; i++ ){
            if (i % 2 == 0) S = S + ((Math.pow((2*x),i))/factorial(i));
            else S = S - ((Math.pow((2*x),i))/factorial(i));
        }
        System.out.println("Сумма равна: " + S);
    }
}
