package Retangulo;

public class classeRetangulo {
    private double base;
    private double altura;

    public classeRetangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularAreaDoRetangulo(){
        return base * altura;
    }
}
