public abstract class Figura {

    public String color;

    public Figura(String color) {
        this.color = color;
    }

    abstract double calcularArea();

    abstract double calcularPerimetro();
}
