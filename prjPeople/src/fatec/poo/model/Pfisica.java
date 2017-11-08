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
public class Pfisica extends Pessoa {

    private String cpf;
    private double base;
    
    public Pfisica(String cpf, String nome, int ano) {
        super(nome, ano);
        this.cpf = cpf;
    }
    public void setBase(double base) {
        this.base = base;
    }
    
    public String getCpf() {
        return cpf;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double calcBonus(int ano) {
        if(super.getTot() > 12 * 1000){
            int a = 2017 - ano;
            return (base * a);
        }else{
            return (0);
        }
    }
    
    
}
