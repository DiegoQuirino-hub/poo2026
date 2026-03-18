import java.util.ArrayList;
import java.util.Date;

public class CarrinhoCompra {
    private int id;
    private Date data;
    private Cliente cliente; //cliente dentro do carrinho
    private ArrayList<ItemCarrinho> itensCarrinho;

    public CarrinhoCompra() {
        this.itensCarrinho = new ArrayList<>();
    }

    // esse construtor caracteriza uma agregação
    // motivo: cliente já veio criado, é independente
    public CarrinhoCompra(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itensCarrinho = new ArrayList<>();
    }
    //adicionar itens do carrinho no carrinho
    public void adicionaItemCarrinho(int id, float qtde, Produto produto){
        ItemCarrinho aux = new ItemCarrinho(id,qtde,produto);
        this.itensCarrinho.add(aux);
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }
    //é agregação - cliente já veio criado, é independente.
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void calculaTotalCOmpra(){

        }
    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=\n" + cliente +
                ", itens do carrinho=\n" + itensCarrinho +
                '}';
    }
}
