public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(int id, String nome, double salario, double bonus) {
        super(id, nome, salario);
        this.bonus = bonus;
    }

    public Gerente(double bonus) {
        this.bonus = bonus;
    }

    public Gerente(){}

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularBonus(){
        return bonus;
    }
}
