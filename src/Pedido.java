import java.util.Date;

public class Pedido {
    private int numero;
    private Date data;
    private int id;
    private int id_cliente;

    public Pedido(int numero, Date data, int id, int id_cliente) {
        this.numero = numero;
        this.data = data;
        this.id = id;
        this.id_cliente = id_cliente;
    }

    public Pedido(){}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void calcularTotal(){

    }
}
