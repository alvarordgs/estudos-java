package banco;

public class Banco {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();

        conta.setDono("Carlos");
        conta.setNumConta(666);
        conta.abrirConta("CC");
        conta.depositar(15000);
        conta.pagarMensalidade();
        conta.sacar(15038);
        conta.fecharConta();
        conta.statusConta();
    }
}
