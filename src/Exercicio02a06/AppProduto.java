package Exercicio02a06;

import java.util.Scanner;

public class AppProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto("Batata Ruffles", 14.99, 30);
        produto1.exibirInformacoes();

        System.out.print("\nDigite o novo nome do produto: ");
        String novoNome = scanner.nextLine();
        produto1.setNome(novoNome);

        System.out.print("Digite o novo preço do produto: ");
        double novoPreco = scanner.nextDouble();
        produto1.setPreco(novoPreco);

        System.out.print("Digite a nova quantidade em estoque: ");
        int novaQuantidade = scanner.nextInt();
        produto1.setQuantidadeEmEstoque(novaQuantidade);

        produto1.exibirInformacoes();

        scanner.close();
    }
}