package aula09;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Métodos
    public void fazerAniversario() {
        this.idade++;
    }

    //Métodos especiais
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }
}
