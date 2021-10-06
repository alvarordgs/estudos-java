package aula07;

import java.util.Random;

public class Luta {

    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        //verifica se os dois lutadore sao de categorias diferentes e se nao sao a mesma pessoa para poder lutar
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("-------------------------------------");
            System.out.println("A grande luta está marcada entre " + this.getDesafiado().getNome() + " e " + this.getDesafiante().getNome() + "!");
            System.out.println("-------------------------------------");
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("-------------------------------------");
            System.out.println("A luta nao foi aprovada!!! Tente marcar outra luta!");
            System.out.println("-------------------------------------");
        }
    }

    public void lutar() {
        if(this.isAprovada()) {

            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();


            //instanciar um gerador de numeros randomicos
            Random gerador = new Random();

            //gera um numero aletario entre 0 e 2
            int vencedor = gerador.nextInt(3);

            System.out.println("============ RESULTADO DA LUTA ===================");

            switch (vencedor) {
                case 0: //EMPATE
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //DESAFIADO VENCE
                    System.out.println(this.desafiado.getNome() + " é o grande vencedor da noite!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //DESAFIANTE VENCE
                    System.out.println(this.desafiante.getNome() + " é o grande vencedor da noite!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("================================");
        }else {
            System.out.println("Essa luta não pode acontecer!");
        }
    }

    //Métodos especiais
    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador df) {
        this.desafiante = df;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int r) {
        this.rounds = r;
    }

    public boolean isAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean ap) {
        this.aprovada = ap;
    }
}
