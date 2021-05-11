package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static class Football {
        private String surname;
        private String role;
        private String year;
        private String sum_game;
        private String sum_goal;

        public String getSurname() {
            return surname;
        }
        public void setSurname(String surname) {
            this.surname = surname;
        }
        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }
        public String getYear() {
            return year;
        }
        public void setYear(String year) {
            this.year = year;
        }
        public String getSum_game() {
            return sum_game;
        }
        public void setSum_game(String sum_game) {
            this.sum_game = sum_game;
        }
        public String getSum_goal() {
            return sum_goal;
        }
        public void setSum_goal(String sum_goal) {
            this.sum_goal = sum_goal;
        }

        public void player(){
            String[] surname = getSurname().split("(?<=\\G.{8})");
            String[] role = getRole().split("(?<=\\G.{8})");
            String[] year = getYear().split("(?<=\\G.{8})");
            String[] sum_game = getSum_game().split("(?<=\\G.{8})");
            String[] sum_goal = getSum_goal().split("(?<=\\G.{8})");

            String s = null;
            String r = null;
            String y = null;
            String sgm = null;
            String sgl = null;

            System.out.print("\n\nФамилия: ");
            for (int i = 0; i < surname.length; i++) {
                int count = Integer.parseInt(surname[i], 2);
                s = new Character((char)count).toString();
                System.out.print(s);
            }
            System.out.print("\nАмплуа: ");
            for (int i = 0; i < role.length; i++) {
                int count = Integer.parseInt(role[i], 2);
                r = new Character((char)count).toString();
                System.out.print(r);
            }
            System.out.print("\nГод рождения: ");
            for (int i = 0; i < year.length; i++) {
                int count = Integer.parseInt(year[i], 2);
                y = new Character((char)count).toString();
                System.out.print(y);
            }
            System.out.print("\nКоличество игр, проведенных игроком: ");
            for (int i = 0; i < sum_game.length; i++) {
                int count = Integer.parseInt(sum_game[i], 2);
                sgm = new Character((char)count).toString();
                System.out.print(sgm);
            }
            System.out.print("\nКоличество голов, забитых игроком: ");
            for (int i = 0; i < sum_goal.length; i++) {
                int count = Integer.parseInt(sum_goal[i], 2);
                sgl = new Character((char)count).toString();
                System.out.print(sgl);
            }

        }
    }

    public static void easy() throws IOException {
        System.out.println("Базовый уровень:");
        BufferedReader reader = new BufferedReader(new FileReader("easy.txt"));

        String line = null;
        Scanner scanner = null;
        int index = 0;
        int j = 0;

        Football[] player  = new Football[3];

        while ((line = reader.readLine()) != null) {
            player[j] = new Football();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    player[j].setSurname(data);
                else if (index == 1)
                    player[j].setRole(data);
                else if (index == 2)
                    player[j].setYear(data);
                else if (index == 3)
                    player[j].setSum_game(data);
                else if (index == 4)
                    player[j].setSum_goal(data);
                else
                    System.out.println("null" + data);
                index++;
            }
            j++;
            index = 0;
        }

        for (int n = 0; n<j; n++){
            int goal = 0;
            String[] sum_goal =  player[0].sum_goal.split("(?<=\\G.{8})");
            for (int i = 0; i < sum_goal.length; i++) {
                int count = Integer.parseInt(sum_goal[i], 2);
                String str = new Character((char)count).toString();
                goal = Integer.parseInt(str);
            }
            if(goal >= 5)player[n].player();
        }
    }



    public static void medium()throws IOException {
        System.out.println("\n\nСредний уровень:");
        ArrayList <Integer> dano = new ArrayList<Integer>();
        dano.add(5);
        dano.add(-99);
        dano.add(3);
        dano.add(-9);
        dano.add(1);


        try {
            FileOutputStream medium = new FileOutputStream("medium.txt");
            System.out.print("Числа до изменения файла: ");
            for(int i : dano) {
                System.out.print(i +" ");
                medium.write((i + " ").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream medium = new FileOutputStream("medium_result.txt");
            for(int i : dano) {
                medium.write((i + " ").getBytes());
            }
            medium.write(("\n").getBytes());

            System.out.print("\nЧисла после изменения файла: ");
            for (int i : dano){
                i *= -1;
                System.out.print(i +" ");
                medium.write((i + " ").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static class Subject {
        private String name;
        private String semester;
        private String course;
        private String name_binary;
        private String semester_binary;
        private String course_binary;

        public String getName() {
            return name;
        }
        public String getName_binary() {
            return name_binary;
        }
        public void setName(String name) {
            this.name = name;
            this.name_binary = name;
        }
        public String getSemester() {
            return semester;
        }
        public String getSemester_binary() {
            return semester_binary;
        }
        public void setSemester(String semester) {
            this.semester = semester;
            this.semester_binary = semester;
        }
        public void setSemester_binary(String semester) {
            this.semester_binary = semester;
        }
        public String getCourse() {
            return course;
        }
        public String getCourse_binary() {
            return course_binary;
        }
        public void setCourse(String course) {
            this.course = course;
            this.course_binary = course;
        }
        public void setCourse_binary(String course) {
            this.course_binary = course;
        }

        public void translate(){
            String[] name = getName().split("(?<=\\G.{8})");
            String[] semester = getSemester().split("(?<=\\G.{8})");
            String[] course = getCourse().split("(?<=\\G.{8})");
            String [] Name = new String[name.length];
            String [] Semester = new String[semester.length];
            String [] Course = new String[course.length];
            for (int i = 0; i < name.length; i++) {
                int count = Integer.parseInt(name[i], 2);
                Name[i] = new Character((char)count).toString();
            }
            for (int i = 0; i < semester.length; i++) {
                int count = Integer.parseInt(semester[i], 2);
                Semester[i] = new Character((char)count).toString();
            }
            for (int i = 0; i < course.length; i++) {
                int count = Integer.parseInt(course[i], 2);
                Course[i] = new Character((char)count).toString();
            }

            this.name = String.join("", Name);
            this.semester = String.join("", Semester);
            this.course = String.join("", Course);
        }
        public void subject(){
            System.out.print("\n\nНазвание дисциплины: ");
            System.out.print(this.name);
            System.out.print("\nСеместр: ");
            System.out.print(this.semester);
            System.out.print("\nКурс: ");
            System.out.print(this.course);
        }
    }

    public static void hard()throws IOException{
        System.out.println("\n\nВысокий уровень:");
        BufferedReader reader = new BufferedReader(new FileReader("hard.txt"));
        ArrayList<String> list = null;
        String line = null;
        Scanner scanner = null;
        int index = 0;
        int j = 0;

        Subject[] subject  = new Subject[3];

        while ((line = reader.readLine()) != null) {
            subject[j] = new Subject();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    subject[j].setName(data);
                else if (index == 1)
                    subject[j].setSemester(data);
                else if (index == 2)
                    subject[j].setCourse(data);
                else
                    System.out.println("null" + data);
                index++;
            }
            j++;
            index = 0;
        }
        System.out.print("Исходный файл:");
        for(int i = 0; i < j; i++ ){
            subject[i].translate();
            subject[i].subject();
        }

        System.out.print("\n\nРезультат:");
        for(int i = 0; i < j; i++ ) {
            if(subject[i].getName().equals("Programming_technology")){
                subject[i].setSemester("1");
                subject[i].setCourse("3");
                subject[i].setSemester_binary("110001");
                subject[i].setCourse_binary("110011");
            }
            subject[i].subject();
        }
        try {
            FileOutputStream hard_new = new FileOutputStream("hard_new.txt");
            for(int i = 0; i < j; i++ ) {
                hard_new.write((subject[i].getName_binary()+";"+subject[i].getSemester_binary()+";"+subject[i].getCourse_binary()+";\n").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}


