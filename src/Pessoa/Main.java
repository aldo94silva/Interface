package Pessoa;

public class Main {
    public static void main(String[] args) {

        pessoa pessoa1 = new pessoa("Ronaldo",35,"323.656.656-65");
        pessoa1.setNome("joão");
        pessoa1.setIdade(48);
        pessoa1.setCpf("323256598");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getCpf());


    }
}
