public class Analista extends Funcionario{
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Analista(int id, String nome, double salario, String area) {
        super(id, nome, salario);
        this.area = area;
    }

    public Analista(){}

    public Analista(String area) {
        this.area = area;
    }

    public void analisar(){

    }


}
