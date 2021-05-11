package com.company;

import java.util.Scanner;

public class Main {

    public static void easy() {
        double G = 0, y = 0, f = 0;
        String str, str1;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Базовый уровень:");
            System.out.println("Найти G = exp(2 * y) + sin(f)");
            System.out.println("Введите y:");
            str = num.nextLine();
            System.out.println("Введите f:");
            str1 = num.nextLine();

            try {
                y = Double.parseDouble(str);
                f = Double.parseDouble(str1);
                err = false;
            } catch(NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод чисел:");
            }
        }
        System.out.println("Решение:");
        System.out.println("1. 2 * y = " + 2*y);
        System.out.println("2. exp(2 * y) = " + Math.exp(2*y));
        System.out.println("3. sin(f) = " + Math.sin(f));
        G = Math.exp(2*y)+Math.sin(f);
        System.out.println("4. exp(2 * y) + sin(f) = " + G);
        System.out.println("Ответ:");
        System.out.println("G = " + G + "\n\n");

    }

    public static void medium() {
        double R = 0, y = 0, d = 0;
        String str, str1;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Средний уровень:");
            System.out.println("Найти R = sin^2 y + 0.3*d");
            System.out.println("Введите y:");
            str = num.nextLine();
            System.out.println("Введите d:");
            str1 = num.nextLine();

            try {
                y = Double.parseDouble(str);
                d = Double.parseDouble(str1);

                if (d <= 0) {
                    System.out.println("Подлогарифмическое выражение должно быть больше 0! Повторите ввод чисел:");
                    medium();
                }
                else if ((Math.exp(y) + (Math.log(d))) == 0) {
                    System.out.println("Знаменатель не может быть равен 0! Повторите ввод чисел:");
                    medium();
                }
                else {
                    err = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод чисел:");
            }
        }
        System.out.println("Решение:");
        System.out.println("1. sin^2 y = " + (Math.pow(Math.sin(y), 2)));
        System.out.println("2. 0.3*d = " + (0.3*d));
        System.out.println("3. sin^2 y + 0.3*d  = " + ((Math.pow(Math.sin(y), 2)) + (0.3*d)));
        System.out.println("4. exp(y) = " + (Math.exp(y)));
        System.out.println("5. ln d = " + (Math.log(d)));
        System.out.println("6. exp(y) + ln d = " + ((Math.exp(y)) + (Math.log(d))));
        R=((Math.pow(Math.sin(y), 2)) + (0.3*d)) / (((Math.exp(y)) + (-Math.log(d))));
        System.out.println("7. sin^2 y + 0.3*d  = " + R);
        System.out.println("Ответ:");
        System.out.println("R = " + R + "\n\n");
    }

    public static void hard(){
        double F = 0, x = 0, z = 0, b = 0, a = 0;
        String str, str1, str2, str3;
        boolean err = true;
        Scanner num = new Scanner(System.in);

        while (err) {
            System.out.println("Высокий уровень:");
            System.out.println("Найти F = sqrt(|x| + cos^3 x + z^4) / ln x - arcsin(b*x - a)");
            System.out.println("Введите x:");
            str = num.nextLine();
            System.out.println("Введите z:");
            str1 = num.nextLine();
            System.out.println("Введите b:");
            str2 = num.nextLine();
            System.out.println("Введите a:");
            str3 = num.nextLine();

            try {
                x = Double.parseDouble(str);
                z = Double.parseDouble(str1);
                b = Double.parseDouble(str2);
                a = Double.parseDouble(str3);


                if (x <= 0) {
                    System.out.println("Подлогарифмическое выражение должно быть больше 0! Повторите ввод чисел:");
                }
                else if(((b * x - a) > 1) || ((b * x - a) < -1) ) {
                    System.out.println("Область определения arcsin от -1 до 1! Повторите ввод чисел:");
                }
                else if (((Math.log(x)) - (Math.asin(b * x - a))) == 0) {
                    System.out.println("Знаменатель не может быть равен 0! Повторите ввод чисел:");
                }
                else if ((Math.abs(x) + (Math.pow(Math.cos(x), 3)) + Math.pow(z, 4)) < 0) {
                    System.out.println("Подкоренное выражение должно быть больше 0! Повторите ввод чисел:");
                }else {
                    err = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Формат числа неверный! Повторите ввод чисел:");
            }
        }
        System.out.println("Решение:");
        System.out.println("1. |x| = " + (Math.abs(x)));
        System.out.println("2. cos^3 x = " + (Math.pow(Math.cos(x), 3)));
        System.out.println("3. z^4 = " + (Math.pow(z, 4)));
        System.out.println("4. |x| + cos^3 x = " + ((Math.abs(x)) + Math.pow(Math.cos(x), 3)));
        System.out.println("5. |x| + cos^3 x + z^4= " + ((Math.abs(x)) + Math.pow(Math.cos(x), 3) + Math.pow(z, 4)));
        System.out.println("6. sqrt(|x| + cos^3 x + z^4)= " + ((Math.sqrt((Math.abs(x)) + Math.pow(Math.cos(x), 3) + Math.pow(z, 4)))));
        System.out.println("7. ln x = " + (Math.log(x)));
        System.out.println("8. b * x = " + (b * x));
        System.out.println("9. b * x - a = " + (b * x - a));
        System.out.println("10. arcsin(b*x - a) = " + (Math.asin(b * x - a)));
        System.out.println("11. ln x - arcsin(b*x - a) = " + (Math.log(x) - Math.asin(b * x - a)));
        F=((Math.sqrt((Math.abs(x)) + Math.pow(Math.cos(x), 3) + Math.pow(z, 4))) / (Math.log(x) - Math.asin(b * x - a)));
        System.out.println("12. sqrt(|x| + cos^3 x + z^4) / ln x - arcsin(b*x - a) = " + F);
        System.out.println("Ответ:");
        System.out.println("F = " + F + "\n");
    }


    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}
