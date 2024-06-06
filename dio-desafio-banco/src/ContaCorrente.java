public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== extrato conta corrente ===");
        super.imprimirSaldo();
    }

    @Override
    public void imprimirDadosCliente(Conta nome) {
        System.out.println("=== Dados Cliente ===");
        super.imprimirDadosCliente();
    }

}
