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

      static class XY_child extends XY{
          private double r;
          public XY_child(double x, double y, double r) {
              super(x, y);
              this.r = r;
          }

          public double getR(){return r;}
          public void check(){
              if(solution()<r) System.out.println("Точка внутри окружности");
              else System.out.println("Точка вне окружности");
          }
      }

    public static void easy(){
        System.out.println("Базовый уровень:");
        XY_child point = new XY_child(6,8, 12);
        System.out.println("X = "+point.getX());
        System.out.println("Y = "+point.getY());
        System.out.println("Радиус окружности равен = "+point.getR());
        System.out.println("Расстояние от точки до начала координат = "+point.solution());
        point.check();
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

    public static class ABCD_child extends ABCD{
        private double x;
        public ABCD_child(int a, int b, int c, int d, double x) {
            super(a, b, c, d);
            this.x = x;
        }

        public double getX() {
            return x;
        }

        public void setX(int d) {
            this.x = x;
        }

        public double sum_kv_raz(){
            double sum = 0;
            double [] num ={getA(), getB(), getC(), getD(), x};

            for (int i = 0; i < num.length; i++){
                sum -=Math.pow(num[i], 2);
            }
            return sum;
        }

    }

    public static void medium() {
        System.out.println("\n\nСредний уровень:");
        ABCD_child num = new ABCD_child(1,3,2,5, 7);
        System.out.println("a = "+num.getA());
        System.out.println("b = "+num.getB());
        System.out.println("c = "+num.getC());
        System.out.println("d = "+num.getD());
        System.out.println("x = "+num.getX());
        System.out.println("Sum = "+num.sum_kv_raz());

    }

    public static void main(String[] args){
        System.out.println("Вариант №23");
        easy();
        medium();
    }
}


