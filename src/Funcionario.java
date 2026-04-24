public class  Funcionario extends Departamento {
    private int id;
    private String nome;
    private double salario;
    private int id_empresa;


    public Funcionario(int id, String nome, double salario, int id_empresa) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.id_empresa = id_empresa;
    }

    public Funcionario() {}

    public Funcionario(int id, String nome, double salario) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String calcularSalario(){
        return "seu salario é: " + salario;
    }
}
