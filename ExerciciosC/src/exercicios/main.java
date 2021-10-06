package exercicios;

public class main {
    public static void main(String[] args) {
        /*
        Exercicio 02 / Lista 7B
        int aux = 1;
        int cont = 1;
        int num = 0;

        while(cont <= 100) {

            while(aux <= cont){
                num += cont;
                System.out.print(num + " ");
                aux++;
            }
            System.out.println("");

            num = 0;
            aux = 1;
            cont++;*/

        float num = 1;
        float den = 1;
        int pot = 1;
        int sinal = 1;
        int aux = 1;
        int aux2 = 2;
        float soma = 0;
        float res = 1;

        while(num <= 3) {

            while(aux <= pot) {
                res *= num;
                aux++;
            }

            if(aux2 <= 2) {
                soma = (res / den) * sinal;
                aux2++;
            } else {
                sinal *= -1;
                aux2 = 1;
            }

            num++;
            den *= 3;
            aux = 1;
        }

        System.out.println(soma);


    }
}
