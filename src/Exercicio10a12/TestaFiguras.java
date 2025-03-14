package Exercicio10a12;

public class TestaFiguras {
    public static void main(String[] args) {
        Circulo meuCirculo = new Circulo(3.0);
        double areaCirculo = meuCirculo.calcularArea();

        Esfera minhaEsfera = new Esfera(5.0);
        double volumeEsfera = minhaEsfera.calcularVolume();

        System.out.printf("Círculo de raio %.2f tem área: %.2f%n", meuCirculo.getRaio(), areaCirculo);
        System.out.printf("Esfera de raio %.2f tem volume: %.2f%n", minhaEsfera.getRaio(), volumeEsfera);
    }
}
