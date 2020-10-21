package es.centroafuera.psp.ejemplosJava;

public class Hilo1 extends Thread {

    private int tiempoEspera;
    private int num;

    public Hilo1(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public int getNum() {
        return num;
    }

    @Override
    public void run() {
        try {
            sleep(tiempoEspera*1000);
            num = (int) (Math.random() * (21-4)) + 4;

            System.out.println("Número aleatorio: " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
