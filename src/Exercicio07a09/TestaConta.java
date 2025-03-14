package Exercicio07a09;

import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta minhaConta = new Conta("Felipe Roberto Rocha", 12345, "001-9", 50000.00, "10/02/2024");

        minhaConta.exibirInformacoes();

        System.out.print("\nDigite o valor a sacar: ");
        double saque = scanner.nextDouble();
        minhaConta.saca(saque);
        minhaConta.exibirInformacoes();

        System.out.print("\nDigite o valor a depositar: ");
        double deposito = scanner.nextDouble();
        minhaConta.deposita(deposito);
        minhaConta.exibirInformacoes();

        double rendimento = minhaConta.calculaRendimento();
        System.out.printf("\nO rendimento mensal da conta será de R$ %.2f%n", rendimento);

        scanner.close();
    }
}
