package aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Alvaro", 23, "Masculino");
        p[1] = new Pessoa("Fernanda", 20, "Feminino");

        l[0] = new Livro("A piada mortal", "GG John", 150, p[0]);
        l[1] = new Livro("Quem é você Alaska?", "J. J. Foling", 200, p[1]);
        l[2] = new Livro("Harry Potter e a ordem da fênix", "J. J. K. Roling", 350, p[1]);

        l[0].abrir();
        l[0].folhear(150);
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
