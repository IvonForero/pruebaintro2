public class Cuadrado extends Figura{

    double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }


    @Override
    public double calcularArea() {

        return lado*lado;
    }


    @Override
    double calcularPerimetro() {

        return lado*4;
    }
}


