public class Drone {

    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone(String codigo) {
        this.codigo = codigo;
        this.altura = 0;
        this.emVoo = false;
    }

    public void setAltura(float a) {
        if (a >= 0 && a <= 120) {
            this.altura = a;
        } else {
            System.out.println("Altura inválida.");
        }
    }

    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {
            this.bateria = b;
        } else {
            System.out.println("Bateria inválida! Deve estar entre 0 e 100.");
        }
    }

    public float getAltura() { return altura; }
    public int getBateria()  { return bateria; }
    public boolean isEmVoo() { return emVoo;   }
    public String getCodigo(){ return codigo;  }

    private boolean testarMotores() {
        System.out.println("Testando hélices");
        System.out.println("Calibrando GPS");

        int resultado = (int) (Math.random() * 10);

        if (resultado < 8) {
            System.out.println("Motores prontos!");
            return true;
        } else {
            System.out.println("Falha nos motores. Tente novamente.");
            return false;
        }
    }

    public void decolar() {
        if (emVoo) {
            System.out.println("O drone já está em voo");
            return;
        }
        if (bateria <= 20) {
            System.out.println("Bateria baixa. Carregue acima de 20%.");
            return;
        }

        System.out.println("Iniciando checklist de decolagem.");
        boolean motorOk = testarMotores();

        if (motorOk) {
            emVoo = true;
            setAltura(2);
            System.out.println("Drone [" + codigo + "] decolou. Altura: " + altura + "m");
        }
    }

    public void subir(float x) {
        if (!emVoo) {
            System.out.println("Decole primeiro!");
            return;
        }
        System.out.println("Subindo " + x + "m...");
        setAltura(this.altura + x);
        System.out.println("Altura atual: " + altura + "m");
    }

    public void descer(float x) {
        if (!emVoo) {
            System.out.println("Decole primeiro!");
            return;
        }
        System.out.println("Descendo " + x + "m...");
        setAltura(this.altura - x);
        System.out.println("Altura atual: " + altura + "m");
    }
}
