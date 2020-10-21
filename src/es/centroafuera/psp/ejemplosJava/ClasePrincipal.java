package es.centroafuera.psp.ejemplosJava;

public class ClasePrincipal  {

    public ClasePrincipal() throws InterruptedException {
        Hilo1 h1 = new Hilo1(4);
        h1.start();
        h1.join();

        Hilo2 h2 = new Hilo2(this, h1.getNum());
        h2.start();
    }

    public void callback(int rep, long tiempo){
        System.out.println("\nNúmero de veces que se ha ejecutado: " + rep + "\nTiempo que ha tardado: " + tiempo / 1000 + "sec.");
    }
}
