public class ItensPedido {
    private String produto;
    private int quantidade;
    private double preco;
    private int id_pedido;
    private int id;

    public ItensPedido(String produto, int quantidade, double preco, int id_pedido, int id) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.id_pedido = id_pedido;
        this.id = id;
    }

    public ItensPedido(){
    }

    public void calcularSubtotal(){

    }
}