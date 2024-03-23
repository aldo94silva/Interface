package Interfaceanimal;

class cachorro implements InterfaceAnimal{

    @Override
    public void comer(){
        System.out.println("Comendo");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Auauauauauaau");
    }

    @Override
    public void definirRaca() {

    }
}
