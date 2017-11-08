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
public abstract class Pessoa {

   // private String cgc;
    private String nome;
    private int ano;
    private double tot;
    
    public Pessoa(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }
    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public double getTot() {
        return tot;
    }
    
    public void addCompras(double c){
        tot += c;
    }
    abstract public double calcBonus(int a);
}
