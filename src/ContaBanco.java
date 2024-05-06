import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o número da AGÊNCIA:");
        agencia = scanner.next();

        System.out.println("Por favor digite o número da CONTA:");
        numero = scanner.nextInt();
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o nome do Titular da Conta:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o Saldo incial do Conta:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua AGÊNCIA é " + agencia + ", CONTA " + numero + " e seu saldo " + saldo + " já esta disponível para saque.");
    }
}
