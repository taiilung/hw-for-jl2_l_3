package com.company;

public class Store {
    private int product;

    public synchronized void get(){
        product--;
        System.out.println("Покупатель купил один товар");
        System.out.println("Товаров на складе: " + product);
    }

    public synchronized void put(){
        product++;
        System.out.println("Производитель произвел один товар");
        System.out.println("Товаров на складе: " + product);
    }
}
