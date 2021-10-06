package banco;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t) {

        //recebe o tipo da conta
        this.setTipo(t);

        //muda o status da conta para verdadeiro porque a conta esta sendo aberta
        this.setStatus(true);

        //verifica qual o tipo da conta
        if( "CC".equals(t)) {
            this.setSaldo(50);
        } else if( "CP".equals(t) ) {
            this.setSaldo(150);
        }

        System.out.println("Conta aberta! Parabens você ganhou " + this.getSaldo());
    }

    public void fecharConta() {
        if( this.getSaldo() < 0 ) {
            System.out.println("ERRO! Saldo negativo, por favor quite seus débitos antes de fechar a conta.");
        } else if ( this.getSaldo() > 0 ) {
            System.out.println("ERRO! Saque o dinheiro disponível na conta para encerrar.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada! Lamentamos ter chegado a esse ponto )`:");
        }
    }

    public void depositar(float deposito) {
        if( this.getStatus() ) {
            this.setSaldo(getSaldo() + deposito);
            System.out.println("Deposito de R$ " + deposito + " realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("ERRO! Impossível depositar, é necessário abrir uma conta antes de fazer um depósito.");
        }
    }

    public void sacar(float saque) {
        if( this.getStatus() ) {
            if ( this.getSaldo() >= saque ) {
                this.setSaldo(getSaldo() - saque);
                System.out.println("Saque de R$ " + saque + " realizado! Saldo atual: R$ " + this.getSaldo() );
            } else {
                System.out.println("Impossível sacar, saldo insuficiente!");
            }
        } else System.out.println("Impossível sacar, é necessário abrir uma conta antes de fazer um saque.");
    }

    public void pagarMensalidade() {

        float vlMensalidade = 0;

        if( "CC".equals(this.getTipo()) ) vlMensalidade = 12;
        else if( "CP".equals(this.getTipo()) ) vlMensalidade = 20;

        if( this.getStatus() ) {
            if( this.getSaldo() > vlMensalidade) {
                this.setSaldo(getSaldo() - vlMensalidade);
                System.out.println("Mensalidade paga com sucesso! ");
            } else {
                System.out.println("ERRO! Saldo insuficiente!");
            }
        } else {
            System.out.println("ERRO! Não existe conta!");
        }

    }

    public void statusConta() {
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
