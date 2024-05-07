import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulacaoBancaria {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double saldo = 0;
        double valorMovimento = 0;
        boolean sistemaRodando = true;

        while (sistemaRodando) {
            //exibirMenu();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    valorMovimento = 0;
                    //System.out.println("Informe o valor a ser depositado:");
                    try {
                        valorMovimento = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        scanner.nextLine();
                        System.out.println("Valor informado deve ser um número!");
                    }
                    saldo += valorMovimento;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    valorMovimento = 0;
                    //System.out.println("Informe o valor a ser sacado:");
                    try {
                        valorMovimento = scanner.nextDouble();
                    } catch (InputMismatchException e) {
                        scanner.nextLine();
                        System.out.println("Valor informado deve ser um número!");
                    }

                    if (valorMovimento > 0 && valorMovimento <= saldo) {
                        saldo -= valorMovimento;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    sistemaRodando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void exibirMenu(){
        System.out.println("Menu de Opções");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Encerrar");
        System.out.println("Escolha uma opção(número):");
    }
}