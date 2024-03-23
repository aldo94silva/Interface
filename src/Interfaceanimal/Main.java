package Interfaceanimal;

public class Main {
    public static void main(String[] args) {

        cachorro cachorro1 = new cachorro();
        cachorro1.comer();
        cachorro1.dormir();
        cachorro1.emitirSom();

        System.out.println();

        gato gato1 = new gato();
        gato1.comer();
        gato1.dormir();
        gato1.emitirSom();
    }
}
