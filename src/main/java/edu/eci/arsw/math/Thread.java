package edu.eci.arsw.math;

public class Thread {
    private int[] bandas = new int[2];

    public Thread ( int[] bandas){
        this.bandas = bandas;
    }

    public void run(){

        for(int i=bandas[0]; i<=bandas[1]; i++){
            System.out.println(i);
        }

        while (true) {
            try {
                wait(5000);   //Se detiene para los 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
