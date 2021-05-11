package com.company;

public class Main {

    public static class easy_1lvl{
        private String surname;
        private double score;
        private int course;

        public easy_1lvl(String surname, double score, int course){
            this.surname = surname;
            this.score = score;
            this.course = course;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public double Q(){
            return (0.2*this.score*this.course);
        }
    }

    public static class easy_2lvl extends easy_1lvl{
        private boolean P;

        public easy_2lvl(String surname, double score, int course, boolean P) {
            super(surname, score, course);
            this.P = P;
        }

        public boolean isP() {
            return P;
        }


        public double Qp(){
            if (P==true) return (2*Q());
            else return (0.9*Q());
        }

    }

    private static void easy(){
        System.out.println("Базовый уровень:");
        easy_2lvl student = new easy_2lvl("Чугуненко", 4,3, true);
        System.out.println("Фамилия: "+student.getSurname());
        System.out.println("Средний балл: "+student.getScore());
        System.out.println("Курс: "+student.getCourse());
        System.out.println("Изучает дисциплины на английском языке: "+student.isP());
        System.out.println("Q = "+student.Q());
        System.out.println("Qp = "+student.Qp());
    }

    public static class Computer{
        private int cpu;
        private int cpu_core;
        private int memory;
        private int hdd;

        public Computer(int cpu, int cpu_core, int memory, int hdd){
            this.cpu = cpu;
            this.cpu_core = cpu_core;
            this.memory = memory;
            this.hdd = hdd;
        }

        public int getCpu() {
            return cpu;
        }

        public void setCpu(int cpu) {
            this.cpu = cpu;
        }

        public int getCpu_core() {
            return cpu_core;
        }

        public void setCpu_core(int cpu_core) {
            this.cpu_core = cpu_core;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public int getHdd() {
            return hdd;
        }

        public void setHdd(int hdd) {
            this.hdd = hdd;
        }

        public int price(){
            return (cpu*cpu_core/100+memory/80+hdd/20);
        }
        public boolean suitability(){
            if(cpu>=2000 && cpu_core>=2 && memory>=2048 && hdd>=320) return true;
            else return false;
        }
        public String inf(){
            return "Частота процессора: "+cpu+"\nКоличество ядер: "+cpu_core+"\nОбъём памяти: "+memory
                    +"\nОбъём жесткого диска: "+hdd;
        }
    }

    public static class Notebook extends Computer{
        private int autonomy;

        public Notebook(int cpu, int cpu_core, int memory, int hdd, int autonomy) {
            super(cpu, cpu_core, memory, hdd);
            this.autonomy = autonomy;
        }

        public int getAutonomy() {
            return autonomy;
        }

        public void setAutonomy(int autonomy) {
            this.autonomy = autonomy;
        }

        public int priceN(){
            return (price()+autonomy/10);
        }

        public String infN(){
            return (inf()+"\nАвтономность: "+autonomy);
        }
    }

    private static void medium(){
        System.out.println("\n\nСредний уровень:");
        System.out.println("Мой компьютер");
        Computer my = new Computer(3700, 6, 16384, 1000);
        System.out.println("------Стоимость------");
        System.out.println("Цена: " + my.price());
        System.out.println("------Пригодность------");
        System.out.println("Пригоден: "+my.suitability());
        System.out.println("------Информация------");
        System.out.println(my.inf());
        System.out.println("\nМой ноутбук");
        Notebook myN = new Notebook(2300, 6, 8096, 500, 6);
        System.out.println("------Стоимость------");
        System.out.println("Цена: " + myN.priceN());
        System.out.println("------Пригодность------");
        System.out.println("Пригоден: "+myN.suitability());
        System.out.println("------Информация------");
        System.out.println(myN.infN());
    }

    public static class simple{
        private String surname;
        private String name;
        private String midname;
        private int visits;
        private int category;

        public simple(String surname, String name, String midname, int visits) {
            this.surname = surname;
            this.name = name;
            this.midname = midname;
            this.visits = visits;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMidname() {
            return midname;
        }

        public void setMidname(String midname) {
            this.midname = midname;
        }

        public int getVisits() {
            return visits;
        }

        public void setVisits(int visits) {
            this.visits = visits;
        }

        public boolean passed(){
            if(visits==20)return true;
            else if(visits>10 && Math.random()*9 >=4) return true;
            else return false;
        }
    }

    public static class smart extends simple{
        public smart(String surname, String name, String midname, int visits) {
            super(surname, name, midname, visits);
        }

        public boolean passed(){
            if(getVisits()==20)return true;
            else if(getVisits()>10 && Math.random()*9 >=6) return true;
            else return false;
        }
    }

    public static class genius extends smart{

        public genius(String surname, String name, String midname, int visits) {
            super(surname, name, midname, visits);
        }

        public boolean passed(){
            if(getVisits()>=1) return true;
            else return false;
        }
    }

    private static void hard(){
        System.out.println("\n\nВысокий уровень:");
        simple [] student = new simple[10];
        student[0] = new simple("Иванов", "Иван", "Иванович", 20);
        student[1] = new simple("Смиронов", "Иван", "Николаевич", 15);
        student[2] = new simple("Сидоров", "Сергей", "Васильевич", 18);
        student[3] = new simple("Иванов", "Михаил", "Романов", 11);
        student[4] = new simple("Боднарчук", "Андрей", "Иванович", 19);
        student[5] = new smart("Петров", "Жора", "Максимович", 13);
        student[6] = new smart("Петров", "Роман", "Иванович", 2);
        student[7] = new smart("Петров", "Алексей", "Юрьевич", 14);
        student[8] = new smart("Шастун", "Николай", "Иванович", 13);
        student[9] = new genius("Чугуненко", "Александр", "Сергеевич", 1);

        for (int i = 0; i < student.length; i++){
            System.out.println(student[i].getSurname()+" "+student[i].getName()+" "+ student[i].getMidname()+" Зачёт сдан: "+student[i].passed());
        }
    }


    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}
