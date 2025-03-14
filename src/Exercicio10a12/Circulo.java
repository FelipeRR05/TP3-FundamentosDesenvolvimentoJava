package Exercicio10a12;

public class Circulo {
    //O raio é a medida principal para definir uma esfera,
    //pois todas as suas propriedades geométricas derivam dele.
    //No Círculo o raio é usado para calcular a área.
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }
}
