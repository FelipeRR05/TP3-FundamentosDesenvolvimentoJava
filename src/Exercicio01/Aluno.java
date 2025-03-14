package Exercicio01;

import java.util.Arrays;

public class Aluno {
    private String nome;
    private int idade;
    private double[] notas;

    public Aluno(String nome, int idade, double[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String verificarSituacao() {
        double media = calcularMedia();
        return media >= 7 ? "Aprovado" : "Reprovado";
    }

    public void exibirDetalhes() {
        System.out.println("Exercicio01.Aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("Média: " + String.format("%.2f", calcularMedia()));
        System.out.println("Situação: " + verificarSituacao());
    }

    public static void main(String[] args) {
        double[] notas = {8, 6.5, 7, 8.5};
        Aluno aluno1 = new Aluno("Felipe Roberto Rocha", 19, notas);

        aluno1.exibirDetalhes();
    }
}
