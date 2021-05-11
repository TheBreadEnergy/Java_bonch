package com.company;

import java.util.Scanner;

public class Main {

    public static void easy() {
        double x = 0, y = 0;
        String str, str1;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Базовый уровень:");
            System.out.println("Введите скорость первого в км/ч");
            str = num.nextLine();
            System.out.println("Введите скорость второго в м/c");
            str1 = num.nextLine();

            try {
                x = Double.parseDouble(str);
                y = Double.parseDouble(str1);
                err = false;
            } catch(NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод чисел:");
            }
        }
        x = x*1000/3600;
        if (x>y){
            System.out.println("Скорость первого быстрее\n\n");
        }else{
            System.out.println("Скорость второго быстрее\n\n");
        }

    }

    public static void medium() {
        double a = 0, b = 0;
        String str, str1;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Средний уровень:");
            System.out.println("Введите a");
            str = num.nextLine();
            System.out.println("Введите b");
            str1 = num.nextLine();

            try {
                a = Double.parseDouble(str);
                b = Double.parseDouble(str1);
                err = false;
            } catch(NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод чисел:");
            }
        }
        if (a%b == 0){
            System.out.println("b является делителем a");
        } else System.out.println("b не является делителем a");
        if (b%a == 0){
            System.out.println("a является делителем b\n\n");
        }else System.out.println("a не является делителем b\n\n");
    }

    public static void hard(){
        double x = 0, y = 0;
        String str, str1;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Высокий уровень:");
            System.out.println("Введите x");
            str = num.nextLine();
            System.out.println("Введите y");
            str1 = num.nextLine();

            try {
                x = Double.parseDouble(str);
                y = Double.parseDouble(str1);
                err = false;
            } catch(NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод чисел:");
            }
        }
        if ((Math.pow(y,2) + Math.pow((x-1),2)) <= 1){
            System.out.println("Точка A(x,y) попадает в область ограниченной окружности y^2 + (x-1)^2 = 1");
        }else System.out.println("Точка A(x,y) не попадает в область ограниченной окружности y^2 + (x-1)^2 = 1");
    }


    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}
