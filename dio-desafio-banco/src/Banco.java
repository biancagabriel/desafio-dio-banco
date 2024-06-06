
public class Banco {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.imprimirDadosCliente();
        cc.imprimirExtrato();
        cc.depositar(100);
        cc.imprimirExtrato();

        Conta cp = new ContaPoupanca();
        cp.imprimirDadosCliente();
        cc.transferir(cp,50);


        cp.imprimirExtrato();
    }
}
