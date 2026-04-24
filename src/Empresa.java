public class Empresa {
    private String nome;
    private String cnpj;
    private int id;

    public Empresa(String nome, String cnpj, int id) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.id = id;
    }

    public Empresa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void contratar(){

    }
}
