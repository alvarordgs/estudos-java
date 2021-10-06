package aula06;

public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto controle1 = new ControleRemoto();

        controle1.ligar();
        controle1.menosVolume();
        controle1.menosVolume();
        controle1.pause();
        controle1.abrirMenu();
        controle1.fecharMenu();
    }
}
