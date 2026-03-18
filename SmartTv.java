public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean internet;

    public SmartTv(String marca, String modelo, int volume, boolean internet){
        this.marca = marca;
        this.modelo = modelo;
        this.setVolume(volume);
        this.internet = internet;
    }

    public SmartTv() {

    }

    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        } else {
            System.out.println(" Volume inválido");
        }
    }

    public int getVolume(){
        return this.volume;
    }

    public void setMarca(String marca){
        if (marca.length() <= 30){
            this.marca = marca;
        }
    }
    public String getMarca(){
        return this.marca;
    }

    public String setModelo(String modelo){
        char letraInicial = modelo.charAt(0);
        boolean resp = Character.isUpperCase(letraInicial);

        if (resp){
            return this.modelo;
        }

    }
}
