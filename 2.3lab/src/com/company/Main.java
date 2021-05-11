package com.company;

import java.util.Scanner;

public class Main {

    public static void easy() {
        int a=0,b=0,c=0;
        String str;
        boolean err = true, check = true;
        Scanner num = new Scanner(System.in);

        while (err){
            System.out.println("Базовый уровень:");
            System.out.println("Введите ваш выбор от 1 до 3:");
            System.out.println("1. a = 10   b = 34    c = 65");
            System.out.println("2. a = 76   b = 18    c = 55");
            System.out.println("3. a = 81   b = 75    c = 20");
            str = num.nextLine();
            switch (str){
                case "1":
                    a = 10;
                    b = 34;
                    c = 65;
                    err = false;
                    break;
                case "2":
                    a = 76;
                    b = 18;
                    c = 55;
                    err = false;
                    break;
                case "3":
                    a = 81;
                    b = 75;
                    c = 20;
                    err = false;
                    break;
                default:
                    System.out.println("Неправильный ввод! Выберите число от 1 до 3!");
                    break;
            }
        }
            if (a > 107) System.out.println("a больше 1101011");
            else System.out.println("a меньше 1101011");
            if (b> 107) System.out.println("b больше 1101011n");
            else System.out.println("b меньше 1101011");
            if (c > 107) System.out.println("c больше 1101011\n\n");
            else System.out.println("c меньше 1101011\n\n");
    }

    public static void medium() {
        double a = 0, b = 0, z = 0, x = 0, y = 0;
        String str = null, str1;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Средний уровень:");
            System.out.println("Введите x:");
            str = num.nextLine();

            try {
                x = Double.parseDouble(str);
                err = false;
            } catch (NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод числа:");
            }
        }
        err = true;
        while(err){
            System.out.println("Введите ваш выбор от 1 до 3:");
            System.out.println("1. a = 1.5  b = 6.4    z = ln|bx^3 + 1.5|");
            System.out.println("2. a = 1.9  b = 8.6    z = ln|bx^3 + 3|");
            System.out.println("3. a = 0.6  b = 2.4    z = ln|bx^3 + 1.8|");
            str = num.nextLine();
            switch (str){
                case "1":
                    a = 1.5;
                    b = 6.4;
                    z = Math.log(Math.abs(Math.pow(b*x,3) + 1.5));
                    err = false;
                    break;
                case "2":
                    a = 1.9;
                    b = 8.6;
                    z = Math.log(Math.abs(Math.pow(b*x,3) + 3));
                    err = false;
                    break;
                case "3":
                    a = 0.6;
                    b = 2.4;
                    z = Math.log(Math.abs(Math.pow(b*x,3) + 1.8));
                    err = false;
                    break;
                default:
                    System.out.println("Неправильный ввод! Выберите число от 1 до 3!");
                    break;
            }
        }
        if((Math.pow(a,3) < x)&&( x <= b)){
            y = Math.log(Math.abs(b*z*x))+z*Math.pow(a,2.5);
            System.out.println("y = " + y + "\n\n");
        }
        else if(( x > b)){
            y = a*Math.pow(x,2)+b*Math.pow(z,a)+Math.pow(Math.sin(z*x),2);
            System.out.println("y = " + y + "\n\n");
        }
        else if((Math.pow(a,3) >= x)){
            y = Math.cos(a*x+b)+Math.log(Math.abs(z*x));
            System.out.println("y = " + y + "\n\n");
        }else System.out.println("Невозможно найти y");
    }



    public static void hard() {
        int day = 0;
        String str;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Высокий уровень:");
            System.out.println("Введите день:");
            str = num.nextLine();

            try {
                day = Integer.parseInt(str);
                if ((day < 1) || (day > 365)) {
                    System.out.println("Число должно бычть от 1 до 365!");
                } else {
                    err = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод числа:");
            }
        }
        if ((day >= 1) && (day <= 7)) {
            switch (day) {
                case 1:
                    System.out.println("Это понедельник\n\n");
                    break;
                case 2:
                    System.out.println("Это вторник\n\n");
                    break;
                case 3:
                    System.out.println("Это среда\n\n");
                    break;
                case 4:
                    System.out.println("Это четверг\n\n");
                    break;
                case 5:
                    System.out.println("Это пятница\n\n");
                    break;
                case 6:
                    System.out.println("Это суббота\n\n");
                    break;
                case 7:
                    System.out.println("Это воскресенье\n\n");
                    break;
            }
        } else {
            switch (day % 7) {
                case 0:
                    System.out.println("Это понедельник\n\n");
                    break;
                case 1:
                    System.out.println("Это вторник\n\n");
                    break;
                case 2:
                    System.out.println("Это среда\n\n");
                    break;
                case 3:
                    System.out.println("Это четверг\n\n");
                    break;
                case 4:
                    System.out.println("Это пятница\n\n");
                    break;
                case 5:
                    System.out.println("Это суббота\n\n");
                    break;
                case 6:
                    System.out.println("Это воскресенье\n\n");
                    break;
            }
        }
    }



    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}
