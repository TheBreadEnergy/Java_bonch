package com.company;

import java.util.Scanner;

public class Main {

    public static void easy() {
        System.out.println("Базовый уровень:");
        int sum = 0, pro = 1;
        int arr[] = new int[15];
        boolean err;
        String str;
        Scanner num = new Scanner(System.in);

        for (int i = 1; i <= 14; i++) {
            err = true;
            while (err) {
                System.out.print("Введите число для arr[" + i + "]: ");
                str = num.nextLine();
                try {
                    arr[i] = Integer.parseInt(str);
                    err = false;
                } catch (NumberFormatException e) {
                    System.out.println("Формат числа неверный! Повторите ввод числа:");
                }
            }
        }
            for (int i = 1; i <= 14;i++){
                if(i % 2 == 0) sum+=arr[i];
                else pro*=arr[i];
            }
            System.out.println("Сумма чётных по индексу: " + sum);
        System.out.println("Произведение нечётных по индексу: " + pro);

    }

    public static void medium() {
        System.out.println("\n\nСредний уровень:");
        int x [] = new int[10];
        double y [] = new double[10];
        double P = 1;
        System.out.print("Массив X: ");
        for (int i=0; i<10; i++){
            x[i]=(int) (Math.random() * 5 + 1);
            System.out.print(x[i]+" ");
        }
        System.out.print("\nМассив Y: ");
        for (int i=0; i<10; i++){
            y[i]=Math.pow(x[i],2)+0.3;
            System.out.print(y[i]+" ");
        }
        for (int i = 0; i<9; i++){
            P*=(x[i+1]*y[i+1])/(x[i]*y[i]);
        }
        System.out.println("\nP = " + P);
    }


    public static void hard(){
        System.out.println("\n\nВысокий уровень:");
        int arr [] = new int[10];
        int result = 0;
        System.out.print("Исходный массив в десятичной системе: ");
        for (int i=0; i<10; i++){
            arr[i]=(int) (Math.random() * 9 + 1);
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nИсходный массив в двочиной системе: ");
        for (int i=0; i<10; i++){
            arr[i]=Integer.parseInt(Integer.toBinaryString(arr[i]));
            System.out.print(arr[i]+" ");
        }
        for (int i=1; i<9; i++){
            if(((arr[i+1]) > (arr[i]))&&((arr[i-1]) < (arr[i]))) result++;
        }
        if(result > 0) System.out.println("\nОтвет: "+result);
        else System.out.println("\nТаких чисел нет");
    }

    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}

