package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int N = 1000;
        int brojacIteracija = 30;
        Semafor sen1 = new Semafor(1);
        MojaNit[] niti = new MojaNit[N];
        for(int i =0; i<niti.length;i++){
            niti[i] = new MojaNit(i,sen1,brojacIteracija);
            niti[i].start();
        }
        for (int i = 0; i<niti.length;i++){
            try {
                niti[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" Borojac "+ MojaNit.counter);
    }
}
