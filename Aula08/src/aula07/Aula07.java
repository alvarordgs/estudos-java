package aula07;

import java.util.ArrayList;

public class Aula07 {
    public static void main(String[] args) {
        //declara um array de objetos
        Lutador lutador[] = new Lutador[6];

        /*ArrayList<Lutador> lut = new ArrayList<Lutador>();

        lut.add(new Lutador("Carlim delas", "Alemanha", 33, 1.95f, 80.5f, 55, 0, 3));*/

        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        lutador[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 67.8f, 14, 2, 3);
        lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lutador[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        lutador[4] = new Lutador("Ufocobol", "Brasil", 37, 1.7f, 119.3f, 5, 4, 3);
        lutador[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 110.7f, 12, 2, 4);

        //lutador[1].apresentar();
        //lutador[1].status();

        /*lut.get(0).status();*/

        //1º Luta
        Luta UEC01 = new Luta();

        UEC01.marcarLuta(lutador[4], lutador[5]);
        UEC01.lutar();
        lutador[4].status();
        lutador[5].status();
    }
}