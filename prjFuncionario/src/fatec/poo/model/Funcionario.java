package fatec.poo.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Funcionario {
    private double SalBase;
    private double TaxComiss;
    private double TotVends;
    
    public void setSalBase(double r){
        this.SalBase = r;
    }
    
    public double getSalBase() {
        return SalBase;
    }

    public double getTaxComiss() {
        return TaxComiss;
    }

    public double getTotVends() {
        return TotVends;
    }
    
    public void addVendas (double vendas){
        
    }
   
    
}
