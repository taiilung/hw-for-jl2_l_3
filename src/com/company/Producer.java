package com.company;

public class Producer extends Thread {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run(){
        for (int i=1; i<=5; i++){
            store.put();
        }
    }
}
