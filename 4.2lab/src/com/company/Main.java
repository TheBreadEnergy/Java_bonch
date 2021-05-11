package com.company;

import java.util.Scanner;

public class Main {

    public static void easy() {
        System.out.println("Базовый уровень:");
        int A [][] = new int[4][5];
        int SA = 0, result = 0;
        System.out.println("Массив A[n][m]: ");
        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++) {
                A[i][j] = (int) (Math.random() * 5 + 1);
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        for (int i=0; i<4; i++) {
            for (int j = 0; j < 5; j++) {
            SA+=A[i][j];
            }
        }
        SA=SA/(4*5);
        System.out.println("Среднее арифметическое массива A[n][m]: " + SA);
        for (int i=0; i<4; i++) {
            for (int j = 0; j < 5; j++) {
                if(A[i][j]>SA) result++;
            }
        }
        System.out.println("Ответ: " + result);
    }

    public static void medium() {
        System.out.println("\n\nСредний уровень:");
        int A [][] = new int[5][5];
        int min = 0, buf = 0, result = 0;
        System.out.println("Массив: ");
        for (int i=0; i<5; i++){
            System.out.print("["+i+"]\t");
        }
        System.out.println();
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++) {
                A[i][j] = (int) (Math.random() * 5 + 1);
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i=0; i<5; i++) {
            for (int j = 0; j < 5; j++) {
                if(A[j][i] % 5 == 0) min++;
            }
            if (buf < min) result = i;
            min = 0;
        }
        System.out.println("Ответ столбец: " + result);
    }


    public static void hard(){
        System.out.println("\n\nВысокий уровень:");
        int A [][] = {
                {0,0,1,0,0},
                {0,0,1,0,0},
                {1,1,1,1,1},
                {0,0,1,0,0},
                {0,0,1,0,0}
        };

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}

