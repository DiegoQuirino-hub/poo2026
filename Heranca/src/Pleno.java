public class Pleno extends Desenvolvedor{
    private int projEntr;

    public Pleno() {
        super();
    }

    public Pleno(int projEntr, String nome, String linguagem, float salarioBase){
        super(nome,linguagem,salarioBase);
        this.projEntr = projEntr;
    }

    public int getProjEntr() {
        return projEntr;
    }

    public void setProjEntr(int projEntr) {
        this.projEntr = projEntr;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projEntr=" + projEntr +
                '}';
    }
}
