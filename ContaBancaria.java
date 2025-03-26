public abstract class ContaBancaria implements Conta{


    String titular;
    String numero;
    String tipo;
    double saldo;
    double valor;

    public ContaBancaria(String titular, String numero, String tipo, double saldo, double valor, TipoConta tipoConta) {
        this.titular = titular;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.valor = valor;
    }
    public void consultarSaldo(){

    }

    public void depositar() {

    }

}
