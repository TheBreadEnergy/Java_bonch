package com.company;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static class Company {
        private String name;
        private String site;
        private String adress;
        private int year;
        private int sum_s;
        private int sum_f;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getSite() {
            return site;
        }
        public void setSite(String site) {
            this.site = site;
        }
        public String getAdress() {
            return adress;
        }
        public void setAdress(String adress) {
            this.adress = adress;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public int getSum_s() {
            return sum_s;
        }
        public void setSum_s(int sum_s) {
            this.sum_s = sum_s;
        }
        public int getSum_f() {
            return sum_f;
        }
        public void setSum_f(int sum_f) {
            this.sum_f = sum_f;
        }

        public String toString(){
            return "\nНазвание:" + getName() + "\nИнтернет адрес: " + getSite() +
                    "\nАдрес главного офиса: " + getAdress() + "\nПродолжительность пребывания на мировом рынке: " +
                    getYear() + "\nКоличество сотрудников: " + getSum_s() + "\nКоличество филиалов в Европе: " + getSum_f();
        }
    }

    public static void easy() throws IOException {
        System.out.println("Базовый уровень:");
        BufferedReader reader = new BufferedReader(new FileReader("easy.txt"));

        String line = null;
        Scanner scanner = null;
        int index = 0;
        int j = 0;

        Company[] comp  = new Company[3];

        while ((line = reader.readLine()) != null) {
            comp[j] = new Company();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    comp[j].setName(data);
                else if (index == 1)
                    comp[j].setSite(data);
                else if (index == 2)
                    comp[j].setAdress(data);
                else if (index == 3)
                    comp[j].setYear(Integer.parseInt(data));
                else if (index == 4)
                    comp[j].setSum_s(Integer.parseInt(data));
                else if (index == 5)
                    comp[j].setSum_f(Integer.parseInt(data));
                else
                    System.out.println("\nНекорректные данные " + data);
                index++;
            }
            j++;
            index = 0;
        }

        System.out.println("Список только тех компаний чей штат содрудников больше 10000:");
        for (int i = 0; i<j; i++) {
            if (comp[i].getSum_s() > 10000)
            System.out.println(comp[i].toString());
        }

    }



        public static void medium()throws IOException {
            System.out.println("\n\nСредний уровень:");
            BufferedReader reader = new BufferedReader(new FileReader("f.txt"));

            String line = null;
            Scanner scanner = null;
            ArrayList<Integer> mas = new ArrayList<>();
            ArrayList<Integer> plus = new ArrayList<>();
            ArrayList<Integer> minus = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                scanner = new Scanner(line);
                scanner.useDelimiter(" ");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    mas.add(Integer.parseInt(data));
                }
            }

            System.out.println("Файл f:");
           for (int i = 0; i < mas.size(); i++){
               System.out.print(mas.get(i) + " ");
               if (mas.get(i) > 0) plus.add(mas.get(i));
               if (mas.get(i) < 0) minus.add(mas.get(i));
           }


            try(FileWriter g = new FileWriter("g.txt", false)) {
                System.out.println("\nФайл g:");
                for (int i = 0; i < mas.size()/2; i++){
                    System.out.print(plus.get(i) + " ");
                    System.out.print(minus.get(i) + " ");
                    g.write(plus.get(i) + " ");
                    g.write(minus.get(i) + " ");
                }
            }

        }


            public static void hard()throws IOException{
            System.out.println("\n\nВысокий уровень:");
                String line;
                String chislo;
                int m = 0;
                int n = 0;
                int l = 0;
                int k = 0;
                ArrayList<ArrayList<ArrayList<String>>> file1 = new ArrayList<ArrayList<ArrayList<String>>>();
                ArrayList<ArrayList<ArrayList<String>>> file2 = new ArrayList<ArrayList<ArrayList<String>>>();
                ArrayList<Integer> mas1 = new ArrayList<>();
                ArrayList<Integer> mas2 = new ArrayList<>();
                ArrayList<Integer> result1 = new ArrayList<>();
                ArrayList<Integer> result2 = new ArrayList<>();


                try (BufferedReader dano_file = new BufferedReader(new FileReader("file1.txt"))) {
                    //чтение матриц
                    file1.add(new ArrayList<ArrayList<String>>());
                    while ((line = dano_file.readLine()) != null) {
                        if (line.length() == 0) {
                            file1.add(new ArrayList<ArrayList<String>>());
                            continue;
                        }
                        file1.get(file1.size() - 1).add(new ArrayList<String>());
                        chislo = "";
                        for (int i = 0; i < line.length(); i++) {
                            if (line.charAt(i) == ' ') {
                                file1.get(file1.size() - 1).get((file1.get(file1.size() - 1)).size() - 1).add(chislo);
                                chislo = "";
                                continue;
                            }
                            chislo += line.charAt(i);
                        }
                        file1.get(file1.size() - 1).get((file1.get(file1.size() - 1)).size() - 1).add(chislo);
                    }
                }
                try (BufferedReader dano1_file = new BufferedReader(new FileReader("file2.txt"))) {
                    //чтение матриц
                    file2.add(new ArrayList<ArrayList<String>>());
                    while ((line = dano1_file.readLine()) != null) {
                        if (line.length() == 0) {
                            file2.add(new ArrayList<ArrayList<String>>());
                            continue;
                        }
                        file2.get(file2.size() - 1).add(new ArrayList<String>());
                        chislo = "";
                        for (int i = 0; i < line.length(); i++) {
                            if (line.charAt(i) == ' ') {
                                file2.get(file2.size() - 1).get((file2.get(file2.size() - 1)).size() - 1).add(chislo);
                                chislo = "";
                                continue;
                            }
                            chislo += line.charAt(i);
                        }
                        file2.get(file2.size() - 1).get((file2.get(file2.size() - 1)).size() - 1).add(chislo);
                    }
                }

                System.out.println("Матрицы из первого файла:");
                for (int a = 0; a < file1.size(); a++) {
                    for (int i = 0; i < file1.get(a).size(); i++) {
                        for (int j = 0; j < file1.get(a).get(i).size(); j++) {
                            System.out.print(file1.get(a).get(i).get(j) + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }

                System.out.println("Матрицы из второго файла:");
                for (int a = 0; a < file2.size(); a++) {
                    for (int i = 0; i < file2.get(a).size(); i++) {
                        for (int j = 0; j < file2.get(a).get(i).size(); j++) {
                            System.out.print(file2.get(a).get(i).get(j) + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }

                for (int a = 0; a < file1.size(); a++) {
                    for (int i = 0; i < file1.get(a).size(); i++) {
                        for (int j = 0; j < file1.get(a).get(i).size(); j++) {
                            mas1.add(Integer.parseInt(file1.get(a).get(i).get(j)));
                        }
                    }
                }

                for (int i = 0; i < mas1.size()/2; i++){
                    result1.add(mas1.get(i)-mas1.get((mas1.size()/2)+i));
                }


                for (int a = 0; a < file2.size(); a++) {
                    for (int i = 0; i < file2.get(a).size(); i++) {
                        for (int j = 0; j < file2.get(a).get(i).size(); j++) {
                            mas2.add(Integer.parseInt(file2.get(a).get(i).get(j)));
                        }
                    }
                }

                for (int i = 0; i < mas2.size()/2; i++){
                    result2.add(mas2.get(i)-mas2.get((mas2.size()/2)+i));
                }

                try(FileWriter file3 = new FileWriter("file3.txt", false)) {
                    System.out.println("Третий файл:");
                    k = file1.size();
                    System.out.println("k = " + k);
                    file3.write("k = " + k +"\n");
                    m = file1.get(0).get(0).size();
                    System.out.println("m = " + m);
                    file3.write("m = " + m +"\n");
                    n = file1.get(0).size();
                    System.out.println("n = " + n);
                    file3.write("n = " + n +"\n");
                    l = file2.get(0).size();
                    System.out.println("l = " + l);
                    file3.write("l = " + l +"\n");

                    System.out.println("Разность матриц из первого файла:");
                    file3.write("Разность матриц из первого файла\n");
                    int check = 1;
                    for (int i = 0; i < result1.size(); i++) {
                        System.out.print(result1.get(i) + " ");
                        file3.write(result1.get(i) + " ");
                        if ((check + i) % m == 0){
                            System.out.println();
                            file3.write("\n");
                        }
                    }
                    System.out.println("Разность матриц из второго файла:");
                    file3.write("Разность матриц из второго файла\n");
                    check = 1;
                    for (int i = 0; i < result2.size(); i++) {
                        System.out.print(result2.get(i) + " ");
                        file3.write(result2.get(i) + " ");
                        if ((check + i) % m == 0){
                            System.out.println();
                            file3.write("\n");
                        }
                    }
                }

        }

        public static void main(String[] args) throws IOException {
            System.out.println("Вариант №23");
            easy();
            medium();
            hard();
        }
    }


