public class TestaDrone {
    public static void main(String[] args) {

        Drone drone = new Drone("DR-001");
        drone.setBateria(85);

        System.out.println("TENTANDO DECOLAR");
        drone.decolar();

        System.out.println("MANOBRAS\n");
        drone.subir(30);
        drone.subir(100);
        drone.descer(10);
    }
}
