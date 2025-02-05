import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite o valor do saque: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCompleto + 
        ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
