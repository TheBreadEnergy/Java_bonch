package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void easy() {
        System.out.println("Базовый уровень:");
        int S = 0;
        for (int i = -20; i <0; i++){
            if(i % 5 == 0)
            S = S + i;
        }
        System.out.println("Сумма равна " + S +"\n\n");
    }

    public static void medium() {
        int n = 0;
        boolean err = true;
        String str;
        Scanner num = new Scanner(System.in);
            while (err) {
                System.out.println("Средний уровень:");
                System.out.println("Введите положительное число: ");
                str = num.nextLine();

                try {
                    n = Integer.parseInt(str);
                    if(n <=1 ){
                        System.out.println("Число должно быть больше 1!");
                    }else
                    err = false;
                } catch (NumberFormatException e) {
                    System.out.println("Формат числа неверный! Пример изменён! Повторите ввод числа:");
                }
            }
            err = true;
        for (int P = 2; P <= n; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    err = false;
                    break;
                }
            }
            if (err) System.out.print(P + "\t");
            else err = true;

        }
        System.out.println("\n\n");
    }

    public static void hard(){
        System.out.println("Высокий уровень:");
        Integer rating = 0, otv = 0, a = 0 , b = 0, primer= 0;
        boolean err = true;
        String str;


        Scanner num = new Scanner(System.in);
        for (int i = 1; i <= 10; i++){
            while (err) {
                a = (int) (Math.random() * 10 + 1);;
                b = (int) (Math.random() * 10 + 1);
                primer = a * b;
                System.out.println(i + ". " + a + " * " + b +" = ?");
                System.out.print("Ответ: ");
                str = num.nextLine();

                try {
                    otv = Integer.parseInt(str);
                    err = false;
                } catch (NumberFormatException e) {
                    System.out.println("Формат числа неверный! Пример изменён! Повторите ввод числа:");
                }
                if (otv == primer) rating=++rating;
            }
            err = true;
        }
        if (rating == 10) System.out.println("Оценка отлично!");
        if (rating == 9 || rating == 8) System.out.println("Оценка хорошо!");
        if (rating == 7) System.out.println("Оценка удворетворительно!");
        if (rating <=6) System.out.println("Оценка плохо!");
        System.out.println("Всего правильных ответов: " + rating);
    }

    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}
