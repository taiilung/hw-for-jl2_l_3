package com.company;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store, producer);
        producer.start();
        try {
            producer.join();
        }
        catch (InterruptedException e){}
        consumer.start();
        try{
            consumer.join();
        }
        catch (InterruptedException e){}
        System.out.println("Главный поток закончил свою операцию");
    }
}
