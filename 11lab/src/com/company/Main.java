package com.company;

public class Main {

    public static class XY{
        private double x;
        private double y;

        public XY(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }
        public void setX(double x) {
            this.x = x;
        }
        public double getY() {
            return y;
        }
        public void setY(double y) {
            this.y = y;
        }
        public double solution(){
            return (Math.sqrt(Math.pow((0-x),2)+Math.pow((0-y),2)));
        }
    }

    public static void easy(){
        System.out.println("Базовый уровень:");
        XY point = new XY(6,8);
        System.out.println("X = "+point.getX());
        System.out.println("Y = "+point.getY());
        System.out.println("Расстояние от точки до начала координат = "+point.solution());
    }

    public static class ABCD{
        private int a;
        private int b;
        private int c;
        private int d;

        public ABCD(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }

        public int getD() {
            return d;
        }

        public void setD(int d) {
            this.d = d;
        }

        public double SredArif(){
            return ((a+b+c+d)/4);
        }

        public int MaxNum(){
            int max = a;
            if(max < b) max = b;
            if(max < c) max = c;
            if(max < d) max = d;
            return max;
        }

    }

    public static void medium() {
        System.out.println("\n\nСредний уровень:");
        ABCD num = new ABCD(1,3,2,5);
        System.out.println("a = "+num.getA());
        System.out.println("b = "+num.getB());
        System.out.println("c = "+num.getC());
        System.out.println("d = "+num.getD());
        System.out.println("Среднее арифметическое = "+num.SredArif());
        System.out.println("Максимум из чисел = "+num.MaxNum());
    }

    public static void main(String[] args){
        System.out.println("Вариант №23");
        easy();
        medium();
    }
}


