package com.company;

public class MojaNit extends Thread{
    private int id;
    Semafor semafor =null;

    private static  int brojIteracija;
    static volatile int counter = 0;

    public MojaNit(int id, Semafor semafor, int brojIteracija) {
        this.id = id;
        this.semafor = semafor;
        MojaNit.brojIteracija = brojIteracija;
    }
    @Override
    public void run() {
       for(int i = 0; i<brojIteracija;i++){
           semafor.waits();
           counter++;
           System.out.println("This "+ this.id +  " se nalazi u kriticnoj");
           semafor.signalS();
       }
    }




}
