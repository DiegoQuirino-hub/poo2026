package Ex06EdificiosApartamentos;

public class TesteApartamentos{
public static void main(String[] args) {

    Edificio edificio = new Edificio("Edifício Panorama", "Rua das Flores, 123");

    edificio.construirApartamento(101, 1);
    edificio.construirApartamento(102, 1);
    edificio.construirApartamento(201, 2);
    edificio.construirApartamento(202, 2);
    edificio.construirApartamento(301, 3);

    edificio.listarApartamentos();
    }
}