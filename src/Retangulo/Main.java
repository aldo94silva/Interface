package Retangulo;

public class Main {
    public static void main(String[] args) {

        classeRetangulo retangulo = new classeRetangulo(25,25);

        retangulo.setBase(10);
        retangulo.setAltura(10);
        System.out.println("Area: " + retangulo.calcularAreaDoRetangulo());
    }
}
