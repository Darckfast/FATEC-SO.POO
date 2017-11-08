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
public class Funcionariocomissionario extends Funcionario{
    private double SalBase;
    private double TaxComiss;
    private double TotVendas;
    
    public void setSalBase(double SalBase) {
        this.SalBase = SalBase;
    }
    public double getSalBase() {
        return SalBase;
    }

    public double getTaxComiss() {
        return TaxComiss;
    }

    public double getTotVendas() {
        return TotVendas;
    }
    public Funcionariocomissionario(int registro, String nome, String dtAdmissao , double SalBase) {
        super(registro, nome, dtAdmissao);
        this.SalBase = SalBase;
    }

    @Override
    public double calcSalBruto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
