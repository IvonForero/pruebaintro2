public class Main {
    public static void main(String[] args) {

        Circulo circulo1=new Circulo(5,"azul");

        Cuadrado cuadrado1=new Cuadrado("Amarillo",7);

        System.out.println("El area del circulo1 es : "+ circulo1.calcularArea());

        System.out.println("El area del cuadrado1 es : "+ cuadrado1.calcularArea());


        System.out.println("El del circulo1 es : "+ circulo1.calcularPerimetro());

        System.out.println("El Perimetro  del cuadrado1 es : "+ cuadrado1.calcularPerimetro());

    }
}