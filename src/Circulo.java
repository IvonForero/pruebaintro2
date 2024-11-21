public class Circulo extends Figura{

    public int radio;

    public Circulo(int radio,String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        return Math.PI*radio*radio;
    }


    @Override
    double calcularPerimetro() {

        return 2*Math.PI*radio;
    }
}
