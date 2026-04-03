public class Senior extends Desenvolvedor {
    private float verbaLider;

    public Senior(){
        super();
    }
    public Senior(float verbaLider, String nome, String linguagem, float salarioBase){
        super(nome,linguagem,salarioBase);
        this.verbaLider = verbaLider;
    }

    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }
    public void codar(){
        System.out.println("Senior define a arquitetura e lidera pessoas");
    }

    @Override
    public float calculoBonus;
    public String toString() {
        return "Senior{" +
                super.toString() +
                "verbaLider=" + verbaLider +
                '}';
    }
}
