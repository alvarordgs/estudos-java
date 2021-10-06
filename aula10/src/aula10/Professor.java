package aula10;

public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;

    //Método principal
    public void receberAum() {

    }

    //Métodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
