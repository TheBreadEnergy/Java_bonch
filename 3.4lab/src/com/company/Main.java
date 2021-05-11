package com.company;

public class Main {

    public static void easy() {
        System.out.println("Базовый уровень:");
        double y;
        for (double x = 1; x<=3; x+=0.2){
            y = Math.log(Math.pow(x,2)) - (1.8 * Math.sin(x));
            System.out.println("x = " + x +"\t y = " + y);
        }
    }

    public static void medium() {
        System.out.println("\n\nСредний уровень:");
        double y = 0;
        for (double x = -1; x<=15; x+=0.2){
            if(x>3.8) y = 5*x*Math.log(Math.abs(1+x));
            if(x<2.8) y = - Math.sin(x);
            if((x<=2.8)&&(x>=3.8)) y = Math.pow(Math.exp(x), (Math.pow(-x,2)+2));
            System.out.println("x = " + x +"\t y = " + y);
        }
    }


    public static void hard(){
        System.out.println("\n\nВысокий уровень:");
        double u = 0;
        for (double x = 1; x<=2; x+=0.1){
            if(x<=2) u=(Math.pow(x,2)-7*x+3)/(x-Math.pow(Math.exp(x),x));
            if(x>2) u=Math.pow(Math.atan(x),2);
            System.out.println("f(x) = " + (Math.acos(0.5*Math.abs(Math.sin(u-3)))+3*x));
        }
    }

    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
        medium();
        hard();
    }
}
