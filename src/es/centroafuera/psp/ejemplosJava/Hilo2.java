package es.centroafuera.psp.ejemplosJava;

import java.sql.Timestamp;

public class Hilo2 extends Thread {

    ClasePrincipal cp;
    public int rep;

    public Hilo2(ClasePrincipal cp, int rep) {
        this.cp = cp;
        this.rep = rep;
    }

    @Override
    public void run() {
        try {
            Timestamp t1 = new Timestamp(System.currentTimeMillis());

            for (int i = 0; i < rep; i++) {
                sleep(2000);
            }

            Timestamp t2 = new Timestamp(System.currentTimeMillis());

            long tiempoTotal = (t2.getTime() - t1.getTime());
            cp.callback(rep, tiempoTotal);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

