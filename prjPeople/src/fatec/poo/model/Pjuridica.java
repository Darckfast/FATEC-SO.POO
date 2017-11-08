/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;
/**
 *
 * @author root
 */
public class Pjuridica extends Pessoa {

    private String cgc;
    private double tax;
    
    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }
     public Pjuridica(String cgc, String nome, int ano) {
        super(nome,ano);
        this.cgc = cgc;
    }
    @Override
    public double calcBonus(int ano) {
        double a = ((super.getTot() * tax) * (2017 - ano));
        return (a);
    }
}
