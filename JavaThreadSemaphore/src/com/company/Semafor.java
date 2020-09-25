package com.company;

public class Semafor {
    private int s; // broj licenci

    public Semafor() {
    }

    public Semafor(int s) {
        this.s = s;
    }
    public synchronized void waits(){
    while (s<=0){
        // mora da ceka nema slobodnih licenci
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // ovde smo pronasli licencu
    s--;

    }
    public  synchronized void signalS(){
        s++;
        notify();
    }
}