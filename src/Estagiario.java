public class Estagiario extends Funcionario{
    private double bolsa;

    public Estagiario(int id, String nome, double salario, double bolsa) {
        super(id, nome, salario);
        this.bolsa = bolsa;
    }

    public Estagiario(double bolsa) {
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public void aprender(){

    }
}
