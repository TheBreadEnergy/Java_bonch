package com.company;

public class Main {

    public static class tov {
        private String name;
        private String prod;
        private int year;
        private int sum;
        private int price;
        public tov(String name,String prod,int year,int sum,int price) {
            this.name = name;
            this.prod = prod;
            this.year = year;
            this.sum = sum;
            this.price = price;
        }
    }

    public static void easy() {
        System.out.println("Базовый уровень:");
        tov t1 = new tov("iPhone 11", "Apple", 2020, 2000, 100000);
        tov t2 = new tov("Samsung Galaxy S20", "Samsung", 2020, 1500, 80000);

        System.out.println("Товар #1");
        System.out.println("Наименование: "+t1.name);
        System.out.println("Изготовитель: "+t1.prod);
        System.out.println("Год выпуска: "+t1.year+"г.");
        System.out.println("Количество: "+t1.sum+"шт.");
        System.out.println("Цена: "+t1.price+"руб.");
        System.out.println("Общая стоимость: " +(t1.sum*t1.price)+"руб.\n");

        System.out.println("Товар #2");
        System.out.println("Наименование: "+t2.name);
        System.out.println("Изготовитель: "+t2.prod);
        System.out.println("Год выпуска: "+t2.year+"г.");
        System.out.println("Количество: "+t2.sum+"шт.");
        System.out.println("Цена: "+t2.price+"руб.");
        System.out.println("Общая стоимость: "+(t2.sum*t2.price)+"руб.\n");

        System.out.println("Общая стоимость всех товаров выпущенных в этом году: " +(t1.sum*t1.price+t2.sum*t2.price)+"руб.");

    }



    public static void main(String[] args) {
        System.out.println("Вариант №23");
        easy();
    }
}

