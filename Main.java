public class Main {

    public static void main(String[] args) {

        // conta corrente 1
       ContaCorrente Naruto = new ContaCorrente("Naruto Uzumaki", 1234,"ContaCorrente", 200, 100, TipoConta.ContaCorrente);
       Naruto.depositar();
       Naruto.consultarSaldo();

       // conta poupança 1
        ContaPoupança Sasuke = new ContaPoupança("Sasuke Uchiha", 1235,"ContaPoupança", 0,100, TipoConta.ContaPoupanca);
        Sasuke.depositar();
        Sasuke.consultarSaldo();

    }
}
