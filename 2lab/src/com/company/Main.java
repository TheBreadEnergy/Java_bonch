package com.company;

import java.util.Scanner;

public class Main {

    public static void easy() {
        double A = 0;
        String str;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Базовый уровень:");
            System.out.println("Введите A:");
            str = num.nextLine();

            try {
                A = Double.parseDouble(str);
                err = false;
            } catch (NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод чисел:");
            }
        }
        if (((A <= -10) && (A >= -1)) || ((A >= 2) && (A <= 15))) {
            System.out.println("А приндлежит интервалу от -10 до -1 или интервалу от 2 до 15\n\n");
        } else {
            System.out.println("А не приндлежит интервалу от -10 до -1 или интервалу от 2 до 15\n\n");
        }

    }

    public static void medium() {
        double s = 0, sale = 1;
        Integer dt = 0, d =0;
        String str, str1;
        boolean err = true, check = true;
        Scanner num = new Scanner(System.in);

        while (check) {
            System.out.println("Средний уровень:");
            System.out.println("Выберите страну:");
            System.out.println("1. Россия");
            System.out.println("2. Украина");
            str = num.nextLine();
            switch (str) {
                case "1":
                    System.out.println("Выбрана Россия");
                    s = 0.9;
                    while (err) {
                        System.out.println("Введите день недели числом от 1 до 7 (Например: вторник это 2)");
                        str = num.nextLine();
                        System.out.println("Введите продолжительность разговора в минутах");
                        str1 = num.nextLine();
                        try {
                            d = Integer.parseInt(str);
                            dt = Integer.parseInt(str1);

                            if((d<1)||(d>7)){
                                System.out.println("Неправильный ввод! Введите число от 1 до 7.");
                            }
                            else if (dt<=0){
                                System.out.println("Неправильный ввод! Количество минут не может быть 0 или меньше");
                            }else {
                                err = false;
                                check = false;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Формат числа неверный! Повторите ввод числа:");
                        }
                    }
                    break;
                case "2":
                    System.out.println("Выбрана Украина");
                    s = 0.35;
                    while (err) {
                        System.out.println("Введите день недели числом от 1 до 7 (Например: вторник это 2)");
                        str = num.nextLine();
                        System.out.println("Введите продолжительность разговора в минутах");
                        str1 = num.nextLine();
                        try {
                            d = Integer.parseInt(str);
                            dt = Integer.parseInt(str1);

                            if((d<1)||(d>7)){
                                System.out.println("Неправильный ввод! Введите число от 1 до 7.");
                            }
                            else if (dt<=0){
                                System.out.println("Неправильный ввод! Количество минут не может быть 0 или меньше");
                            }else {
                                err = false;
                                check = false;
                            }

                        } catch (NumberFormatException e) {
                            System.out.println("Формат числа неверный! Повторите ввод числа:");
                        }
                    }
                    break;
                default:
                    System.out.println("Неверный ввод! Введите число 1 или 2.");
            }
        }
        if((d==6)||(d==7)){
            sale = 0.9;
            System.out.println("С учётом скидки 10%");
        }
        System.out.println("Стоимость переговоров будет равна: " + (s*dt*sale) + " грн\n\n");

    }

    public static void hard() {
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
        if ((y<x)&&(y>x-1)&&(y>-x)&&(y<-x+1)){
            System.out.println("Точка A(x,y) попадает в область");
        }else System.out.println("Точка A(x,y) не попадает в область");
    }

    public static void main(String[] args) {
        System.out.println("Вариант №23");
        //easy();
        //medium();
        hard();
    }
}
