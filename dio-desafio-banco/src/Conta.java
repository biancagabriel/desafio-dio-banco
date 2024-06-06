import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta{
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected String nome;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1 ;

    public Conta() {
        setNome("Bianca");
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo +=valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected  void imprimirDadosCliente(){
        System.out.println(nome);
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
    }

    protected void imprimirSaldo() {
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
