package com.company;

public class Main {

    public static void easy() {
        System.out.println("Базовый уровень:");
        String str = "Приключения Шерлока Холмса (англ. The Adventures of Sherlock Holmes) — серия компьютерных игр компании Frogwares в жанре квеста.";
        char buff[] = str.toCharArray();
        int skb = 0;

        System.out.println("Текст:\n" + str);

        for (int i = 0; i < buff.length; i++)
            if((buff[i]=='(')||(buff[i]==')')) skb++;

            if(skb%2==0) System.out.println("Ответ:\nКоличество круглых открывающихся и круглых закрывающихся скобок совпадает.");
            else System.out.println("Ответ:\nКоличество круглых открывающихся и круглых закрывающихся скобок не совпадает.");
    }

    public static void medium() {
        System.out.println("\n\nСредний уровень:");
        char str [] = {'a','b','c','1','2','3','!'};
        String res = "";

        System.out.println("Исходная строка: " + String.valueOf(str));
        for (int i=0; i<str.length; i++){
            int ascii = (int) str[i];
            res+=str[i] + "_" +String.valueOf(ascii) + " ";
        }
        System.out.println("Итог: "+res);
    }


    public static void hard(){
        System.out.println("\n\nВысокий уровень:");
        char str1[] = {'q','w','e','r','t','y'};
        char str2[] = {'q','a','b','c','t','y'};
        String str3 = "";
        int check = 0;

        System.out.println("Первая строка: " + String.valueOf(str1));
        System.out.println("Вторая строка: " + String.valueOf(str2));
        for (int i = 0; i<str1.length; i++){
            check = 0;
            for (int j = 0; j<str2.length; j++){
                if(str1[i]!=str2[j]){
                    check++;
                }
                if (check>str1.length-1) str3 += String.valueOf(str1[i]);
            }
        }

        System.out.println("Строка из символов первой строки, \nкоторые входят в первую, но не входят во втроую стороку: " + str3);

    }

    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}

