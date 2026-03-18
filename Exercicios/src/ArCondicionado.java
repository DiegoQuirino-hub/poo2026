public class ArCondicionado {

    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
        this.temperatura = 22;
        this.ligado = false;
    }

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;
    }

    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
            System.out.println("✓ Temperatura ajustada para: " + t + "°C");
        } else {
            System.out.println("✗ Temperatura fora da faixa! Aceito apenas entre 16 e 30°C");
        }
    }

    public void setMarca(String m) {
        if (m != null && m.length() >= 3) {
            this.marca = m;
            System.out.println("✓ Marca definida: " + m);
        } else {
            System.out.println("✗ Marca inválida! Mínimo de 3 caracteres");
            this.marca = "Desconhecida";  // Valor padrão se falhar
        }
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isLigado() {
        return ligado;
    }

    private boolean verificarCompressor() {
        double numeroAleatorio = Math.random();  //
        System.out.println("Verificando compressor... (valor: " + numeroAleatorio + ")");

        if (numeroAleatorio > 0.2) {
            System.out.println("Compressor OK!");
            return true;
        } else {
            System.out.println("Falha técnica no compressor!");
            return false;
        }
    }

    public void ativarModoTurbo() {
        System.out.println("Ativando Modo Turbo\n");

        if (verificarCompressor()) {
            setTemperatura(16);
            this.ligado = true;
            System.out.println("Modo Turbo ativado com sucesso");
        } else {
            System.out.println("Não foi possível ativar o Modo Turbo. Compressor com falha.");
        }
    }

    @Override
    public String toString() {
        String status = ligado ? "LIGADO" : "DESLIGADO";
        return "\n========== AR-CONDICIONADO ==========\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Temperatura: " + temperatura + "°C\n" +
                "Status: " + status + "\n" +
                "====================================";
    }
}