public class Junior extends Desenvolvedor{
    private String mentor;

    public Junior(){
        super();
    }
    public Junior(String mentor, String nome, String linguagem, float salarioBase){
        super(nome,linguagem,salarioBase);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }
    public void codar(){
        System.out.println("Junior codando");
    }
    @Override
    public String toString() {
        return "Junior{" +
                super.toString() +
                "mentor='" + mentor + '\'' +
                '}';
    }
}
