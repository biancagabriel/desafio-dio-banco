public class ContaPoupanca extends Conta {


    @Override
    public void imprimirExtrato() {
        System.out.println("=== extrato conta poupança ===");
        super.imprimirSaldo();
    }

    @Override
    public void imprimirDadosCliente(Conta nome) {

    }


}
