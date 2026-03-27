package Ex06EdificiosApartamentos;

import java.util.ArrayList;

public class Apartamentos {
    private int numero;
    private int andar;

    public Apartamentos() {
    }

    public Apartamentos(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public int getAndar() {
        return andar;
    }

    @Override
    public String toString() {
        return "Apto " + numero + " (Andar " + andar + ")";
    }
}
