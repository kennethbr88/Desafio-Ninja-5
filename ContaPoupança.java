public class ContaPoupança extends ContaBancaria {


    public ContaPoupança(String titular, int numero, String tipo, double saldo, double valor, TipoConta tipoConta) {
        super(titular, String.valueOf(numero), tipo, saldo, valor, tipoConta);
    }

    @Override
    public void depositar() {
        System.out.println("Titular: " + titular + ", Tipo da conta: " + TipoConta.ContaPoupanca);
        System.out.println("depositando: " + valor);
        saldo = valor - (valor * 0.01);
    }

    @Override
    public void consultarSaldo(){
        System.out.println("Consultando saldo: R$ " + saldo + ", Este é o seu saldo menos 1% de taxa administrativa");
    }
}
