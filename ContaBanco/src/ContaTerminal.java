import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int conta;
        String agencia;
        double saldo;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite a conta: ");
        conta = sc.nextInt();
        System.out.println("Digite a Agência: ");
        agencia = sc.next();
        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();
        System.out.println("Ola " + nome + " obrigado por criar uma conta em " +
                " nosso banco, sua agência é "
                + agencia + " conta  " + conta + " e seu saldo  " + saldo +
                "  já está disponível para saque" );


    }
}