import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita apenas agência e conta
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Dados fixos
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        // Monta a mensagem final
        String mensagem = "Olá ".concat(nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(String.valueOf(numero))
            .concat(" e seu saldo ")
            .concat(String.valueOf(saldo))
            .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        scanner.close();
    }
}
