public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public ContaTerminal(String nomeCliente, String agencia, int numero, double saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal("Mario Andrade", "067-8", 1021, 237.48);

        System.out.println("Olá, " + conta.nomeCliente + 
            ", obrigado por criar uma conta em nosso banco. Sua agência é " 
            + conta.agencia + ", conta " + conta.numero + 
            " e seu saldo " + conta.saldo + " já está disponível para saque!");
    }
}
