package aula07;

public class Lutador implements ControladorLutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos especiais
    //Construct
    public Lutador(String nome, String nac, int id, float alt, float peso, int vit, int der, int emp) {
        this.setNome(nome);
        this.setNacionalidade(nac);
        this.setIdade(id);
        this.setAltura(alt);
        this.setPeso(peso);
        this.setVitorias(vit);
        this.setDerrotas(der);
        this.setEmpates(emp);
    }

    //Métodos acessores
    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nac) {
        this.nacionalidade = nac;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso <= 60)
            this.categoria = "Invalido";
        else if(this.peso <= 75)
            this.categoria = "Leve";
        else if(this.peso <= 85)
            this.categoria = "Medio";
        else if(this.peso <= 120)
            this.categoria = "Pesado";
        else
            this.categoria = "Invalido";
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Metodos abstratos
    @Override
    public void apresentar() {
        System.out.println("-------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + getNome());
        System.out.println("Diretamente de " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + getPeso() + " kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
        System.out.println("-------------------------------------");
    }

    @Override
    public void status() {
        System.out.println("-------------------------------------");
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
        System.out.println("-------------------------------------");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }
}
