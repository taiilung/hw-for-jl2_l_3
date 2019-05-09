package com.company;

public class Consumer extends Thread {
    private Store store;
    private Producer producer;

    public Consumer(Store store, Producer producer) {
        this.store = store;
        this.producer = producer;
    }

    public void run(){
        for (int i=1; i<=5; i++){
            store.get();
        }
        try{
         producer.join();
        }
        catch(InterruptedException e){}
    }

}
