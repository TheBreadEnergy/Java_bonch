package com.company;

public class Main {

    public static void easy() {
        System.out.println("Базовый уровень:");
        char nums[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char arr[][] = {
                {'@', '3', 'f', '?'},
                {'.', '*', '=', 'a'},
                {'w', '8', '6', '/'},
        };
        int s = 0;

        System.out.println("Массив: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Исправленный массив: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int a = 0; a < 10; a++)
                    if (arr[i][j] == nums[a]){
                    arr[i][j]='!';
                    s++;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Всего чисел в исходном массиве было: " + s);
    }

    public static void medium() {
        System.out.println("\n\nСредний уровень:");
        char A[] = {'w', '3', 'n', 'y', '?', '&', '*', '%', 'q', '0',};
        char B[] = {'3', '0', 'a', 'c', '!', '@', 'k', 'm', '*', 'n',};
        int s = 0;

        System.out.println("Массив A: ");
        for (int i = 0; i < 10; i++) System.out.print(A[i] + " ");
        System.out.println("\nМассив B: ");
        for (int i = 0; i < 10; i++) System.out.print(B[i] + " ");

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                if (A[i]==B[j]) s++;

        System.out.println("\nСовпадений: " + s);
    }


    public static void hard(){
        System.out.println("\n\nВысокий уровень:");
        String arr[]= {
                "Иванов Ю.А.",
                "Петров М.Н.",
                "Пушкин А.С.",
                "Егоров А.А.",
                "Петров Ф.П.",
                "Иванов С.В."
        };
        int n [] = new int[arr.length];
        String str[] = new String[arr.length];
        char [] buff = null;

        System.out.println("Массив: ");
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                buff = new char[arr[i].length()-5];
                arr[i].getChars(0, arr[i].length()-5, buff, 0);
                str[i] = String.valueOf(buff);
            }

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                if (str[i].contains(str[j])) n[i]++;

        System.out.println("Итог:");
        for (int i = 0; i < arr.length; i++) System.out.println(arr[i] + " имеет однофамильцев: " + (n[i]-1));
    }

    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}

