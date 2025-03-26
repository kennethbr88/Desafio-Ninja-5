public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String titular, int numero, String tipo, double saldo, double valor, TipoConta tipoConta) {
        super(titular, String.valueOf(numero), tipo, saldo, valor, tipoConta);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Titular: " + titular + ", Tipo da conta: " + TipoConta.ContaCorrente);
        System.out.println("Saldo da conta corrente: RS " + (saldo + valor));
    }

    @Override
    public void depositar() {
        System.out.println("O seu depósito foi de: R$ " + valor);
    }
}
