package Exercicio10a12;

public class Esfera {
    //O raio é a medida principal para definir uma esfera,
    //pois todas as suas propriedades geométricas derivam dele.
    //Na Esfera o raio define o volume da esfera.
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public double getRaio() {
        return raio;
    }
}
