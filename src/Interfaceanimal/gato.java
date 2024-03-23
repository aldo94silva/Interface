package Interfaceanimal;

class gato implements InterfaceAnimal {

    @Override
    public void comer() {
        System.out.println("Comendo");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo");
    }

    @Override
    public void emitirSom() {
        System.out.println("miaaaaauuuu!!!!");
    }

    @Override
    public void definirRaca() {

    }
}
