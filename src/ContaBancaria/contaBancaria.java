package ContaBancaria;

public class contaBancaria {

    int numero;
    double saldo;

    public void depositarValor(double valor){
        this.saldo += valor;
    }

    public double sacar (double saque){
        if ((this.saldo >= 0) && (saque <= this.saldo  )){
            this.saldo = this.saldo - saque;
        }else {
            System.out.print(" Saldo insuficiente! ");
        }
        return this.saldo;
    }
    public void exibirSaldo(){
        System.out.print("Novo saldo: " + this.saldo);
    }
}

