package aula10;

public class Aluno extends Pessoa{
    //Atributos
    private boolean matr;
    private String curso;

    //Método principal
    public void cancelarMatr() {

    }

    //Métodos especiais

    public boolean isMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
