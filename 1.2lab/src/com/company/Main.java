package com.company;

import java.util.Scanner;

public class Main {

    public static void easy() {
        double y = 0, x = 0 ;
        String str;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Базовый уровень:");
            System.out.println("Введите x:");
            str = num.nextLine();

            try {
                x = Double.parseDouble(str);
                err = false;
            } catch(NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод чисел:");
            }
        }
        System.out.println("Решение:");
        System.out.println("1. x - 3 = " + (x - 3));
        System.out.println("2. (x - 3)^6 = " + (Math.pow((x - 3), 6)));
        System.out.println("3. 8*(x - 3)^6 = " + (8*(Math.pow((x - 3), 6))));
        System.out.println("4. (x - 3)^3 = " + (Math.pow((x - 3), 3)));
        System.out.println("5. 7*(x - 3)^3 = " + (7*(Math.pow((x - 3), 3))));
        System.out.println("6. 8*(x - 3)^6 - 7*(x - 3)^3 = " + ((8*(Math.pow((x - 3), 6))) - (7*(Math.pow((x - 3), 3)))));
        y = ((8*(Math.pow((x - 3), 6))) - (7*(Math.pow((x - 3), 3)))+27);
        System.out.println("7. 8*(x - 3)^6 - 7*(x - 3)^3 + 27 = " + y);
        System.out.println("Ответ:");
        System.out.println("y = " + y + "\n\n");

    }
    public static void medium() {
        double b = 0.3, x = 5.2, y = 0, a = 0, t = 0;
        String str;
        boolean err = true, check = true;
        Scanner num = new Scanner(System.in);

        while (check) {
            System.out.println("Средний уровень:");
            System.out.println("Ввести x или b?");
            str = num.nextLine();
            switch (str) {
                case "x":
                    System.out.println("Выбран x");
                    while (err) {
                        System.out.println("Введите значение x");
                        str = num.nextLine();
                        try {
                            x = Double.parseDouble(str);

                            if (1 != 1) {

                            } else {
                                err = false;
                                check = false;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Формат числа неверный! Повторите ввод числа:");
                        }
                    }
                    break;
                case "b":
                    System.out.println("Выбран b");
                    while (err) {
                        System.out.println("Введите значение b");
                        str = num.nextLine();
                        try {
                            b = Double.parseDouble(str);

                            if (1 != 1) {

                            } else {
                                err = false;
                                check = false;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Формат числа неверный! Повторите ввод числа:");
                        }
                    }
                    break;
                default:
                    System.out.println("Неверный ввод! Повторите попытку:");
            }
        }
        System.out.println("x = " + x);
        System.out.println("b = " + b);
        System.out.println("Решение:");
        System.out.println("Найдём t = x * b^2 + sqrt(x)");
        System.out.println("1. b^2 = " + (Math.pow(b,2)));
        System.out.println("2. x * b^2 = " + (x*(Math.pow(b,2))));
        System.out.println("3. sqrt(x) = " + (Math.sqrt(x)));
        t = ((x*(Math.pow(b,2)))+(Math.sqrt(x)));
        System.out.println("4. x * b^2 + sqrt(x) = " + t);
        System.out.println("t = " + t);
        System.out.println("Найдём a = lg|t * x + b^2|");
        System.out.println("1. t * x = " + (t*x));
        System.out.println("2. b^2 = " + (Math.pow(b,2)));
        System.out.println("3. t * x + b^2 = " + ((t*x) + (Math.pow(b,2))));
        System.out.println("4. |t * x + b^2| = " + (Math.abs((t*x) + (Math.pow(b,2)))));
        a = (Math.log10(Math.abs((t*x) + (Math.pow(b,2)))));
        System.out.println("5. lg|t * x + b^2| = " + a);
        System.out.println("a = " + a);
        System.out.println("Найдём y = ln(a + b) + (a^2 / a + t)");
        System.out.println("1. a + b = " + (a+b));
        System.out.println("2. ln(a + b) = " + (Math.log(a+b)));
        System.out.println("3. a^2 = " + (Math.pow(a,2)));
        System.out.println("4. a + t = " + (a+t));
        System.out.println("5. a^2 / a + t = " + ((Math.pow(a,2))/(a+t)));
        y = ((Math.log(a+b)) + ((Math.pow(a,2))/(a+t)));
        System.out.println("6. ln(a + b) + (a^2 / a + t) = " + y);
        System.out.println("y = " + y);
        System.out.println("Ответ:");
        System.out.println("t = " + t);
        System.out.println("a = " + a);
        System.out.println("y = " + y + "\n\n");
    }
    public static void hard() {

        double a = 0, b = 0, n = 0;
        String str;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Высокий уровень:");
            System.out.println("Введите n:");
            str = num.nextLine();
            try {
                n = Double.parseDouble(str);
                if(n==-1) {
                    System.out.println("Знаменать не может быть равен 0!");
                }
                else if (((Math.sqrt(n/(n+1))) > 1) || ((Math.sqrt(n/(n+1)))  < -1 )) {
                    System.out.println("Область определения arccos от -1 до 1! Повторите ввод чисел:");
                }else {
                    err = false;
                }
            } catch(NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод чисел:");
            }
        }
        System.out.println("Решение:");
        System.out.println("1. n + 1 = " + (n+1));
        System.out.println("2. n / n + 1 = " + n/(n+1));
        System.out.println("3. sqrt(n / n + 1) = " + Math.sqrt(n/(n+1)));
        System.out.println("u/Umax = " +  Math.sqrt(n/(n+1)) + "\n");
        System.out.println("1. n + 1 = " + (n+1));
        System.out.println("2. n / n + 1 = " + n/(n+1));
        System.out.println("3. sqrt(n / n + 1) = " + Math.sqrt(n/(n+1)));
        System.out.println("4. arccos(sqrt(n / n + 1)) = " + Math.acos(Math.sqrt(n/(n+1))));
        System.out.println("5. 2 * pi = " + (2*Math.PI));
        System.out.println("6. arccos(sqrt(n / n + 1))/2* pi = " + (Math.acos(Math.sqrt(n/(n+1))))/(2*Math.PI));
        System.out.println("t/T = " +  (Math.acos(Math.sqrt(n/(n+1))))/(2*Math.PI) + "\n\n");
    }
    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}
