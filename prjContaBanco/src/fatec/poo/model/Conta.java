package fatec.poo.model;

/**
 *
 * @author root
 */
public class Conta {

    private int number;
    private double saldo;

    public Conta(int number, double saldo) {
        this.number = number;
        this.saldo = saldo;
    }

    public int getNumber() {
        return number;
    }

    public double getSaldo() {
        return saldo;
    }
    public void sacar(double number){
        saldo -= number;
    }
    public void depositar(double number){
        saldo += number;
    }
}
