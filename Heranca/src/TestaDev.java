public class TestaDev {
    public static void exibeDados(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calculaBonus());
    }
    static void main(String[] args) {
        Junior jr = new Junior("Fulano","Beltrano","Java",4000);
        jr.codar();
        System.out.println(jr.toString()+ " Bônus " + jr.calculaBonus());

        Pleno pl = new Pleno(8,"Beltrano","Java",6000);
        pl.codar();
        System.out.println(pl.toString() + " Bônus " + pl.calculaBonus());

        Senior sr = new Senior(30000,"Ciclano","Java",9000);
        sr.codar();
        System.out.println(sr.toString() + "Bônus " + sr.calculaBonus());
    }
}
