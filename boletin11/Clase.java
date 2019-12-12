
package boletin11;


public class Clase {
private int valorPrimari;
    private int valorSecundari;

    public Clase() {
        valorPrimari = 5;
        valorSecundari = 10;
    }

    public Clase(int vpn) {
        valorPrimari = vpn;
        valorSecundari = 10;
    }

    public Clase(int vpn, int vs) {
        valorPrimari = vpn;
        valorSecundari = vs;
    }

    public int getPrimari() {
        return valorPrimari;
    }

    public int getSecundari() {
        return valorSecundari;
    }
}
